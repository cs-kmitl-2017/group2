package th.ac.kmitl.science.comsci.example.utilities;

import th.ac.kmitl.science.comsci.example.models.Mapping;
import junit.framework.Assert;
import org.junit.Test;

public class CitySubDivisionMappingTest {
    
    @Test
    public void testCitySubDivisionMapping() {
        Mapping mappingCitySubDivision = CitySubDivisionMapping.getMapping();
        Assert.assertEquals(mappingCitySubDivision.mapper("Bang Phli Yai"), "110301");
        Assert.assertEquals(mappingCitySubDivision.mapper("Bang Kaeo"), "110302");
        Assert.assertEquals(mappingCitySubDivision.mapper("Bang Pla"), "110303");
        Assert.assertEquals(mappingCitySubDivision.mapper("Bang Chalong"), "110304");
        Assert.assertEquals(mappingCitySubDivision.mapper("Racha Thewa"), "110308");
        Assert.assertEquals(mappingCitySubDivision.mapper("Nong Prue"), "110309");
        
        mappingCitySubDivision.setName("Bang Chalong");
        Assert.assertEquals(mappingCitySubDivision.getName(), "Bang Chalong");
        mappingCitySubDivision.setId("Bang Chalong");
        Assert.assertEquals(mappingCitySubDivision.getId(), "1103");

    }
}