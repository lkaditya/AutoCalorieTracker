package sg.edu.iss.app.service;

import java.time.LocalDate;

import sg.edu.iss.app.model.DailyHistory;

public interface DailyHistoryService {
	
	public DailyHistory findHistoryByEmailandDate(String email, LocalDate date);

	public void save(DailyHistory hist);

}
