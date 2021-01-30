package sg.edu.iss.app.service;

import java.time.LocalDate;
import java.util.List;

import sg.edu.iss.app.model.DailyHistory;

public interface DailyHistoryService {
	
	public DailyHistory findHistoryByEmailandDate(String email, LocalDate date);

	public void save(DailyHistory hist);

	public List<DailyHistory> findAll();

	public List<DailyHistory> findRecordByUserID(long id);

	public DailyHistory findRecordByIdAndDate(long id, LocalDate date);
}
