package com.example.web01.service;

import com.example.web01.domain.Todo;
import com.example.web01.repository.TodoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor    //(주의) final 인 객체만 적용할 수 있다
public class TodoService {
    private final TodoRepository todoRepository;

    @Transactional(readOnly = true)
    public List<Todo> getTodos(){
        return todoRepository.findAll(Sort.by("id").descending());
    }

    @Transactional
    public Todo addTodo(String todo){
        return todoRepository.save(new Todo(todo));
    }

    @Transactional
    public Todo updateTodo(Long id){
        Todo todo = todoRepository.findById(id)
                .orElseThrow(()->new EntityNotFoundException("id에 해당되는 todo를 찾을 수 없습니다: "+id));
        todo.setDone(!todo.isDone());
        return todo;
    }

    @Transactional
    public void deleteTodo(Long id){
        if(!todoRepository.existsById(id)){
            throw new RuntimeException("id에 해당하는 todo가 없어요."+id);
        }
        todoRepository.deleteById(id);
    }
}
