package domain;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Registry {
	
	List<Zone> zones;
	
	List<File> genereateZoneFiles() {
		List<File> files = new ArrayList<>();
		for (Zone zone : zones) {
			files.add(zone.generateZoneFile());
		}
		return files;
	}
	
	Domain whois(String domainName) {
		// search proper zone in zones
		Zone zone  = new Zone();
		
		return zone.getDomain(domainName);
	}
}
