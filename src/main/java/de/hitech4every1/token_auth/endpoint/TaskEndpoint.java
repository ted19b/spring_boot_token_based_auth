package de.hitech4every1.token_auth.endpoint;


import de.hitech4every1.token_auth.model.Task;
import de.hitech4every1.token_auth.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tasks/api/v1.0")
public class TaskEndpoint {

    @Autowired
    private TaskService taskService;

    @GetMapping
    List<Task> getAllTasks() {
        return taskService.getAllTasksFromDB();
    }

    @PostMapping
    Task addNewTask(@RequestBody Task newTask) {
        return taskService.addNewTaskInDB(newTask);
    }

    // Single item
    @GetMapping("/{id}")
    Task getOneTaskWithId(@PathVariable Long id) {
        return taskService.getOneTaskInDB(id);
    }

    @PutMapping("/{id}")
    Task updateTask(@RequestBody Task newTask, @PathVariable Long id) {
        return taskService.updateOneTaskInDB(newTask, id);
    }

    @DeleteMapping("/{id}")
    void deleteTask(@PathVariable Long id) {
        taskService.deleteOneTaskInDB(id);
    }

}
