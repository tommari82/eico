package org.tmsoft.eico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.tmsoft.eico.entity.Roles;

import java.util.List;

/**
 * Created by OKAY PC on 26.12.13.
 */
public interface  RolesRepository   extends JpaRepository<Roles, Long>{
	@Query("select r from Roles r join r.usersRolesList ur join ur.idUsers u where u.name = :userName")
	public List<Roles> getAllUserRoles(@Param("userName") String userName);
}
