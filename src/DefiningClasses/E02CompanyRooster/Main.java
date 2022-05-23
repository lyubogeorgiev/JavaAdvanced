package DefiningClasses.E02CompanyRooster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Department> departments = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");


            String name = inputTokens[0];
            double salary = Double.parseDouble(inputTokens[1]);
            String position = inputTokens[2];
            String department = inputTokens[3];

            if (inputTokens.length == 6){
                String email = inputTokens[4];
                int age = Integer.parseInt(inputTokens[5]);

                Employee employee = new Employee(name, salary, position, department, email, age);

                departments.putIfAbsent(employee.getDepartment(), new Department(employee.getDepartment()));

                departments.get(department).addEmployee(employee);
            } else if (inputTokens.length == 4){
                //smallest possible size

                Employee employee = new Employee(name, salary, position, department);

                departments.putIfAbsent(department, new Department(employee.getDepartment()));

                departments.get(department).addEmployee(employee);

            } else if (inputTokens.length == 5){
                //2 cases possible here, with email only or with age only
                //need to perform a check of the type of last parameter inputTokens[4]

                if (isNumber(inputTokens[4])){
                    int age = Integer.parseInt(inputTokens[4]);

                    Employee employee = new Employee(name, salary, position, department, age);

                    departments.putIfAbsent(department, new Department(employee.getDepartment()));

                    departments.get(department).addEmployee(employee);
                } else {
                    String email = inputTokens[4];

                    Employee employee = new Employee(name, salary, position, department, email);

                    departments.putIfAbsent(department, new Department(employee.getDepartment()));

                    departments.get(department).addEmployee(employee);
                }
            }
        }

        Optional<Map.Entry<String, Department>> topDepartment = departments.entrySet().stream().sorted((a, b) -> (b.getValue().getAvgSalary() - a.getValue().getAvgSalary() == 0 ? 0 :
                b.getValue().getAvgSalary() - a.getValue().getAvgSalary() <  0 ? -1 : 1)).findFirst();

//        Department topDepartment = departments.entrySet().stream().sorted((a, b) -> (a.getValue() - b.getValue() > 0) ? 1 : 0).findFirst().get().getValue();

        String topDepartmentName = topDepartment.get().getKey();

        System.out.printf("Highest Average Salary: %s%n", topDepartmentName);

        departments.get(topDepartmentName)
                .getEmployees()
                .stream()
                .sorted((a, b) -> (b.getSalary() - a.getSalary() == 0) ? 0 : (b.getSalary() - a.getSalary() < 0) ? -1 : 1)
                .forEach(employee -> System.out.printf("%s %.2f %s %d%n",
                        employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge()));
    }

    public static boolean isNumber(String text){
        for (Character ch : text.toCharArray()) {
            if (!Character.isDigit(ch)){
                return false;
            }
        }

        return true;
    }
}