package Person;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by seth on 11/30/16.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property="__type",
        defaultImpl = Person.class)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Adult.class, name = "Adult:#PersonMatcher.DataObjects"),
        @JsonSubTypes.Type(value = Child.class, name = "Child:#PersonMatcher.DataObjects"),
        @JsonSubTypes.Type(value = Adult.class, name = "Adult"),
        @JsonSubTypes.Type(value = Child.class, name = "Child")}
)

public class Person {
    private Integer objectId;
    private String  stateFileNumber;
    private String  socialSecurityNumber;
    private String  firstName;
    private String  middleName;
    private String  lastName;
    private String  birthYear;
    private Integer birthMonth;
    private Integer birthDay;
    private String  gender;

    //    Constructors
    public Person() {}

    public Person(Integer objectId, String stateFileNumber, String socialSecurityNumber, String firstName, String middleName, String lastName, String birthYear, Integer birthMonth, Integer birthDay, String gender) {
        this.objectId = objectId;
        this.stateFileNumber = stateFileNumber;
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    //    getters and setters
    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getStateFileNumber() {
        return stateFileNumber;
    }

    public void setStateFileNumber(String stateFileNumber) {
        this.stateFileNumber = stateFileNumber;
    }

    public String getSSN() {
        return socialSecurityNumber;
    }

    public void setSSN(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
