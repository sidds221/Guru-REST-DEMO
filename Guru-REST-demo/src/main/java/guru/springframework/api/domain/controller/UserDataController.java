package guru.springframework.api.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.api.domain.services.ApiService;

@Controller
@RequestMapping("/stuff")
public class UserDataController {

	private ApiService apiService;
	
	public UserDataController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@RequestMapping("/success")
	public String dispUsers(Model theModel) {
		
//		System.out.println("here !!!!!! ");
	//	theModel.addAttribute("users", apiService.getUsers(3));
//		
//		System.out.println(apiService.getUsers(3).toString());

		return "views/success";
		
	}
	
}
