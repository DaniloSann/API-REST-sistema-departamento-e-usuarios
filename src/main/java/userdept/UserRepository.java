package userdept;

import entities.User;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import java.util.List;

public interface UserRepository extends JpaRepositoryExtension<User, Long> {
    List<User> findAll();
}
