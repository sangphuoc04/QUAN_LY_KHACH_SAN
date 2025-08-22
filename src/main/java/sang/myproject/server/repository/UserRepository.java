package sang.myproject.server.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import sang.myproject.server.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
