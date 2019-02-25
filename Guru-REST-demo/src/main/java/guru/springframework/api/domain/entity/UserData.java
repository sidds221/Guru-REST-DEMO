package guru.springframework.api.domain.entity;

import java.util.List;

public class UserData {
	
	List<User> data;

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}
	
}
