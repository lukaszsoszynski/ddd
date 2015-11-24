package domain;

import java.io.File;
import java.util.List;

public class Zone {
	String name;
	
	ZoneType type;
	
	ZoneHeader header;
	
	List<Domain> domains;
	
	File generateZoneFile() {
		//TODO change impl
		return null;
	}

	public Domain getDomain(String domainName) {
		//TODO change impl
		return domains.get(0);
	}
}
