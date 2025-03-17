package com.example.board.controller;

import com.example.board.domain.Board;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

//    @GetMapping("/list")
//    public String list(Model model){
//        model.addAttribute("boards",boardService.findAllBoard());
//        return "boards/list";
//    }

    @GetMapping("/list")
    public String list(Model model,
                       @RequestParam(name="page", required = false, defaultValue = "1") int page,
                       @RequestParam(name="size", required = false, defaultValue = "5") int size){
        Pageable pageable = PageRequest.of(page-1,size);
        model.addAttribute("boards",boardService.findAllBoard(pageable));
        model.addAttribute("currentPage",page);
        return "boards/list";
    }

    @GetMapping("/add")
    public String addForm(Model model){
        model.addAttribute("board",new Board());
        return "boards/writeform";
    }

    @PostMapping("/add")
    public String addBoard(@ModelAttribute Board board){
        boardService.addBoard(board);
        return "redirect:/boards/list";
    }

    @GetMapping("/{id}")
    public String viewBoard(@PathVariable(name="id")Long id, Model model){
        model.addAttribute("board",boardService.findBoardById(id));
        return "boards/view";
    }

    @GetMapping("/updateform/{id}")
    public String updateForm(@PathVariable("id")Long id, Model model){
        model.addAttribute("board",boardService.findBoardById(id));
        return "boards/updateform";
    }

    @PostMapping("/updateform")
    public String update(@ModelAttribute Board board, @RequestParam(name="password") String password, @RequestParam(name="createdAt") LocalDateTime createdAt){
        //입력일 set
        //board.setCreatedAt(createdAt);
        System.out.println(createdAt);

        if(password.equals(boardService.findBoardById(board.getId()).getPassword())){
            boardService.updateBoard(board);
            return "redirect:/boards/list";
        }else{
            //model.addAttribute("error","비밀번호를 다시 입력하십시오.");
            System.out.println("password failed");
            return "redirect:/boards/list";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        boardService.deleteBoardById(id);
        return "redirect:/boards/list";
    }

    @GetMapping("/deleteform/{id}")
    public String deleteForm(@PathVariable("id")Long id, Model model){
        model.addAttribute("board",boardService.findBoardById(id));
        return "boards/deleteform";
    }

//    @GetMapping("/deleteform/{id}")
//    public String deleteform(@PathVariable("id") Long id){
//        return "redirect:/boards/deleteform";
//    }

//    @PostMapping("/deleteform/{id}")
//    public String delete(@ModelAttribute Board board){
//        System.out.println("delete:::::::::::::::::::::");
//        return "redirect:/boards/deleteform";
//    }
}
