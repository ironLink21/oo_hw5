package Person;

/**
 * Created by seth on 11/30/16.
 */
public class Child extends Person {
    private String  newbornScreeningNumber;
    private String  isPartOfMultipleBirth;
    private Integer birthOrder;
    private String  birthCounty;
    private String  motherFirstName;
    private String  motherMiddleName;
    private String  motherLastName;

    //    constructor
    public Child(){}

    public Child(Integer objectId1, String stateFileNumber1, String socialSecurityNumber1, String firstName1, String middleName1, String lastName1, String birthYear1, Integer birthMonth1, Integer birthDay1, String gender1, String newbornScreeningNumber, String isPartOfMultipleBirth, Integer birthOrder, String birthCounty, String motherFirstName, String motherMiddleName, String motherLastName) {
        super(objectId1, stateFileNumber1, socialSecurityNumber1, firstName1, middleName1, lastName1, birthYear1, birthMonth1, birthDay1, gender1);
        this.newbornScreeningNumber = newbornScreeningNumber;
        this.isPartOfMultipleBirth = isPartOfMultipleBirth;
        this.birthOrder = birthOrder;
        this.birthCounty = birthCounty;
        this.motherFirstName = motherFirstName;
        this.motherMiddleName = motherMiddleName;
        this.motherLastName = motherLastName;
    }

    //    getters and setters
    public String getNewbornScreeningNumber() {
        return newbornScreeningNumber;
    }

    public void setNewbornScreeningNumber(String newbornScreeningNumber) {
        this.newbornScreeningNumber = newbornScreeningNumber;
    }

    public String getIsPartOfMultipleBirth() {
        return isPartOfMultipleBirth;
    }

    public void setIsPartOfMultipleBirth(String isPartOfMultipleBirth) {
        this.isPartOfMultipleBirth = isPartOfMultipleBirth;
    }

    public Integer getBirthOrder() {
        return birthOrder;
    }

    public void setBirthOrder(Integer birthOrder) {
        this.birthOrder = birthOrder;
    }

    public String getBirthCounty() {
        return birthCounty;
    }

    public void setBirthCounty(String birthCounty) {
        this.birthCounty = birthCounty;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherMiddleName() {
        return motherMiddleName;
    }

    public void setMotherMiddleName(String motherMiddleName) {
        this.motherMiddleName = motherMiddleName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }
}
