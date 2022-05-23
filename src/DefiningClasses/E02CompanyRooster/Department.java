package DefiningClasses.E02CompanyRooster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private final List<Employee> employees;
    private double avgSalary;

    public Department(){
        this.employees = new ArrayList<>();
    }

    public Department(String name){
        this();
        this.name = name;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);

        calculateAvgSalary();
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }

    public double getAvgSalary(){
        return this.avgSalary;
    }

    private void calculateAvgSalary(){
        double sumSalaries = 0;

        for (Employee employee : this.employees) {
            sumSalaries += employee.getSalary();
        }

        this.avgSalary = sumSalaries / this.employees.size();
    }
}
