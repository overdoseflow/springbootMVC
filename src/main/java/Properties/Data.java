package Properties;

import java.util.ArrayList;
import java.util.List;

public class Data {
	
	
	public List<user> tblData(){
		List<user> ls = new ArrayList<user>();
		for (int i = 0; i < 10; i++) {
			user us = new user();
			us.setName("Ali "+ i);
			us.setSurname("Bilmem "+ i);
			us.setAge(" "+ i);
			ls.add(us);
		}
		return ls;
	}

}
