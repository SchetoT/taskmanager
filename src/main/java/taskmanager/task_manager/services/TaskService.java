package taskmanager.task_manager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taskmanager.task_manager.entities.Task;
import taskmanager.task_manager.repositories.TaskRepository;

import java.util.List;
import java.util.Optional;
@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask (Task task) {
        return taskRepository.save(task);
    }
    public List<Task> getAllTasks () {
        return taskRepository.findAll();
    }
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }
    public void deleteTask (Long id){
        taskRepository.deleteById(id);
    }
    public Task updateTask (Task task){
        return taskRepository.save(task);
    }


}
