package org.tmsoft.eico.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by OKAY PC on 27.12.13.
 */
public class HashUtils {

	private static final String SHA_256 = "SHA-256";

	public static String getSHA256Hash(String userName, String userPass) {

		String passHash = getHashPass(SHA_256, userPass);
		return getHashPass(SHA_256, passHash.concat(userName));
	}

	/**
	 * vraci hash hesla
	 * <p/>
	 * support function:
	 * <ul>
	 * <li><tt>MD5</tt></li>
	 * <li><tt>SHA-1</tt></li>
	 * <li><tt>SHA-256</tt></li>
	 * </ul>
	 *
	 * @param hash_fce jmeno hash fce.(MD5, SHA1)
	 * @param Passwd   heslo
	 * @return hash hesla
	 */
	private static String getHashPass(String hash_fce, String Passwd) {
		try {
			MessageDigest md = MessageDigest.getInstance(hash_fce);
			md.update(Passwd.getBytes());
			BigInteger hash = new BigInteger(1, md.digest());
			return (hash.toString(16));
		} catch (NoSuchAlgorithmException ns) {
			return (null);
		}
	}
}
