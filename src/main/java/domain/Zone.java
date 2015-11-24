package domain;

import java.io.File;
import java.util.List;

public class Zone {
	private String name;

	private ZoneType type;

	private ZoneHeader header;

	private List<Domain> domains;

	public String getName() {
		return name;
	}

	public File generateZoneFile() {
		//TODO change impl
		return null;
	}

	public Domain getDomain(String domainName) {
		//TODO change impl
		return domains.get(0);
	}
}
