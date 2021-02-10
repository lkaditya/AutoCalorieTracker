package sg.edu.iss.app.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.app.model.FoodImage;

public interface ImageRepository extends JpaRepository<FoodImage, Long> {
	
    @Query("select f from FoodImage as f where f.dailyHistory.id=:id")
    List<FoodImage> findAllById(@Param("id") Long id);

    @Query("select f from FoodImage f where f.dailyHistory.date=:today and f.dailyHistory.user.email=:mail")
    List<FoodImage> findAllByDateAndName(@Param("today") LocalDate date, @Param("mail") String email);

	@Query("select f from FoodImage f where f.food.calorie <=:limit and f.dailyHistory is null")
    public List<FoodImage> findAllUniqueByCalories(@Param("limit") double remainder);
	
	@Query("select SUM(f.calorie) from FoodImage f where f.dailyHistory.id =:id GROUP BY f.dailyHistory.id")
	public Integer findTotalCaloriesById(@Param("id") Long id);

}
