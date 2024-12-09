package taskmanager.task_manager.Auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import taskmanager.task_manager.entities.User;

@Service
public class JwtService {
    public String getToken(UserDetails user){
        return null;
    }
}
