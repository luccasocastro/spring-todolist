package com.luxkapotter.springtodolist;

import java.util.ArrayList;
import java.util.List;

import com.luxkapotter.springtodolist.entity.Todo;

public class TestConstants {
  public static final List<Todo> TODOS = new ArrayList<>() {
    {
      add(new Todo(9995L, "@luccasocastro", "bla bla bla", false, 1));
      add(new Todo(9996L, "@luccasocastro", "bla bla bla", false, 1));
      add(new Todo(9997L, "@luccasocastro", "bla bla bla", false, 1));
      add(new Todo(9998L, "@luccasocastro", "bla bla bla", false, 1));
      add(new Todo(9999L, "@luccasocastro", "bla bla bla", false, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);
}
