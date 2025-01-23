package repositories;

import models.Patient;
import repositories.interfaces.IPatientRepository;

import java.util.ArrayList;
import java.util.List;

public class PatientRepository implements IPatientRepository {
    private final List<Patient> patients = new ArrayList<>();

    @Override
    public boolean createPatient(Patient patient) {
        return patients.add(patient);
    }

    @Override
    public Patient getPatientById(int id) {
        return patients.stream()
                .filter(patient -> patient.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Patient> getAllPatients() {
        return new ArrayList<>(patients);
    }
}