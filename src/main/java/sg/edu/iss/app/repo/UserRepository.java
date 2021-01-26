package sg.edu.iss.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.iss.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
