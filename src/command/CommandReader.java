package src.command;

import src.command.executor.*;
import src.repository.PatientsRepository;
import src.repository.impl.PatientRepositoryImpl;

import java.util.Scanner;


public class CommandReader {

    public static int startReadCommand() {
        Scanner s = new Scanner(System.in);
        while (true) {
            var text = s.nextLine();
            int code = CommandReader.readCommand(text);
            if (code == 0) {
                break;
            }
        }
        return 0;
    }

    private static final PatientsRepository patientsRepository = new PatientRepositoryImpl();

    /**
     * create patient
     * update patient
     * all patients
     * delete patient
     *
     * example: create patient;Ivanov Ivan Ivanovich;+79231233212;Otradnaya 23, 2321
     * example: update patient;Ivanov Ivan Ivanovich;Andreew Adnrey Andreewich
     *
     * example create appointment;Ivanov Ivan Ivanovich;Andreew Adnrey Andreewich;20.05.22;Payed
     */
    private static int readCommand(String command) {
        if (command.contains("create patient")) {
            return new PatientCreateExecutor().execute(command);
        }
        if (command.contains("update patient")) {
            return new PatientUpdateExecutor().execute(command);
        }
        if (command.contains("all patients")) {
            return new PatientsListExecutor().execute(command);
        }
        if (command.contains("delete patient")) {
            return new PatientDeleteExecutor().execute(command);
        }
        if (command.contains("create doctor")) {
            return new DoctorCreateExecutor().execute(command);
        }
        if (command.contains("all doctors")) {
            return new DoctorListExecutor().execute(command);
        }
        if (command.contains("create appointment")) {
            return new AppointmentCreateExecutor().execute(command);
        }
        if (command.contains("exit")) {
            return 0;
        }

        return 1;
    }









}
