package sang.myproject.server.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sang.myproject.server.model.User;
import sang.myproject.server.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
