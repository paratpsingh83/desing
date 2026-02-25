package Creational.factory_design_pattern;

public class Factory {

    //Get the employee
    public static Employee getEmployee(String typeEmp) {
        if (typeEmp.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDeveloper();
        } else if (typeEmp.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
