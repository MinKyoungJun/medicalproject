package medical_web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {
	
	private service service;
	
	@Autowired
	public void setService(service service) {
		this.service = service;
	}
	
	@RequestMapping("/test")
	public void testDb(client client){
		System.out.println("hi");
		service.testService(client);
	
		
	}

}
