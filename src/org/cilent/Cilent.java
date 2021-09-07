package org.cilent;

import org.com.CompanyDetails;

public class Cilent extends CompanyDetails {
	public void clientName() {
		System.out.println("the cilent name is ash");

	}
	public void cilentNumber() {
System.out.println("the cilent  number is 9786286495");
	}
	public static void main(String[] args) {
		Cilent c =new Cilent();
		c.empName();
		c.empAddress();
		c.companyName();
		c.companyId();
		c.clientName();
		c.cilentNumber();
	}

}
