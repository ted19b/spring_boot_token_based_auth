package de.hitech4every1.token_auth.repository;

import de.hitech4every1.token_auth.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
}
