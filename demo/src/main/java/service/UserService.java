package service;

import entity.User;
import repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public User saveUser(User user) {
        logger.info("Saving user: {}", user.getEmail());
        return repo.save(user);
    }
    public User getUserById(Long id) {
        logger.info("Fetching user with id: {}", id);
        return repo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public void deleteUser(Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("User not found");
        }
        repo.deleteById(id);
    }

    public User updateUser(Long id, User user) {
        User existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(user.getName());
            existing.setEmail(user.getEmail());
            return repo.save(existing);
        }

        return null;
    }

    public List<User> getAllUsers() {
        logger.info("Fetching all users");
        return repo.findAll();
    }
}