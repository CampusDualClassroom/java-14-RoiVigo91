package com.campusdual.classroom;

public class PoliceOfficer extends Person {
    private final String squad;

    public PoliceOfficer(String name, String surname, String squad) {
        super(name, surname);
        this.squad = squad;
    }

    @Override
    public void getDetails() {
        StringBuilder builder = new StringBuilder();
        super.getDetails();

        builder.append("Escuadron: ");
        builder.append(squad);
        System.out.println(builder.toString());
    }
}

