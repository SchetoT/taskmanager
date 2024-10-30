package taskmanager.task_manager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taskmanager.task_manager.entities.User;
import taskmanager.task_manager.repositories.UserRepository;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public Optional<User> findById(long Id) {
        return userRepository.findById(Id);
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
