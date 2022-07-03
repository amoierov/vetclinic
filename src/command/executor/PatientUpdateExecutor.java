package src.command.executor;

import src.model.Patient;
import src.repository.PatientsRepository;
import src.repository.impl.PatientRepositoryImpl;

import java.util.Optional;

import static src.command.executor.AbstractCommandExecutor.findPatient;

public class PatientUpdateExecutor implements Executor{

    private static final PatientsRepository patientsRepository = new PatientRepositoryImpl();
    @Override
    public int execute(String text) {
        return updatePatient(text);
    }

    private static int updatePatient(String command) {
        String[] words = command.split(";");
        String patientFio = words[1];
        String updatedFio = words[2];
        Optional<Patient> noteToRemove = findPatient(patientFio);
        Optional<Patient> updatedPatient = noteToRemove;
        Patient upPa = updatedPatient.get();
        upPa.setFio(updatedFio);
        if (noteToRemove.isPresent()) {

            patientsRepository.remove(noteToRemove.get());
            System.out.println("FIO updated");

        } else {

            System.out.println("Patient not found");

        }
        return 1;
    }
}
