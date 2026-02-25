package Creational.factory_design_pattern;

public class DeveloperClient {

    public static void main(String[] args) {
        Employee employee = Factory.getEmployee("ANDROID DEVELOPER");
        System.out.println("Salary:" + employee.salary());


        Employee employee2 = Factory.getEmployee("WEB DEVELOPER");
        System.out.println("Salary:" + employee2.salary());
    }

}
