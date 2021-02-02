package sg.edu.iss.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sg.edu.iss.app.model.DietPlan;
import sg.edu.iss.app.repo.DietPlanRepository;

import java.time.LocalDate;

@Service
public class DietPlanImplement implements DietPlanService{
    @Autowired
    DietPlanRepository dietPlanRepository;

    @Override
    public void savePlan(DietPlan dietPlan) {
        dietPlanRepository.save(dietPlan);
    }

    @Override
    public DietPlan findByDate(LocalDate date,long id) {
        return dietPlanRepository.findByDate(date,id);
    }
}
