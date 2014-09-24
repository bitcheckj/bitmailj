package bitmailj;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class ServerMain {

	public static void main(String[] args) {
		
		Security.addProvider(new BouncyCastleProvider());
		
		System.out.println("Bitmailj server started");
		
	}
	
}
