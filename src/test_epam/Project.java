package test_epam;


public class Project {
    
    private String project;
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