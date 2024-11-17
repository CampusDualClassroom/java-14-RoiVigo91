package com.campusdual.classroom;

public class Doctor extends Person {
    private String specialization;

    public Doctor(String name, String surname, String specialty) {
        super(name, surname);
        this.specialization = specialty;
    }

    @Override
    public void getDetails() {
        StringBuilder builder = new StringBuilder();
        super.getDetails();

        builder.append("Especialidad: ");
        builder.append(specialization);
        System.out.println(builder.toString());
    }
}
