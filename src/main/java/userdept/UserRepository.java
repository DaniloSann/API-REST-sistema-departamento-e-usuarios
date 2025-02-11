package userdept;

import entities.User;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

public interface UserRepository extends JpaRepositoryExtension<User, Long> {
}
