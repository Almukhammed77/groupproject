package controllers.interfaces;

public interface IDoctorController {
    String createDoctor(String name, String specialty);
    String getDoctorById(int id);
    String getAllDoctors();
}
