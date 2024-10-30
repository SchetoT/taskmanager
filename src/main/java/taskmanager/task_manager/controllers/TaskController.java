package taskmanager.task_manager.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import taskmanager.task_manager.entities.Task;
import taskmanager.task_manager.services.TaskService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/register")
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @GetMapping("/alltasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("{id}")
    public Task getTaskById(Long id) {
        Optional<Task> task = taskService.getTaskById(id);
        if (task.isPresent()) {
            return task.get();
        } else {
            throw new RuntimeException("Task not found for id :: " + id);
        }

    }

    @PutMapping("/update")
    public Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping("{id}")
    public void deleteTask(Long id) {
        taskService.deleteTask(id);
    }
}
