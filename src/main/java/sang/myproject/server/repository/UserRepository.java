package sang.myproject.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sang.myproject.server.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
