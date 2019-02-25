package guru.springframework.api.domain.services;

import java.util.List;

import guru.springframework.api.domain.entity.User;

public interface ApiService {

	List<User> getUsers(Integer limit);
}
