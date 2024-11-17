package com.campusdual.classroom;

public class Teacher extends Person {
    private String area;

    public Teacher(String name, String surname, String area) {
        super(name, surname);
        this.area = area;
    }


    @Override
    public void getDetails() {
        StringBuilder builder = new StringBuilder();
        super.getDetails();

        builder.append("Asignatura: ");
        builder.append(area);
        System.out.println(builder.toString());
    }
}
