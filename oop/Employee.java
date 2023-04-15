package oop;

public class Employee extends Person {
    private String employeeId;
    private String department;
    private boolean isFullTime;

    public Employee(String employeeId, String department, boolean isFullTime) {
        this.employeeId = employeeId;
        this.department = department;
        this.isFullTime = isFullTime;
    }

    public Employee(String firstName, String lastName, String email, String password, int age, String employeeId, String department, boolean isFullTime) {
        super(firstName, lastName, email, password, age);
        this.employeeId = employeeId;
        this.department = department;
        this.isFullTime = isFullTime;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }
}
