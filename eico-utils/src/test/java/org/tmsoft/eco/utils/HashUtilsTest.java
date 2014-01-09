package org.tmsoft.eco.utils;

import org.junit.Test;
import org.tmsoft.eico.utils.HashUtils;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by OKAY PC on 27.12.13.
 */
public class HashUtilsTest {

	@Test
	public void testGetHash(){
		String result = HashUtils.getSHA256Hash("admin", "admin");
		assertNotNull(result);
		assertTrue("e2b3678e8af69ade303325a17c7f9059bfcdf054c20cf899279df60afcd783c3".compareTo(result) == 0);

	}


}
