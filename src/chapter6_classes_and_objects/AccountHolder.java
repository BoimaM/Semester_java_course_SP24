package chapter6_classes_and_objects;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AccountHolder {

    //Instance variable(s):
    private String firstname;
    private String lastname;
    private String birthDay;

    //Constructor(s):
    public AccountHolder(String fN, String lN, String bDay){
        this.firstname = fN;
        this.lastname = lN;
        this.birthDay = bDay;
    }

    public AccountHolder(){
    }

    //Getter(s) and Setter(s):
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    //Method(s)
    public static int getAge(String birthDay) {
        //Get the current date
        LocalDate currentDate = LocalDate.now();
        //Parse the Birthday String to get the birthdate
        LocalDate birthDate = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        //Calculates the age
        int age = Period.between(birthDate,currentDate).getYears();
        return age;
    }

}
