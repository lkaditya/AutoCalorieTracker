package sg.edu.iss.app.service;

import java.time.LocalDate;
import java.util.List;

import sg.edu.iss.app.model.DailyHistory;

public interface DailyHistoryService {
	
	DailyHistory findHistoryByEmailandDate(String email, LocalDate date);

	void save(DailyHistory hist);

	List<DailyHistory> findAll();

	List<DailyHistory> findRecordByUserID(long id);

	DailyHistory findRecordByIdAndDate(long id, LocalDate date);
}
