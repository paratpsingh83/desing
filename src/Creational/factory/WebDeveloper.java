package Creational.factory;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting web developer salary...");
        return 50000;
    }
}
