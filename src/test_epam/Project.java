package test_epam;


public class Project {
    
    private String project;
    private boolean fixedCost;
    
    public Project(String project, boolean fixedCost) {
        this.project = project;
        this.fixedCost = fixedCost;
    }
    
    public String getProject() {
        return project;
    }
    
    public void setProject(String project) {
        this.project = project;
    }
    
    public boolean getFixedCost() {
        return fixedCost;
    }
    
    public void setFixedCost(boolean fixedCost) {
        this.fixedCost = fixedCost;
    }

}
