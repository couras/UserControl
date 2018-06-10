package br.cubas.usercontrol.services;

import br.cubas.usercontrol.beans.User;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	
	void save(User user);

	User findByUsername(String username);

	List<User> findAll();
}