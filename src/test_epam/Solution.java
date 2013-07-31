package test_epam;

import java.util.ArrayList;
import java.util.List;



public class Solution {

    public static void main(String[] args) {
       
       List<Employee> listEmployee = new ArrayList<Employee>();
       List<Project> listProject = new ArrayList<Project>();
       
       listProject.add(new Project("Chart Editor", true));
       listProject.add(new Project("Employment System", false));
       listProject.add(new Project("Bank Transaction", false));

       Employee employee = new Employee("Ivanov Ivan", EmployeeRole.DEVELOPER, 1700, 0.5);
       employee.addProject(listProject.get(0));
       listEmployee.add(employee);

       employee = new Employee("Petrov Petr", EmployeeRole.DEVELOPER, 2000, 2.0);
       employee.addProject(listProject.get(1));
       listEmployee.add(employee);

       employee = new Employee("Mike", EmployeeRole.MANAGER, 6000, 4.0);
       employee.addProject(listProject.get(0));
       employee.addProject(listProject.get(1));
       employee.addProject(listProject.get(2));
       listEmployee.add(employee);

       employee = new Employee("Jim", EmployeeRole.DEVELOPER, 3500, 2.0);
       employee.addProject(listProject.get(0));
       listEmployee.add(employee);
       
       List<Integer> cost = new ArrayList<Integer>();
       
       for (int i = 0; i < listEmployee.size(); i++) {
           int year = (int) listEmployee.get(i).getExperience();
           if (year > 1) {
               cost.add(50 * year + listEmployee.get(i).getFixedSalary());
           }
           else {
               cost.add(listEmployee.get(i).getFixedSalary());
           }
       }
       
       for (int i = 0; i < listEmployee.size(); i++) {
           for (int j = 0; j < listProject.size(); j++) {
               if (listProject.get(j).getFixedCost() == false) {
                   cost.set(j, cost.get(j) + 500);
               }
              
           }
       }
        
       for (Integer x: cost) {
           System.out.println(x);
       }

    }
}
