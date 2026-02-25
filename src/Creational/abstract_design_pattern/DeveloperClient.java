package Creational.abstract_design_pattern;

public class DeveloperClient {
    public static void main(String[] args) {

        //I want get android developer
        Employee employee1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        employee1.name();

        //I want get web developer
        Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
        employee2.name();

        //I want manger
        Employee employee3 = EmployeeFactory.getEmployee(new MangerFactory());
        employee3.name();


    }
}
