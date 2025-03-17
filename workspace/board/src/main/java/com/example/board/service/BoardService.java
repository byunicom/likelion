package com.example.board.service;

import com.example.board.domain.Board;
import com.example.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

//    @Transactional(readOnly = true)
//    public Iterable<Board> findAllBoard(){
//        return boardRepository.findAll();
//    }

    @Transactional(readOnly = true)
    public Page<Board> findAllBoard(Pageable pageable){
        Pageable pageable1 = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by(Sort.Direction.DESC, "id"));
        return boardRepository.findAll(pageable1);
    }


    public Board addBoard(Board board) {

        board.setCreatedAt(LocalDateTime.now());
        board.setUpdatedAt(LocalDateTime.now());

        return boardRepository.save(board);
    }

    public Board updateBoard(Board board){
        board.setCreatedAt(board.getCreatedAt());

        board.setUpdatedAt(LocalDateTime.now());
        System.out.println("createdAt : " +board.getCreatedAt());
        return boardRepository.save(board);
    }

    @Transactional(readOnly = true)
    public Board findBoardById(Long id){
        return boardRepository.findById(id).orElse(null);
    }

    @Transactional
    public void deleteBoardById(Long id){
        boardRepository.deleteById(id);
    }
}
