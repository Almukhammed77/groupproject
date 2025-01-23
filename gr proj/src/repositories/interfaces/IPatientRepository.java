package repositories.interfaces;

import models.Patient;

import java.util.List;

public interface IPatientRepository {
    boolean createPatient(Patient patient);
    Patient getPatientById(int id);
    List<Patient> getAllPatients();
}
