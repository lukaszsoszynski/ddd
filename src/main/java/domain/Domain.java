package domain;

import java.util.Date;
import java.util.List;

public class Domain {
	String name;   //homel
	
	Zone zone;
	
	Date created;
	
	Date modified;
	
	Date expireDate;
	
	Registrar registrar; 
	
	Contact registrant;
	
	Contact technicalContact;
	
	Contact adminContact;
	
	List<NameServer> nameServers;
	
	String getDomainName() {
		return String.format("%s.%s", name, zone.name);
	}
	
}
