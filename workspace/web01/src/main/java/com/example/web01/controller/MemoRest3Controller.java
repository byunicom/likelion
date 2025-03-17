package com.example.web01.controller;

import com.example.web01.domain.Memo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api3/memos")
public class MemoRest3Controller {
    private final Map<Long, Memo> memos = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    @PostMapping
    public Long createMemo(@RequestBody Memo memo){
        Long id = counter.incrementAndGet();
        memo.setId(id);
        memos.put(id,memo);
        return id;
    }
//
//    @GetMapping("/{id}")
////    public Memo getMemo(@PathVariable("id") Long id){
////        return memos.getOrDefault(id,null);
////    }
///
    @GetMapping
    public List<Memo> getMemos(){
        return new ArrayList<>(memos.values());
    }

    @GetMapping("/{id}")
    public Memo getMemo(@PathVariable("id") Long id){
        return memos.getOrDefault(id,null);
    }

    @PutMapping("/{id}")
    public String updateMemo(@PathVariable("id") Long id, @RequestBody Memo memo){
        if(!memos.containsKey(id)){
            return "해당 메모를 찾을 수 없습니다.";
        }
        memo.setId(id);
        memos.put(id,memo);
        return "메모 수정 성공";
    }

    @DeleteMapping("/{id}")
    public String deleteMemo(@PathVariable("id") Long id){
        if(memos.remove(id)==null){
            return "해당 메모를 찾을 수 없습니다.";
        }
        return "메모 삭제 성공";
    }

}
