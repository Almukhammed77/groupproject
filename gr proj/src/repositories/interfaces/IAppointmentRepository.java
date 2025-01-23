package repositories.interfaces;

import models.Appointment;

import java.util.List;

public interface IAppointmentRepository {
    boolean createAppointment(Appointment appointment);
    Appointment getAppointmentById(int id);
    List<Appointment> getAllAppointments();
}