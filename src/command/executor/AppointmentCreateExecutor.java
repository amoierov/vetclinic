package src.command.executor;

import src.model.Appointment;
import src.model.Doctor;
import src.model.Patient;
import src.repository.AppointmentRepository;
import src.repository.PatientsRepository;
import src.repository.impl.AppointmentRepositoryImpl;
import src.repository.impl.PatientRepositoryImpl;

import java.util.Optional;

import static src.command.executor.AbstractCommandExecutor.findDoctor;
import static src.command.executor.AbstractCommandExecutor.findPatient;

public class AppointmentCreateExecutor implements Executor{

    private static final AppointmentRepository appointmentRepository = new AppointmentRepositoryImpl();
    @Override
    public int execute(String text) {
        return createAppointment(text);
    }

    private int createAppointment(String text) {
        String[] words = text.split(";");
        String patientFio = words[1];
        String doctorFio = words[2];
        String date = words[3];
        String status = words[4];
        Optional<Patient> checkPatient = findPatient(patientFio);
        Optional<Doctor> checkDoctor = findDoctor(doctorFio);
        if (checkPatient.isPresent() && checkDoctor.isPresent()) {

            Appointment newAppointment = new Appointment(patientFio, doctorFio, date, status);
            appointmentRepository.save(newAppointment);
            System.out.println("Appointment created");

        } else {

            System.out.println("Patient or doctor not found!");

        }

        return 1;
    }
}
