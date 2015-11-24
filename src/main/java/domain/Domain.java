package domain;

import java.util.Date;
import java.util.List;

public class Domain {
	private String name;   //homel

	private Zone zone;

	private Date created;

	private Date modified;

	private Date expireDate;

	private Registrar registrar;

	private Contact registrant;

	private Contact technicalContact;

	private Contact adminContact;

	private List<NameServer> nameServers;

	private String getDomainName() {
		return String.format("%s.%s", name, zone.getName());
	}
	
}
