package src.repository.impl;

import src.model.Appointment;
import src.model.Patient;
import src.repository.AppointmentRepository;

import java.util.HashSet;
import java.util.Set;

public class AppointmentRepositoryImpl implements AppointmentRepository {

    private static final Set<Appointment> APPOINTMENTS = new HashSet<>();

    @Override
    public Appointment save(Appointment appointment) {
        APPOINTMENTS.add(appointment);
        return appointment;
    }

    @Override
    public void update(String fio, Patient patient) {

    }

    @Override
    public Set<Appointment> getAllAppointments() {
        return APPOINTMENTS;
    }
}
