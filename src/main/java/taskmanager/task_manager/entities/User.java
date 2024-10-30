package taskmanager.task_manager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String password;

    private String rol;

}
