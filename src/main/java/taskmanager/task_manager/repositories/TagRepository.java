package taskmanager.task_manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import taskmanager.task_manager.entities.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
}
