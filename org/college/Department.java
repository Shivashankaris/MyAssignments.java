package org.college;

public class Department extends College {
	public void deptname() {
		System.out.println("B Tech");
	}
	public static void main(String[] args) {
		Department dep=new Department();
		dep.collegename();
		dep.collegecode();
		dep.collegerank();
		dep.deptname();
		
		
	}
	}

