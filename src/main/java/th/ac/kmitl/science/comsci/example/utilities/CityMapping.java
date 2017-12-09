package th.ac.kmitl.science.comsci.example.utilities;

import th.ac.kmitl.science.comsci.example.models.Mapping;
import java.util.Map;
import java.util.HashMap;

public class CityMapping extends Mapping {
    private Map<String, String> mappingCityName = new HashMap<>();
    private String CityNameID;
    private static Mapping map = null; 
    
    private CityMapping() {
        mappingCityName.put("mueang samut prakan", "1101");
        mappingCityName.put("bang bo", "1102");
        mappingCityName.put("bang phli", "1103");
        mappingCityName.put("phra pradaeng", "1104");
        mappingCityName.put("phra samut chedi", "1105");
        mappingCityName.put("bang sao thong", "1106");
    }
    
    public static Mapping getMapping() {
        if (map == null) {
                map = new CityMapping();
        }
        return map;
    }

    @Override
    public String mappingtosetId(String name) { 
        CityNameID = mappingCityName.get(name.toLowerCase());
        return CityNameID;
    }
}