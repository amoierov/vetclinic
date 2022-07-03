package src.repository.impl;

import src.model.Patient;
import src.repository.PatientsRepository;

import java.util.HashSet;
import java.util.Set;

public class PatientRepositoryImpl implements PatientsRepository {
    private static final Set<Patient> PATIENTS = new HashSet<>();

    private static final PatientRepositoryImpl SINGLETON = new PatientRepositoryImpl();   // Используем паттерн singleton,

    // то есть когда мы создаем внутри класса ровно 1 объект

    // на все приложение и потом выдаем его другим классам, чтобы они его использовали.

    // При этом прячем конструктор, делая его приватным.

    public PatientRepositoryImpl() {}



    public static PatientsRepository getSingleton() {
        return SINGLETON;
    }

    @Override
    public Patient save(Patient patient) {
        PATIENTS.add(patient);
        return patient;
    }

    @Override
    public Set<Patient> getAllPatients() {
        return PATIENTS;
    }

    @Override
    public void remove(Patient patient) {
        PATIENTS.remove(patient);
    }

    @Override
    public void update(String fio, Patient patient) {
        Patient patientUpdated = (Patient) patient.setFio(fio);
        PATIENTS.remove(patient);
        PATIENTS.add(patientUpdated);
    }


}
