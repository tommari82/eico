package org.tmsoft.eico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.tmsoft.eico.entity.Roles;
import org.tmsoft.eico.entity.Users;

import java.util.List;

/**
 * Created by OKAY PC on 26.12.13.
 */
public interface UsersRepository extends JpaRepository<Users, Long> {
}
