package Creational.factory_design_pattern;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting web developer salary...");
        return 50000;
    }
}
