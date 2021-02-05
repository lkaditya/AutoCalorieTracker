package sg.edu.iss.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sg.edu.iss.app.model.Activity;
import sg.edu.iss.app.repo.ActivityRepository;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityRepository activityRepository;


    @Override
    public List<Activity> findAll() {
        return activityRepository.findAll();
    }
}
