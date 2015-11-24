package domain;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Registry {

	private List<Zone> zones;

	private List<File> genereateZoneFiles() {
		List<File> files = new ArrayList<>();
		for (Zone zone : zones) {
			files.add(zone.generateZoneFile());
		}
		return files;
	}

	private Domain whois(String domainName) {
		// search proper zone in zones
		Zone zone  = new Zone();
		
		return zone.getDomain(domainName);
	}
}
