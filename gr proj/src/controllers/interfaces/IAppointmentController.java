package controllers.interfaces;

public interface IAppointmentController {
    String createAppointment(int doctorId, int patientId, String date);
    String getAppointmentById(int id);
    String getAllAppointments();
}