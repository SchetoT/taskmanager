package taskmanager.task_manager.controllers;

import taskmanager.task_manager.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import taskmanager.task_manager.services.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<taskmanager.task_manager.entities.User> user = userService.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PutMapping("/update")
    public User updateClient(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> user = userService.getAllUsers();
        return ResponseEntity.ok(user);
    }

}

