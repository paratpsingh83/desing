package Creational.abstract_design_pattern;

public class MangerFactory extends EmployeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new Manger();
    }
}
