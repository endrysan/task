package test_epam;


public class Project {
    
    private String project;
    //Какой нахер marker, я не понимаю что это за переменная
    //она должна называться fixedCost
    private boolean marker = false;
    
    public Project(String project, boolean marker) {
        this.project = project;
        this.marker = marker;
    }
    
    public String getProject() {
        return project;
    }
    
    public void setProject(String project) {
        this.project = project;
    }
    
    public boolean getMarker() {
        return marker;
    }
    
    public void setMarker(boolean marker) {
        this.marker = marker;
    }

}
