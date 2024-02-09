package org.mendel.todoappbackendenglish;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mendel.todoappbackendenglish.controller.TodoController;
import org.mendel.todoappbackendenglish.model.Todo;
import org.mendel.todoappbackendenglish.service.TodoService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

/*
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TodoControllerTest {

    @Mock
    private TodoService todoService;

    @InjectMocks
    private TodoController todoController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllTodos() throws Exception {
        Todo todo1 = new Todo();
        Todo todo2 = new Todo();
        List<Todo> todos = Arrays.asList(todo1, todo2);
        when(todoService.getAllTodos()).thenReturn(todos);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/todos")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].title").value(todo1.getTitle()))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].title").value(todo2.getTitle()));
    }

    @Test
    public void testGetTodoById() throws Exception {
        Todo todo = new Todo();
        when(todoService.getTodoById(1L)).thenReturn(Optional.of(todo));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/todos/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.title").value(todo.getTitle()));
    }

    @Test
    public void testCreateTodo() throws Exception {
        Todo todo = new Todo();
        when(todoService.createTodo(any(Todo.class))).thenReturn(todo);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/todos")
                        .content("{}")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.title").value(todo.getTitle()));
    }

    @Test
    public void testUpdateTodo() throws Exception {
        Todo updatedTodo = new Todo();
        when(todoService.updateTodo(eq(1L), any(Todo.class))).thenReturn(updatedTodo);

        mockMvc.perform(MockMvcRequestBuilders.put("/api/todos/1")
                        .content("{}")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.title").value(updatedTodo.getTitle()));
    }

    @Test
    public void testDeleteTodoById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/todos/1"))
                .andExpect(MockMvcResultMatchers.status().isNoContent());

        verify(todoService, times(1)).deleteTodoById(1L);
    }
}
*/
