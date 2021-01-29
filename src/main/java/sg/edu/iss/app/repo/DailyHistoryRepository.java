package sg.edu.iss.app.repo;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.app.model.DailyHistory;

public interface DailyHistoryRepository extends JpaRepository<DailyHistory, Long> {

	@Query("select x from DailyHistory x where x.date=:time and x.user.email=:mail")
	DailyHistory findRecordByEmailandDate(@Param("mail")String email,@Param("time")LocalDate date);
}
