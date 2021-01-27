package sg.edu.iss.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.app.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

	@Query("Select x from Food x where x.name =:name")
	public Food findFoodByName(@Param("name")String name);
}
