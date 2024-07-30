package cl.ey.users.services.phone;

import cl.ey.users.persistence.entities.Phone;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PhoneService {
    List<Phone> findAll();

    Optional<Phone> findById(Long id);

    Phone save(Phone phone);

    Optional<Phone> delete(Phone phone);
}
