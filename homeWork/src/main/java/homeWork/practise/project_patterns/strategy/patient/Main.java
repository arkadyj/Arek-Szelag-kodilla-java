package homeWork.practise.project_patterns.strategy.patient;

public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient("Szelag", "Arek", 22);
        RegistrationProcess registrationProcess = new RegistrationProcess();
        registrationProcess.setRegistration(patient, new RegistrationCommercial());
        registrationProcess.setRegistration(patient, new RegistrationNFZ());

    }
}
