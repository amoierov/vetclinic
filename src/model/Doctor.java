package src.model;

import java.util.Objects;

public class Doctor {
    private final String fio;
    private final String specialty;

    public Doctor(String fio, String specialty) {
        this.fio = fio;
        this.specialty = specialty;
    }

    public String getFio() {
        return fio;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(fio, doctor.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio);
    }
}
