package sg.edu.iss.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sg.edu.iss.app.model.DietPlan;

import java.time.LocalDate;

public interface DietPlanRepository extends JpaRepository<DietPlan, Long> {

    @Query("select d from DietPlan d where d.date=:date and d.user.Id=:id")
    DietPlan findByDate(@Param("date") LocalDate date, long id);
}
