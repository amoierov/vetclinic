package src.command.executor;

import src.model.Doctor;
import src.repository.DoctorRepository;
import src.repository.impl.DoctorRepositoryImpl;

public class DoctorCreateExecutor implements Executor{
    private static final DoctorRepository doctorRepository = new DoctorRepositoryImpl();
    @Override
    public int execute(String text) {
        return createDoctor(text);
    }

    private static int createDoctor(String command) {
        String[] words = command.split(";");
        String doctorFio = words[1];
        String specialty = words[2];
        Doctor newDoctor = new Doctor(doctorFio, specialty);
        doctorRepository.save(newDoctor);
        System.out.println("Doctor created");
        return 1;
    }
}
