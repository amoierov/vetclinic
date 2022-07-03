package src.model;

import java.util.Objects;

public class Appointment {
    private final String patient;
    private final String doctor;
    private final String date;
    private String status;

    public Appointment(String patient, String doctor, String date, String status) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.status = status;
    }

    public String getPatient() {
        return patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
