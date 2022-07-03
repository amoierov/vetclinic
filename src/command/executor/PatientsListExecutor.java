package src.command.executor;

import src.repository.PatientsRepository;
import src.repository.impl.PatientRepositoryImpl;

public class PatientsListExecutor implements Executor{

    private static final PatientsRepository patientsRepository = new PatientRepositoryImpl();
    @Override
    public int execute(String text) {
        return allPatients(text);
    }
    private static int allPatients(String command) {
        var patients = patientsRepository.getAllPatients();
        System.out.printf("LIST OF PATIENTS:\n");
        for (var patient : patients) {
            System.out.printf("FIO: %s, Number: %s, Address: %s \n",
                    patient.getFio(),
                    patient.getNumber(),
                    patient.getAdress());
        }
        return 1;
    }
}
