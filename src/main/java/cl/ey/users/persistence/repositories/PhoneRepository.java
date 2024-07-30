package cl.ey.users.persistence.repositories;

import cl.ey.users.persistence.entities.Phone;
import org.springframework.data.repository.CrudRepository;


public interface PhoneRepository extends CrudRepository<Phone,Long> {
}
