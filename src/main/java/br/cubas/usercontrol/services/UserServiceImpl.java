package br.cubas.usercontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.cubas.usercontrol.beans.Role;
import br.cubas.usercontrol.beans.User;
import br.cubas.usercontrol.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.getRoles().add(user.getRole());
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		List<User> list = userRepository.findByUsername(username);

		if (list.size() > 0)
			return list.get(0);
		else
			return null;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
}