package de.hitech4every1.token_auth.repository;

import de.hitech4every1.token_auth.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
