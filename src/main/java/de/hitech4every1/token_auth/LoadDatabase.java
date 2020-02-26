package de.hitech4every1.token_auth;


import de.hitech4every1.token_auth.model.Task;
import de.hitech4every1.token_auth.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(TaskRepository taskRepository) {
        return args -> {
            log.info("Preloading " + taskRepository.save(new Task("debugging", "chek error on the app")));
            log.info("Preloading " + taskRepository.save(new Task("Coding", "add login feature")));
            log.info("Preloading " + taskRepository.save(new Task("Coding", "add registration feature")));
            log.info("Preloading " + taskRepository.save(new Task("debugging", "look for error in security")));
            log.info("Preloading " + taskRepository.save(new Task("documentation", "draw a diagramm to show app flow")));
            log.info("Preloading " + taskRepository.save(new Task("testing", "add test for login")));
        };
    }
}
