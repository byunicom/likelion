package com.example.web01.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api2/memos")
public class MemoRest2Controller {
    private final Map<Long, String> memos = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();


    @PostMapping
    public Long createMemo(@RequestBody String content){
        Long id = counter.incrementAndGet();
        memos.put(id,content);
        return id;
    }

    @GetMapping
    public Map<Long,String> getMemos(){
        return memos;
    }

    @GetMapping("/{id}")
    public String getMemo(@PathVariable("id") Long id){
        return memos.getOrDefault(id,"해당 메모를 찾을수가 없어요.");
    }

    @PutMapping("/{id}")
    public String updateMemo(@PathVariable("id") Long id, @RequestBody String content){
        if(!memos.containsKey(id)){
            return "해당 메모를 찾을 수 없어요.";
        }
        memos.put(id,content);
        return "메모 수정 성공";
    }

    @DeleteMapping("/{id}")
    public String deleteMemo(@PathVariable("id") Long id){
        if(memos.remove(id)==null){
            return "해당 메모를 찾을 수 없어요.";
        }
        return "메모 삭제 성공";
    }


}
