package test_epam;


public class Project {

    private String projectName;
    private boolean fixedCost;

    public Project(String projectName, boolean fixedCost) {
        this.projectName = projectName;
        this.fixedCost = fixedCost;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public boolean isFixedCost() {
        return fixedCost;
    }

    public void setFixedCost(boolean fixedCost) {
        this.fixedCost = fixedCost;
    }

}
