package controllers;

import controllers.interfaces.IAppointmentController;
import models.Appointment;
import repositories.interfaces.IAppointmentRepository;

import java.util.List;

public class AppointmentController implements IAppointmentController {
    private final IAppointmentRepository repo;

    public AppointmentController(IAppointmentRepository repo) {
        this.repo = repo;
    }

    @Override
    public String createAppointment(int doctorId, int patientId, String date) {
        Appointment appointment = new Appointment(doctorId, patientId, date);
        boolean created = repo.createAppointment(appointment);
        return created ? "Appointment was created successfully" : "Appointment creation failed";
    }

    @Override
    public String getAppointmentById(int id) {
        Appointment appointment = repo.getAppointmentById(id);
        return (appointment == null) ? "Appointment not found" : appointment.toString();
    }

    @Override
    public String getAllAppointments() {
        List<Appointment> appointments = repo.getAllAppointments();
        if (appointments.isEmpty()) {
            return "No appointments found.";
        }
        StringBuilder response = new StringBuilder();
        for (Appointment appointment : appointments) {
            response.append(appointment.toString()).append("\n");
        }
        return response.toString();
    }
}
