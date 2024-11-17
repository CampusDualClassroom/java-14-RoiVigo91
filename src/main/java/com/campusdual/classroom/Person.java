package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void getDetails() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nombre: ");
		builder.append(name);
		builder.append("\n");
		builder.append("Apellido: ");
		builder.append(surname);
		System.out.println(builder.toString());
	}
}
