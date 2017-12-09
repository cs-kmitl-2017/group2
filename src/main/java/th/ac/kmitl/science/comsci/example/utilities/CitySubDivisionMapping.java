package th.ac.kmitl.science.comsci.example.utilities;

import th.ac.kmitl.science.comsci.example.models.Mapping;
import java.util.Map;
import java.util.HashMap;

public class CitySubDivisionMapping extends Mapping {
    
    private Map<String, String> mappingCitySubDivisionName = new HashMap<>();
    private String CitySubDivisionID;
    private static Mapping map = null;
    
    public CitySubDivisionMapping() {
        mappingCitySubDivisionName.put("bang phli yai", "110301");
        mappingCitySubDivisionName.put("bang kaeo", "110302");
        mappingCitySubDivisionName.put("bang pla", "110303");
        mappingCitySubDivisionName.put("bang chalong", "110304");
        mappingCitySubDivisionName.put("racha thewa", "110308");
        mappingCitySubDivisionName.put("nong prue", "110309");
    }
    
    public static Mapping getMapping() {
        if (map == null) {
                map = new CitySubDivisionMapping();
        }
        return map;
    }
    
    @Override
    public String mapper(String name) { 
        CitySubDivisionID = mappingCitySubDivisionName.get(name.toLowerCase());
        return CitySubDivisionID;
    }
}