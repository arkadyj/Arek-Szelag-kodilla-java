package homeWork.practise.project_patterns.strategy.patient;

public class Patient {

    private String sName;
    private String fName;
    private int id;
    private Registration registration;

    public Patient(String sName, String fName, int id) {
        this.sName = sName;
        this.fName = fName;
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public String getfName() {
        return fName;
    }

    public int getId() {
        return id;
    }
}
