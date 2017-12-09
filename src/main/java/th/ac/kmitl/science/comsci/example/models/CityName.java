package th.ac.kmitl.science.comsci.example.models;

public class CityName extends MappingToId {
           
    @Override
    public String mappingToId(String name) {
        
        switch(name.toLowerCase()) {
            case "mueang samut prakan"  : return "1101";
            case "bang bo"              : return "1102";
            case "bang phli"            : return "1103";
            case "phra pradaeng"        : return "1104";
            case "phra samut chedi"     : return "1105";
            case "bang sao thong"       : return "1106";
            default                     : return "0";
        }
    }
}
