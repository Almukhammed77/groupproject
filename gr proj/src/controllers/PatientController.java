package controllers;

import controllers.interfaces.IPatientController;
import models.Patient;
import repositories.interfaces.IPatientRepository;

import java.util.List;

public class PatientController implements IPatientController {
    private final IPatientRepository repo;

    public PatientController(IPatientRepository repo) {
        this.repo = repo;
    }

    @Override
    public String createPatient(String name, String surname, int age) {
        Patient patient = new Patient(name, surname, age);
        boolean created = repo.createPatient(patient);
        return created ? "Patient was created successfully" : "Patient creation failed";
    }

    @Override
    public String getPatientById(int id) {
        Patient patient = repo.getPatientById(id);
        return (patient == null) ? "Patient not found" : patient.toString();
    }

    @Override
    public String getAllPatients() {
        List<Patient> patients = repo.getAllPatients();
        if (patients.isEmpty()) {
            return "No patients found.";
        }
        StringBuilder response = new StringBuilder();
        for (Patient patient : patients) {
            response.append(patient.toString()).append("\n");
        }
        return response.toString();
    }
}