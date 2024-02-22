package chapter9_inheritance;

public class Employee extends Person {
    //Have to put "extends"
    // Then the class you want to  inheritance from.

    private String employeeID;
    private String title;

    public Employee(){
        System.out.println("In Employee default constructor");
    }

    public Employee( String employeeID){
       this.employeeID = employeeID;

    }

    public String setEmployeeID(){
        return employeeID;
    }

    public void getEmployeeID (String employeeID){
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
