package domain;

import java.util.Map;


//TODO Prepaid (with balance), Postpaid
public class Registrar {

	private String name;

	private String address;

	private String phoneNumber;

	private String email;

	private Map<ZoneType, Price> zonePrices;

	private RegistrarState state;
	
	public static enum RegistrarState {
		ACTIVE,
		BARRED;
	}
}
