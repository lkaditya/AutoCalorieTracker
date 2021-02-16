package sg.edu.iss.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.app.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

	List<Food> findAll();
	
	@Query("Select x from Food x where x.name =:name")
	Food findFoodByName(@Param("name") String name);
	
	@Query("Select x from Food x where x.name in (:name) ")
	Food findSimilarFoodByName(@Param("name") List<String> name);
	
	Food findByNameContains(String name);

	@Query("Select x from Food x join x.foodImage as f where f.id =:id")
	Food findFoodById(@Param("id") Long id);
}
