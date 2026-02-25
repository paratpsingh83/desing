package Creational.abstract_design_pattern;

public class EmployeeFactory {
    //get Employee

    public static Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory) {
        return employeeAbstractFactory.createEmployee();
    }
}
