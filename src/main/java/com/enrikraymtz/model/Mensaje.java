package com.enrikraymtz.model;

public class Mensaje {
	
	private int id;
	private String msj;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsj() {
		return msj;
	}
	public void setMsj(String msj) {
		this.msj = msj;
	}
	public Mensaje(int id, String msj) {
		super();
		this.id = id;
		this.msj = msj;
	}
	
}
