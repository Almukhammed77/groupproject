package repositories;

import models.Doctor;
import repositories.interfaces.IDoctorRepository;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepository implements IDoctorRepository {
    private final List<Doctor> doctors = new ArrayList<>();

    @Override
    public boolean createDoctor(Doctor doctor) {
        return doctors.add(doctor);
    }

    @Override
    public Doctor getDoctorById(int id) {
        return doctors.stream()
                .filter(doctor -> doctor.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return new ArrayList<>(doctors);
    }
}
