package org.mendel.todoappbackendenglish.service;

import org.mendel.todoappbackendenglish.model.Todo;
import org.mendel.todoappbackendenglish.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class responsible for handling business logic related to Todo entities.
 */
@Service
public class TodoService {

    private final TodoRepository todoRepository;

    /**
     * Constructor injection of TodoRepository.
     *
     * @param todoRepository Repository for accessing and managing Todo entities.
     */
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    /**
     * Retrieves all todos from the database.
     *
     * @return List of all todos.
     */
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    /**
     * Retrieves a todo by its unique identifier.
     *
     * @param id Unique identifier of the todo to retrieve.
     * @return Optional containing the todo if found, otherwise empty.
     */
    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    /**
     * Creates a new todo and saves it to the database.
     *
     * @param todo Todo object representing the todo to be created.
     * @return The created todo.
     */
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    /**
     * Updates an existing todo with the provided data.
     *
     * @param id          Unique identifier of the todo to update.
     * @param updatedTodo Todo object containing updated data.
     * @return The updated todo.
     * @throws IllegalArgumentException if no todo is found with the specified id.
     */
    public Todo updateTodo(Long id, Todo updatedTodo) {
        Optional<Todo> existingTodoOptional = todoRepository.findById(id);
        if (existingTodoOptional.isPresent()) {
            Todo existingTodo = existingTodoOptional.get();
            existingTodo.setTitle(updatedTodo.getTitle());
            existingTodo.setDescription(updatedTodo.getDescription());
            existingTodo.setCompleted(updatedTodo.isCompleted());
            return todoRepository.save(existingTodo);
        } else {
            throw new IllegalArgumentException("Todo not found with id: " + id);
        }
    }

    /**
     * Deletes a todo by its unique identifier.
     *
     * @param id Unique identifier of the todo to delete.
     * @throws IllegalArgumentException if no todo is found with the specified id.
     */
    public void deleteTodoById(Long id) {
        if (todoRepository.existsById(id)) {
            todoRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Todo not found with id: " + id);
        }
    }
}
