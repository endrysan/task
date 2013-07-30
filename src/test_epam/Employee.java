package test_epam;


public class Employee {
    
    private String employee;
    private String role;
    private int fixedSalary;
    private double experience;

    // Почему это переменная protected? зачем?
    // должно быть что-то такое, List<Project> projects = new ArrayList<Project>();
    // при это в методе setProject ты проверяешь, если это Developer очищаешь список проектов и добавляешь только один
    Project project;

    // Переменная нигде не используется
    Project marker;
    
    public Employee() {
        
    }
    
    public Employee(String employee, String role, int fixedSalary, double experience) {
        this.employee = employee;
        this.role = role;
        this.fixedSalary = fixedSalary;
        this.experience = experience;
    }
    
    public String getEmployee() {
        return employee;
    }
    
    public void setEmployee(String employee) {
        this.employee = employee;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public Project getProject() {
        return project;
    }
    
    public void setProject(Project project) {
        this.project = project;
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
