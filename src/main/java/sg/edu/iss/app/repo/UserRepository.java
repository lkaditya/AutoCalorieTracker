package sg.edu.iss.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("Select x from User x where x.email=:mail")
	public User findUserByemail(@Param("mail")String email);

	@Query("Select x from User x where x.email=:mail and x.password =:pass")
	public User findUserByemailAndPassword(@Param("mail")String email,@Param("pass")String password);
	
	@Query("Select u.id from User u where u.email=:email")
	public int findUserIdByEmail(@Param("email")String email);

}
