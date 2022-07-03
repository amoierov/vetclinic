package src;

import src.command.CommandReader;
import src.repository.PatientsRepository;
import src.repository.impl.PatientRepositoryImpl;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        int access  = Authentication.authenticate();

        switch (access) {
            case 0 -> System.out.println("You are logged in as a user");
            case 1 -> System.out.println("You are logged in as an administrator");
            default -> {
                System.out.println("Authorization error! Program exits");
                return;
            }
        }
//        Patient patient = new Patient("Иванов Иван Иванович", "+79062341232", "Otradnaya 23, 882");
//        Patient patient1 = new Patient("Иванов Иван Иваdwaнович", "+79062dwads341232", "Otradnaya 23, 882");
//        Patient patient2 = new Patient("Иванов Иван Иdwadwaванович", "+79062341232", "Otradnadwadwaya 23, 882");
//
//        PatientsRepository patientsRepository = new PatientRepositoryImpl();
//        patientsRepository.save(patient);
//        patientsRepository.save(patient1);
//        patientsRepository.save(patient2);

        CommandReader.startReadCommand();



    }
}
