package sg.edu.iss.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findUserByEmail(String email);

	User findUserbyId(long id);

	@Query("Select x from User x where x.email=:mail and x.password =:pass")
	User findUserByEmailAndPassword(@Param("mail") String email, @Param("pass") String password);

	@Query("Select u from User u where u.email=:mail and u.id =:id")
	User findUserById(@Param("id") long Id, @Param("email") String email);

    User findById(long l);
}
