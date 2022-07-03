package src.command.executor;

import src.model.Doctor;
import src.model.Patient;
import src.repository.DoctorRepository;
import src.repository.PatientsRepository;
import src.repository.impl.DoctorRepositoryImpl;
import src.repository.impl.PatientRepositoryImpl;

import java.util.Optional;

public abstract class AbstractCommandExecutor implements Executor{
    protected static final PatientsRepository noteRepository = PatientRepositoryImpl.getSingleton();

    protected static final DoctorRepository doctorRepository = DoctorRepositoryImpl.getSingleton();

    protected static Optional<Patient> findPatient(String noteName) {

        for (Patient patient : noteRepository.getAllPatients()) {

            if (patient.getName().equals(noteName)) {

                return Optional.of(patient);

            }

        }

        return Optional.empty();

    }

    protected static Optional<Doctor> findDoctor(String doctorFio) {

        for (Doctor doctor : doctorRepository.getAllDoctors()) {

            if (doctor.getFio().equals(doctorFio)) {

                return Optional.of(doctor);

            }

        }

        return Optional.empty();

    }
}
