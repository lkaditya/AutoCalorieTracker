package sg.edu.iss.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sg.edu.iss.app.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
