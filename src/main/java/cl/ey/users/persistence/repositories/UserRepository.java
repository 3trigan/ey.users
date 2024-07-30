package cl.ey.users.persistence.repositories;


import cl.ey.users.persistence.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {

    @Query("SELECT u FROM User u WHERE u.email=?1")
    User findByEmail(String email);
}
