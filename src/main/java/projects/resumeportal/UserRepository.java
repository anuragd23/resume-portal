package projects.resumeportal;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.resumeportal.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
