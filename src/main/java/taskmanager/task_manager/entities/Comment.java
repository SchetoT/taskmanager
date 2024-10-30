package taskmanager.task_manager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "comments")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;

    private LocalDateTime commentDate;
}
