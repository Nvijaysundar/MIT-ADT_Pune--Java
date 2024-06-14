package p1;

public class Patient {
	static String hspname;
	String pname,pbgrp,pgen;
	int age;
	public static void main(String[] args) {
		Patient.hspname = "Abc Hospital";
		
		Patient p1 = new Patient();
		p1.pname = "Aplha";
		p1.age = 25;
		p1.pbgrp = "A+ve";
		p1.pgen ="Male";
		
		System.out.println(p1.pname+"\t"+hspname);
	}
}
