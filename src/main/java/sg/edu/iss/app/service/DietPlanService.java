package sg.edu.iss.app.service;

import sg.edu.iss.app.model.DietPlan;

import java.time.LocalDate;


public interface DietPlanService {
    public void savePlan(DietPlan dietPlan);

    public DietPlan findByDate(LocalDate date,long id);
}
