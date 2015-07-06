package medical_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	
	private dao dao;
	
	@Autowired
	public void setDao(dao dao) {
		this.dao = dao;
	}
	
	public void testService(client client) {
		dao.testDao(client);
	}
	
}
