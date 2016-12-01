package Person;

/**
 * Created by seth on 11/30/16.
 */
public class Adult extends Person {
    private String phone1;
    private String phone2;

    //    constructors
    public Adult(){}

    public Adult(Integer objectId1, String stateFileNumber1, String socialSecurityNumber1, String firstName1, String middleName1, String lastName1, String birthYear1, Integer birthMonth1, Integer birthDay1, String gender1, String phone1, String phone2) {
        super(objectId1, stateFileNumber1, socialSecurityNumber1, firstName1, middleName1, lastName1, birthYear1, birthMonth1, birthDay1, gender1);
        this.phone1 = phone1;
        this.phone2 = phone2;
    }

    //    getters and setters
    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }
}
