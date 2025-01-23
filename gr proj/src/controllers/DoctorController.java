package controllers;

import controllers.interfaces.IDoctorController;
import models.Doctor;
import repositories.interfaces.IDoctorRepository;

import java.util.List;

public class DoctorController implements IDoctorController {
    private final IDoctorRepository repo;

    public DoctorController(IDoctorRepository repo) {
        this.repo = repo;
    }

    @Override
    public String createDoctor(String name, String speciality) {
        Doctor doctor = new Doctor(name, speciality);
        boolean created = repo.createDoctor(doctor);
        return created ? "Doctor was created successfully" : "Doctor creation failed";
    }

    @Override
    public String getDoctorById(int id) {
        Doctor doctor = repo.getDoctorById(id);
        return (doctor == null) ? "Doctor not found" : doctor.toString();
    }

    @Override
    public String getAllDoctors() {
        List<Doctor> doctors = repo.getAllDoctors();
        if (doctors.isEmpty()) {
            return "No doctors found.";
        }
        StringBuilder response = new StringBuilder();
        for (Doctor doctor : doctors) {
            response.append(doctor.toString()).append("\n");
        }
        return response.toString();
    }
}