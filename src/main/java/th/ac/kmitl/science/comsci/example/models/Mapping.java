package th.ac.kmitl.science.comsci.example.models;

public abstract class Mapping {
    
    private String id;
    private String name;
       
    public String getId() {
        return id;
    }
    
    public void setId(String name) {
        this.id = mapper(name);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public abstract String mapper(String name); 
}
