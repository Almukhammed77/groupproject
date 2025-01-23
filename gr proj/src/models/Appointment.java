package models;

public class Appointment {
    private static int idCounter = 1;
    private final int id;
    private int doctorId;
    private int patientId;
    private String date;

    public Appointment(int doctorId, int patientId, String date) {
        this.id = idCounter++;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getDate() {
        return date;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", doctorId=" + doctorId +
                ", patientId=" + patientId +
                ", date='" + date + '\'' +
                '}';
    }
}