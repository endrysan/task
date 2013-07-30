package test_epam;

import java.util.ArrayList;
import java.util.List;



public class Solution {

    public static void main(String[] args) {
       
       List<Employee> list = new ArrayList<Employee>();
       List<Project> listProject = new ArrayList<Project>();
       
       listProject.add(new Project("Chart Editor", true));
       listProject.add(new Project("Employment System", false));
       listProject.add(new Project("Bank Transaction", false));

       Employee employee = new Employee("Ivanov Ivan", EmployeeRole.DEVELOPER, 1700, 0.5);
       employee.addProject(listProject.get(0));
       list.add(employee);

       employee = new Employee("Petrov Petr", EmployeeRole.DEVELOPER, 2000, 2.0);
       employee.addProject(listProject.get(1));
       list.add(employee);

       employee = new Employee("Mike", EmployeeRole.MANAGER, 6000, 4.0);
       employee.addProject(listProject.get(0));
       employee.addProject(listProject.get(1));
       employee.addProject(listProject.get(2));
       list.add(employee);

       employee = new Employee("Jim", EmployeeRole.DEVELOPER, 3500, 2.0);
       employee.addProject(listProject.get(0));
       //для проверки ты можешь разработчику добавить 2 проекта, и посмотришь что будет, у него должен быть только 1 и последний добавленный
       list.add(employee);

       //Напиши заново, а то говно какое то
       // и не используй List<Ingeter>, а создай переменную и просто к ней прибавляй
    }
}
