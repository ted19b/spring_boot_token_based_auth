package de.hitech4every1.token_auth.service;

import de.hitech4every1.token_auth.exception.TaskNotFoundException;
import de.hitech4every1.token_auth.model.Task;
import de.hitech4every1.token_auth.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasksFromDB() {
        return taskRepository.findAll();
    }

    public Task getOneTaskInDB(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
    }

    public Task addNewTaskInDB(Task newTask) {
        return taskRepository.save(newTask);
    }

    public Task updateOneTaskInDB(Task newTask, Long id){
        return taskRepository.findById(id)
                .map(task -> {
                    task.setName(newTask.getName());
                    task.setDescription(newTask.getDescription());
                    return taskRepository.save(task);
                })
                .orElseGet(() -> {
                    newTask.setId(id);
                    return taskRepository.save(newTask);
                });
    }


    public void deleteOneTaskInDB(Long id) {
        taskRepository.deleteById(id);
    }

}
