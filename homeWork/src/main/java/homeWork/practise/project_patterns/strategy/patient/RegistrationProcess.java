package homeWork.practise.project_patterns.strategy.patient;

public class RegistrationProcess {

    private Registration registration;
    private Patient patient;

    public void setRegistration(Patient patient, Registration registration){

        registration.visitRegistration();



    }
}
