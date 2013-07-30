package test_epam;

import java.util.List;
import java.util.ArrayList;


public class Employee {

    private String employee;
    private EmployeeRole role;
    private int fixedSalary;
    private double experience;
    private List<Project> projects = new ArrayList<Project>();

    public Employee() {
    }

    public Employee(String employee, EmployeeRole role, int fixedSalary, double experience) {
        this.employee = employee;
        this.role = role;
        this.fixedSalary = fixedSalary;
        this.experience = experience;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        if (EmployeeRole.DEVELOPER.equals(role)) {
            projects.clear();
        }
        projects.add(project);
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

}
