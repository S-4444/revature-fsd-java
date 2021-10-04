package com.bankapp.form;

public abstract class Form {
   
	protected String name;
	protected boolean success;
	
	public Form(String name) {
		super();
		this.name = name;
		success= false;
	}
	public void displayTitle() {
		System.out.println("=*=*=*=*=*=");
		System.out.println(name);
		System.out.println("=*=*=*=*=*=");
	}
	public void captureDataAndPerfromAction() {
		while(!success) {
			displayTitle();
			captureData();
			action();
		}
	}
	
	public abstract void captureData();
	
	public abstract void action();
	
}
