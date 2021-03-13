package com.model;

public class User {
	private String uname;
	private String upass;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public User(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}
	public User() {
		
	}
	public boolean validate() {
		boolean b=false;
		if(uname.equalsIgnoreCase("mohan") && (upass.equalsIgnoreCase("java"))) {
			b=true;
			
		}
		return b;
		
	}

}
