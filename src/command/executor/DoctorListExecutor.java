package src.command.executor;

import src.repository.DoctorRepository;
import src.repository.impl.DoctorRepositoryImpl;

public class DoctorListExecutor implements Executor{
    private static final DoctorRepository doctorRepository = new DoctorRepositoryImpl();
    @Override
    public int execute(String text) {
        return allDoctors(text);
    }

    private int allDoctors(String command) {
        var patients = doctorRepository.getAllDoctors();
        System.out.printf("LIST OF DOCTORS:\n");
        for (var patient : patients) {
            System.out.printf("FIO: %s, Specialty: %s \n",
                    patient.getFio(),
                    patient.getSpecialty());
        }
        return 1;
    }
}
