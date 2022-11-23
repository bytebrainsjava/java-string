package com.app.bytebrains.immutable;

// Step 1: Declare class as a final
public final class Employee {
	// Step 2: Create/Declare all fields as private and final
	private final String name;
	private final Address address;

	public Employee(String name, Address address) {
		this.name = name;
		Address add = new Address();
		add.setCity(address.getCity());
		add.setCode(address.getCode());
		this.address = add;
	}

	// Step 3: Only getter method allowed , No setter method
	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
}
