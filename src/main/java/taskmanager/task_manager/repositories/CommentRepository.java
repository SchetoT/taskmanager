package taskmanager.task_manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import taskmanager.task_manager.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
