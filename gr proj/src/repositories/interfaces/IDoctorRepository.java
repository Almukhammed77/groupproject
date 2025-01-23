package repositories.interfaces;

import models.Doctor;

import java.util.List;

public interface IDoctorRepository {
    boolean createDoctor(Doctor doctor);
    Doctor getDoctorById(int id);
    List<Doctor> getAllDoctors();
}