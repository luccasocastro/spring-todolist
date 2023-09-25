package com.luxkapotter.springtodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luxkapotter.springtodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
