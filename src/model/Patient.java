package src.model;

import java.util.Objects;

public class Patient {
    private String fio;
    private final String number;
    private final String adress;

    public Patient(String fio, String number, String adress) {
        this.fio = fio;
        this.number = number;
        this.adress = adress;
    }

    public Object setFio(String fio) {
        this.fio = fio;
        return null;
    }

    public String getFio() {
        return fio;
    }

    public String getNumber() {
        return number;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(fio, patient.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio);
    }

    public Object getName() {
        return fio;
    }
}
