package org.api;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;



public class HdfcBanking {
	
  Map<String,Integer> m;
	private String username;
	
	private String password;
	
	private int balance;
	

	
	public void setUsername(String username) {
		if(username.equals("Deepa")) {
			this.username="Deepa Account";
		}
		else if (username.equals("Zaara")) {
			this.username="Zaara Account";
		}
		else if (username.equals("San")) {
			this.username="San Account";
	
	}
	else {
		this.username="Invalid Account";
		
	}
	}
	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		if(password.equals("deepa@123")&& username.equals("Deepa Account")){
			this.password="Deepa Account is Validated";
		}
		else if(password.equals("Zaara@123")&& username.equals("Zaara Account")){
			this.password="Zaara Account is Validated";
			
		}
		else if(password.equals("san@123")&& username.equals("San Account")) {
			this.password="San Account is Validated";
		}
		else {
			this.username="Invalid Account";
		}
		
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
	
		Set<Entry<String,Integer>> entrySet = m.entrySet();
		for (Entry<String,Integer> entry : entrySet) {
			if(this.password.equals(entry.getKey())) {
		this.balance= entry.getValue();
		}
	}
	}
		
	
	
	




public void readDataFromDb() throws IOException {
	File f = new File("C:\\Users\\deepa\\eclipse-workspace\\API\\Datamemeber\\InputDatas.txt");
	List<String> readLines = FileUtils.readLines(f);
	m = new LinkedHashMap();
	String string = readLines.get(0);
	String[] split = string.split(",");
	m.put("Deepa Account is Validated",Integer.parseInt(split[2]));
	String string2 = readLines.get(1);
	String[] split2 = string.split(",");
	m.put("Zaara Account is validated",Integer.parseInt(split2[2]));
	String string3 = readLines.get(2);
	String[] split3 = string.split(",");
	m.put("San Account is validated",Integer.parseInt(split3[2]));
	
	
	System.out.println("s");
	
	
}
}
