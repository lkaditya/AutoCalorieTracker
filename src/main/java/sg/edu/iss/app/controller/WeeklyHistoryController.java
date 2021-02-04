package sg.edu.iss.app.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.iss.app.model.DailyHistory;
import sg.edu.iss.app.model.FoodImage;
import sg.edu.iss.app.service.DailyHistoryService;
import sg.edu.iss.app.service.DailyHistoryServiceImplementation;
import sg.edu.iss.app.service.ImageService;
import sg.edu.iss.app.service.UserService;

@RequestMapping("/weekly")
@RestController
public class WeeklyHistoryController {

    @Autowired
    private DailyHistoryService dailyHistoryService;
    
    @Autowired
    private ImageService imageService;
    
    @Autowired
    private UserService userService;
    
	@Autowired
	public void setHistoryImplementation(DailyHistoryServiceImplementation historyImpl) {
		this.dailyHistoryService = historyImpl;
	}
	
    @RequestMapping("/getDailyCalories")
    public List<Integer> getHistory(@RequestParam("date")String date,@RequestParam("email")String email){
    	Long id = (long) userService.findUserIdByEmail(email);
    	
    	
    	DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	LocalDate date1=LocalDate.parse(date,df);
    	date1=LocalDate.of(2021, 01, 28); //temporary
    	
    	
		List<Integer> listOfDailyHistoryId = new ArrayList<>();
		listOfDailyHistoryId = dailyHistoryService.getSomething(id, date1);
		

		//get calories for each historyId
		List<Integer> listOfDailyHistoryCalories = new ArrayList<>();
		for(int i=6;i>=0;i--) {
			listOfDailyHistoryCalories.add(imageService.findTotalCaloriesByDailyHistoryId(listOfDailyHistoryId.get(i)));
		}
		
		return listOfDailyHistoryCalories;
    }
//    @RequestMapping("/getDailyCalories")
//    public List<Integer> getHistory(LocalDate lastDate){
//		List<Integer> listOfDailyHistoryId = new ArrayList<>();
//		listOfDailyHistoryId = dailyHistoryService.getSomething((long) 1, LocalDate.of(2021, 01, 28));
//		
//
//		
//		//get calories for each historyId
//		List<Integer> listOfDailyHistoryCalories = new ArrayList<>();
//		for(int i=0;i<7;i++) {
//			
//		}
//		
//		return listOfDailyHistoryId;
//    }
	
	
}
