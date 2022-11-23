package com.app.bytebrains.immutable;

public class TestImmutable {

	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Pune");
		address.setCode("411011");
		Employee emp = new Employee("Raju", address);
		System.out.println("Before updating employee details : " + emp);
		
		address.setCity("Delhi");
		address.setCode("111111");
		System.out.println("After updating employee details: " + emp);
	}
}
