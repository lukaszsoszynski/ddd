package domain;

import java.util.Map;


//TODO Prepaid (with balance), Postpaid
public class Registrar {
	
	String name;

	String address;

	String phoneNumber;

	String email;

	Map<ZoneType, Price> zonePrices;
	
	RegistrarState state;
	
	public static enum RegistrarState {
		active, 
		barred;
	}
}
