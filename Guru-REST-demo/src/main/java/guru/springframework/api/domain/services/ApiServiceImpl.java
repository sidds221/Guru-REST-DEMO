package guru.springframework.api.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import guru.springframework.api.domain.entity.User;
import guru.springframework.api.domain.entity.UserData;

@Service
public class ApiServiceImpl implements ApiService {
	
	private RestTemplate restTemplate;
	
	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public List<User> getUsers(Integer limit) {
		// TODO Auto-generated method stub
		UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit="+limit,UserData.class);
		return userData.getData();
	}

	
	
	
	
}
