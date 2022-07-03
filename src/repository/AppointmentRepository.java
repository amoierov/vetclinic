package src.repository;

import src.model.Appointment;
import src.model.Patient;

import java.util.Set;

public interface AppointmentRepository {
    Appointment save(Appointment appointment);
    void update(String fio, Patient patient);
    Set<Appointment> getAllAppointments();
}
