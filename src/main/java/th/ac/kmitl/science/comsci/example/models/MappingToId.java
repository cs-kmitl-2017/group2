package th.ac.kmitl.science.comsci.example.models;

public abstract class MappingToId {
    
    private String id;
    
    public String getId() {
        return id;
    }
    
    public void setId(String name) {
        this.id = mappingToId(name);
    }
    
    public abstract String mappingToId(String name); 
}
