package src.repository.impl;

import src.model.Doctor;
import src.repository.DoctorRepository;
import src.repository.PatientsRepository;

import java.util.HashSet;
import java.util.Set;

public class DoctorRepositoryImpl implements DoctorRepository {

    private static final DoctorRepositoryImpl SINGLETON = new DoctorRepositoryImpl();   // Используем паттерн singleton,

    // то есть когда мы создаем внутри класса ровно 1 объект

    // на все приложение и потом выдаем его другим классам, чтобы они его использовали.

    // При этом прячем конструктор, делая его приватным.

    public DoctorRepositoryImpl() {}



    public static DoctorRepositoryImpl getSingleton() {
        return SINGLETON;
    }
    private static final Set<Doctor> DOCTORS = new HashSet<>();
    @Override
    public Doctor save(Doctor doctor) {
        DOCTORS.add(doctor);
        return doctor;
    }

    @Override
    public Set<Doctor> getAllDoctors() {
        return DOCTORS;
    }
}
