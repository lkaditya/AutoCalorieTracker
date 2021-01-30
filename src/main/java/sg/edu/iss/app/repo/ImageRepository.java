package sg.edu.iss.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sg.edu.iss.app.model.FoodImage;

import java.util.List;

public interface ImageRepository extends JpaRepository<FoodImage, Long> {
	
    @Query("select f from FoodImage as f where f.dailyHistory.id=:id")
	public List<FoodImage> findAllById(@Param("id") Long id);



}
