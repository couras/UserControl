package br.cubas.usercontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cubas.usercontrol.beans.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
}
