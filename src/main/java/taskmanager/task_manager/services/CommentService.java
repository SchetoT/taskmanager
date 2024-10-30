package taskmanager.task_manager.services;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taskmanager.task_manager.entities.Comment;
import taskmanager.task_manager.repositories.CommentRepository;

import java.util.List;
@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public Comment findById(Long id) {
        return commentRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        commentRepository.deleteById(id);
    }

    public void updateComment(Comment comment) {
        commentRepository.save(comment);
    }
    public List<Comment> getAllComment() {
        return commentRepository.findAll();
    }
}
