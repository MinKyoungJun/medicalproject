package model;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.multipart.MultipartFile;

@Validated
public class Hosuser implements Serializable{
	@Pattern(regexp = "^[a-z0-9_]{3,12}$", message = "아이디는 영문숫자조합 3~12글자 사이")
	private String user_id;
	
	@Size(min = 1, message = "이름은 최소 한글자 이상")
	private String user_name;
	
	@Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-]|.*[0-9]).{6,24}$", message = "비밀번호는 영숫특수글자 조합 6~24자리")
	private String user_pass;
	
	private String user_grade;
	private MultipartFile uploadFile;
	private String user_photo;
	
	@Pattern(regexp = "^01[016789]-[0-9]{3,4}-[0-9]{4}$", message = "번호를 다시 입력하세요")
	private String user_phone;
	private String hos_id;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_grade() {
		return user_grade;
	}
	public void setUser_grade(String user_grade) {
		this.user_grade = user_grade;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String getUser_photo() {
		return user_photo;
	}
	public void setUser_photo(String user_photo) {
		this.user_photo = user_photo;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getHos_id() {
		return hos_id;
	}
	public void setHos_id(String hos_id) {
		this.hos_id = hos_id;
	}
	
	
}
