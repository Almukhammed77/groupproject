package repositories;

import models.Appointment;
import repositories.interfaces.IAppointmentRepository;

import java.util.ArrayList;
import java.util.List;

public class AppointmentRepository implements IAppointmentRepository {
    private final List<Appointment> appointments = new ArrayList<>();

    @Override
    public boolean createAppointment(Appointment appointment) {
        return appointments.add(appointment);
    }

    @Override
    public Appointment getAppointmentById(int id) {
        return appointments.stream()
                .filter(appointment -> appointment.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return new ArrayList<>(appointments);
    }
}