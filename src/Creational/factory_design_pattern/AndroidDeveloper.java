package Creational.factory_design_pattern;

public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting android developer salary...");
        return 40000;
    }
}
