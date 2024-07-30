package cl.ey.users.services.user;

import cl.ey.users.persistence.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface UserService {
    List<User> findAll();

    Optional<User> findById(UUID id);

    User save(User user);

    Optional<User> delete(User user);

    User findUserByEmail(String email);
}
