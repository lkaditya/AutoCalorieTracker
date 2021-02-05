package sg.edu.iss.app.service;

import sg.edu.iss.app.model.DietPlan;

import java.time.LocalDate;


public interface DietPlanService {
    void savePlan(DietPlan dietPlan);

    DietPlan findByDate(LocalDate date, long id);
}
