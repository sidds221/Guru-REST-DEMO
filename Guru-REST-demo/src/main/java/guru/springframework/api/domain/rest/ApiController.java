package guru.springframework.api.domain.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.api.domain.entity.User;
import guru.springframework.api.domain.services.ApiService;

@RestController
public class ApiController {

	ApiService apiService;
	
	public ApiController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@GetMapping("/users")
	public List<User> getUser(){
		
		return apiService.getUsers(3);
	}
	
	
}
