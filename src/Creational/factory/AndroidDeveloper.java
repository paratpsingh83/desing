package Creational.factory;

public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting android developer salary...");
        return 40000;
    }
}
