package com.elas.microservices.userservice.VO;

import com.elas.microservices.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ResponseTemplateVO {

	private User user;
	private Department department;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "ResponseTemplateVO [user=" + user + ", department=" + department + "]";
	}

}
