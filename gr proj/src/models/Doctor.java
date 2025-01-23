package models;

public class Doctor {
    private static int idCounter = 1;
    private final int id;
    private String name;
    private String speciality;

    public Doctor(String name, String speciality) {
        this.id = idCounter++;
        this.name = name;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}