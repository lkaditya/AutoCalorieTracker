package sg.edu.iss.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findUserByEmail(String email);

}
