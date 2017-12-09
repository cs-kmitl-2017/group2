package th.ac.kmitl.science.comsci.example.models;

public abstract class MappingToId {
    
    private String id;
       
    public String getId() {
        return id;
    }
    
    public void setId(String name) {
        this.id = mappingtosetId(name);
    }
    
    public abstract String mappingtosetId(String name); 
}
