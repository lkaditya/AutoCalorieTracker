package sg.edu.iss.app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
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

	@Override
	public List<DailyHistory> findAll(){
		List<DailyHistory> dailyHistories = historyrepo.findAll();
		return dailyHistories;

	}

	@Override
	@Transactional
	public List<DailyHistory> findRecordByUserID(long id) {
		return historyrepo.findRecordByUserID(id);
	}

	@Override
	public DailyHistory findRecordByIdAndDate(long id, LocalDate date) {
		return historyrepo.findRecordByData(id,date);
	}

}
