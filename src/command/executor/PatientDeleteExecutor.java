package src.command.executor;

import src.model.Patient;
import src.repository.PatientsRepository;
import src.repository.impl.PatientRepositoryImpl;

import java.util.Optional;

public class PatientDeleteExecutor  extends AbstractCommandExecutor{
    private static final PatientsRepository patientsRepository = new PatientRepositoryImpl();
    @Override
    public int execute(String text) {
        return deletePatient(text);
    }
    private static int deletePatient(String command) {
        String[] words = command.split(";");
        String patientFio = words[1];
        Optional<Patient> noteToRemove = findPatient(patientFio);

        if (noteToRemove.isPresent()) {

            patientsRepository.remove(noteToRemove.get());

            System.out.println("Patient deleted");

        } else {

            System.out.println("Patient not found");

        }


        return 1;
    }
}
