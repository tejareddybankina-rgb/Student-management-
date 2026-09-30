package com.example.taskapp.service;

import com.example.taskapp.entity.Task;
import com.example.taskapp.repository.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Task findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Task not found"));
    }

    public Task create(Task task) {
        task.setId(null);
        return repository.save(task);
    }

    public Task update(Long id, Task incoming) {
        Task task = findById(id);
        task.setTitle(incoming.getTitle());
        task.setDescription(incoming.getDescription());
        task.setStatus(incoming.getStatus());
        return repository.save(task);
    }

    public void delete(Long id) {
        Task task = findById(id);
        repository.delete(task);
    }
}
