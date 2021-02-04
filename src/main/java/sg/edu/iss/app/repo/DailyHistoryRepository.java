package sg.edu.iss.app.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.app.model.DailyHistory;

public interface DailyHistoryRepository extends JpaRepository<DailyHistory, Long> {

	@Query("select x from DailyHistory x where x.date=:time and x.user.email=:mail")
	DailyHistory findRecordByEmailandDate(@Param("mail")String email,@Param("time")LocalDate date);


	@Query("select d from DailyHistory d where d.user.Id=:id")
	List<DailyHistory> findRecordByUserID(@Param("id") Long id);

	@Query("select d from DailyHistory d where d.date=:date and d.user.Id=:id ")
	DailyHistory findRecordByData(@Param("id") Long id , @Param("date") LocalDate date);
	
	@Query("select d.id from DailyHistory d where d.date=:date and d.user.Id=:id ")
	int findIdByIdAndDate(@Param("id") Long id , @Param("date") LocalDate date);
}
