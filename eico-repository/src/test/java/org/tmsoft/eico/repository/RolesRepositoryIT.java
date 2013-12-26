package org.tmsoft.eico.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tmsoft.eico.entity.Roles;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by OKAY PC on 26.12.13.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-applicationContext.xml" })
public class RolesRepositoryIT  {

	@Autowired
	RolesRepository rolesRepository;

	@Test
	public void testGetAllUserRoles(){
		List<Roles> result = rolesRepository.getAllUserRoles("name");

		assertNotNull(result);
	}
}
