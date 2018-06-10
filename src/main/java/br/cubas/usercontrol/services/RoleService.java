package br.cubas.usercontrol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cubas.usercontrol.beans.Role;
import br.cubas.usercontrol.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	RoleRepository roleRepository;
	
	public List<Role> listRoles() {
		return roleRepository.findAll();
	}
}
