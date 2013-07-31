package test_epam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

// Класс показывающий результат работы
public class Solution {

    public static void main(String[] args) {
        // Создаем TreeMap для сортировки по зарплате
        Map<Integer, Employee> result = new TreeMap<Integer, Employee>(new Comparator<Integer>() {

            // Нисходящая сортировка
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }

        });
        List<Employee> employees = getEmployees();
        // Вычисляем полный оклад
        for (Employee employee : employees) {
            int salary = employee.getFixedSalary();
            int expYears = (int) employee.getExperience();
            // Добавляем бонус за каждый полный год работы
            if (expYears >= 1) {
                salary += expYears * 50;
            }
            // Добавляем бонус за каждый проект с неограниченным бюджетом
            for (Project project : employee.getProjects()) {
                if (!project.isFixedCost()) {
                    salary += 500;
                }
            }
            result.put(Integer.valueOf(salary), employee);
        }

        // Выводим результат на экран
        for (Entry<Integer, Employee> resultEntry : result.entrySet()) {
            System.out.println(resultEntry.getValue().getEmployee() + "\t" + resultEntry.getKey());
        }
    }

    // Возвращает список всех сотрудников
    private static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        List<Project> listProject = new ArrayList<Project>();

        listProject.add(new Project("Chart Editor", true));
        listProject.add(new Project("Employment System", false));
        listProject.add(new Project("Bank Transaction", false));

        Employee employee = new Employee("Ivanov Ivan", EmployeeRole.DEVELOPER, 1700, 0.5);
        employee.addProject(listProject.get(0));
        employees.add(employee);

        employee = new Employee("Petrov Petr", EmployeeRole.DEVELOPER, 2000, 2.0);
        employee.addProject(listProject.get(1));
        employees.add(employee);

        employee = new Employee("Mike", EmployeeRole.MANAGER, 6000, 4.0);
        employee.addProject(listProject.get(0));
        employee.addProject(listProject.get(1));
        employee.addProject(listProject.get(2));
        employees.add(employee);

        employee = new Employee("Jim", EmployeeRole.DEVELOPER, 3500, 2.0);
        employee.addProject(listProject.get(0));
        employees.add(employee);
        return employees; 
    }
}
