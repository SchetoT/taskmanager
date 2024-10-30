package taskmanager.task_manager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tasks")
public class Task {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String tittle;

    private String description;

    private LocalDateTime dateTime;

    private String status;
}
