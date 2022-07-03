package src.repository;

import src.model.Patient;

import java.util.Set;

public interface PatientsRepository {
    Patient save(Patient patient);

    Set<Patient> getAllPatients();

    void remove(Patient patient);

    void update(String fio, Patient patient);
}
