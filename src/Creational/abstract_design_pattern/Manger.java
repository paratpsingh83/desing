package Creational.abstract_design_pattern;

public class Manger implements Employee {
    @Override
    public int salary() {
        return 7000;
    }

    @Override
    public String name() {
        System.out.println("I am manager");
        return "MANGER";
    }
}
