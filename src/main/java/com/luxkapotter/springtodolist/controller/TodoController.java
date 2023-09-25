package com.luxkapotter.springtodolist.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxkapotter.springtodolist.entity.Todo;
import com.luxkapotter.springtodolist.service.TodoService;

@RestController
@RequestMapping(value = "/todos")
public class TodoController {
    private final TodoService todoService;

    TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    ResponseEntity<List<Todo>> create(@RequestBody Todo todo){
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(todoService.create(todo));
    }

    @GetMapping
    List<Todo> list(){
        return todoService.list();
    }

    @PutMapping("{id}")
    List<Todo> update(@PathVariable Long id, @RequestBody Todo todo){
        return todoService.update(id, todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable Long id){
        return todoService.delete(id);
    }
    
}
