package th.ac.kmitl.science.comsci.example.utilities;

import th.ac.kmitl.science.comsci.example.models.Mapping;
import junit.framework.Assert;
import org.junit.Test;

public class CitySubDivisionMappingTest {
    
    @Test
    public void testCitySubDivisionMapping() {
        Mapping mappingCitySubDivision = CitySubDivisionMapping.getMapping();
        Assert.assertEquals(mappingCitySubDivision.mappingtosetId("Bang Phli Yai"), "110301");
        Assert.assertEquals(mappingCitySubDivision.mappingtosetId("Bang Kaeo"), "110302");
        Assert.assertEquals(mappingCitySubDivision.mappingtosetId("Bang Pla"), "110303");
        Assert.assertEquals(mappingCitySubDivision.mappingtosetId("Bang Chalong"), "110304");
        Assert.assertEquals(mappingCitySubDivision.mappingtosetId("Racha Thewa"), "110308");
        Assert.assertEquals(mappingCitySubDivision.mappingtosetId("Nong Prue"), "110309");
        
        mappingCitySubDivision.setId("Bang chalong");
        Assert.assertEquals(mappingCitySubDivision.getId(), "110304");
    }
}