package sg.edu.iss.app.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.iss.app.model.DailyHistory;
import sg.edu.iss.app.repo.DailyHistoryRepository;

@Service
public class DailyHistoryServiceImplementation implements DailyHistoryService {

	@Autowired
	private DailyHistoryRepository historyrepo;

	@Override
	public DailyHistory findHistoryByEmailandDate(String email, LocalDate date) {
		DailyHistory h=historyrepo.findRecordByEmailandDate(email, date);
		if(h!=null) {
			return h;
		}
		return null;
	}

	@Override
	public void save(DailyHistory hist) {
		historyrepo.save(hist);
	}

}
