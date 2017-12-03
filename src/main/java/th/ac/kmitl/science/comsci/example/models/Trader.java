package th.ac.kmitl.science.comsci.example.models;

public class Trader {

    private String id;

    private String globalId;

    private String name;

    private String taxId;

    private String uriId;

    private String email;

    public Trader(String id, String globalId, String name, String taxId, String uriId, String email) {
        setId(id);
        setGlobalId(globalId);
        setName(name);
        setTaxId(taxId);
        setUriId(uriId);
        setEmail(email);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxId(String taxId){
        this.taxId = taxId;
    }

    public String getTaxId(){
        return taxId;
    }

    public String getUriId() { return uriId; }

    public void setUriId(String uriId) { this.uriId = uriId; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

}