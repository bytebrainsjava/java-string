package com.app.bytebrains.immutable;

public class Address {
	String city;
	String code;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", code=" + code + "]";
	}

}
