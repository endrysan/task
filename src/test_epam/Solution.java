package test_epam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Solution {

    public static void main(String[] args) {
       
       List<Employee> list = new ArrayList<Employee>();
       List<Project> listProject = new ArrayList<Project>();
       
       listProject.add(new Project("Chart Editor", true));
       listProject.add(new Project("Employment System", false));
       listProject.add(new Project("Bank Transaction", false));
       
       list.add(new Employee("Ivanov Ivan", "Developer", 1700, 0.5));
       list.add(new Employee("Petrov Petr", "Developer", 2000, 2.0));
       list.add(new Employee("Mike", "Manger", 6000, 4.0));
       list.add(new Employee("Jim", "Developer", 3500, 2.0));
       
       list.get(0).setProject(listProject.get(0));
       list.get(1).setProject(listProject.get(1));
       list.get(2).setProject(listProject.get(0));
       list.get(2).setProject(listProject.get(1));
       list.get(2).setProject(listProject.get(2));
       list.get(3).setProject(listProject.get(0));
       
       List<Integer> bonus = new ArrayList<Integer>();
       
       for (int i = 0; i < list.size(); i++) {
           if (list.get(i).getExperience() > 1) {
               bonus.add((int)(50 * list.get(i).getExperience()));
           }
           else {
               bonus.add(0);
           }
       }
       
       List<Integer> bonus2 = new ArrayList<Integer>();
       
       for (int i = 0; i < list.size(); i++) {
           if (list.get(i).getProject().getFixedCost() == false) {
               bonus2.add(500);
           }
           else {
               bonus2.add(0);
           }
       }
       
       /*
       for (Integer x: bonus) {
           System.out.println(x);
       }
       */
       List<Integer> cost = new ArrayList<Integer>();
       
       for (int i = 0; i < list.size(); i++) {
           cost.add(list.get(i).getFixedSalary() + bonus.get(i) + bonus2.get(i));
       }
       
       //Collections.sort(cost);
       int min = cost.get(0);
       for (int i = 0; i < list.size(); i++) {
           //if (cost.get(i))
           System.out.println(list.get(i).getEmployee() + " " + cost.get(i));
       }
       
       
      
    }
}
