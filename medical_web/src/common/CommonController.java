package common;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import model.Hosuser;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {
	@RequestMapping("/joinmember")
	public String inserthosuser(HttpServletRequest request, @ModelAttribute("command") @Valid Hosuser hosuser,  
			@RequestParam("user_passconfirm") String user_passconfirm, BindingResult errors) throws Exception{
		String uploadDir = request.getRealPath("upload");
		if (errors.hasErrors()) {
			return "/join.jsp";
		}
		if (!hosuser.getUser_photo().isEmpty()) {
			String filename = hosuser.getUploadFile().getOriginalFilename();
			hosuser.setUser_photo(filename);
			
			hosuser.getUploadFile().transferTo(new File(uploadDir, filename));
		}
		return "login.html";
		
	}
}
