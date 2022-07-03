package src.repository;

import src.model.Doctor;

import java.util.Set;

public interface DoctorRepository {
    Doctor save(Doctor doctor);
    Set<Doctor> getAllDoctors();

   ;
}
