package src.command.executor;

import src.model.Patient;
import src.repository.PatientsRepository;
import src.repository.impl.PatientRepositoryImpl;

public class PatientCreateExecutor implements Executor{

    private static final PatientsRepository patientsRepository = new PatientRepositoryImpl();

    @Override
    public int execute(String text) {
        return createPatient(text);
    }
    private static int createPatient(String command) {
        String[] words = command.split(";");
        String patientFio = words[1];
        String patientNumber = words[2];
        String patientAddress = words[3];
        Patient newPatient = new Patient(patientFio, patientNumber, patientAddress);
        patientsRepository.save(newPatient);
        System.out.println("Patient created");
        return 1;
    }
}
