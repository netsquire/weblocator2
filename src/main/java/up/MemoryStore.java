package up;

import java.util.HashMap;
import java.util.Map;

public class MemoryStore implements Holdable {

	private String uriString;
	private Map<String, String> locations = new HashMap<String, String>();

	@Override
	public String getUriString(){ return uriString;}

	public MemoryStore() {	
		locations = new HashMap<String, String>();
	}

	@Override
	public void putIp(String id, String ip) {
		locations.put(id, ip);
	}
	
	@Override
	public String list(){
		StringBuffer sb = new StringBuffer();
		for(String key : locations.keySet()) {
			//System.out.println("key: " + key);
			sb.append(locations.get(key)).append(":").append(locations.get(key));
			}
		System.out.println(sb.toString());
		return sb.toString();
	}

	@Override
	public String getIp(String id) {
		return locations.get(id);
	}
}
