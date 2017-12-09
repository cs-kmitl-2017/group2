package th.ac.kmitl.science.comsci.example.models;

import java.util.Map;
import java.util.HashMap;

public class CityName extends MappingToId {
    private Map<String, String> mappingCityName = new HashMap<>();
    private String CityNameID;
    private static MappingToId map = null; 
    
    private CityName() {
        mappingCityName.put("mueang samut prakan", "1101");
        mappingCityName.put("bang bo", "1102");
        mappingCityName.put("bang phli", "1103");
        mappingCityName.put("phra pradaeng", "1104");
        mappingCityName.put("phra samut chedi", "1105");
        mappingCityName.put("bang sao thong", "1106");
    }
    
    public static MappingToId getMapping() {
        if (map == null) {
                map = new CityName();
        }
        return map;
    }

    @Override
    public String mappingtosetId(String name) { 
        CityNameID = mappingCityName.get(name.toLowerCase());
        return CityNameID;
    }
}
