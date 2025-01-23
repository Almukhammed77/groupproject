package controllers.interfaces;

public interface IPatientController {
    String createPatient(String name, String surname, int age);
    String getPatientById(int id);
    String getAllPatients();
}