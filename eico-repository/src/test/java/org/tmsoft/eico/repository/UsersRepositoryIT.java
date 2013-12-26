package org.tmsoft.eico.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tmsoft.eico.entity.Users;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by OKAY PC on 26.12.13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-applicationContext.xml" })
public class UsersRepositoryIT {
	@Autowired
	UsersRepository usersRepository;

	@Test
	public void testGetAll(){
		List<Users> resutl = usersRepository.findAll();
		assertNotNull(resutl);
		assertTrue(resutl.size() == 0);
 	}

}
