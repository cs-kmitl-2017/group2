package th.ac.kmitl.science.comsci.example.utilities;

import th.ac.kmitl.science.comsci.example.models.Mapping;
import junit.framework.Assert;
import org.junit.Test;

public class CityMappingTest {
    
    @Test
    public void testCityMapping() {
        Mapping mappingCityName = CityMapping.getMapping();
        Assert.assertEquals(mappingCityName.mappingtosetId("Mueang Samut Prakan"), "1101");
        Assert.assertEquals(mappingCityName.mappingtosetId("Bang Bo"), "1102");
        Assert.assertEquals(mappingCityName.mappingtosetId("Bang Phli"), "1103");
        Assert.assertEquals(mappingCityName.mappingtosetId("Phra Pradaeng"), "1104");
        Assert.assertEquals(mappingCityName.mappingtosetId("Phra Samut Chedi"), "1105");
        Assert.assertEquals(mappingCityName.mappingtosetId("Bang Sao Thong"), "1106");
        
        mappingCityName.setId("Bang phli");
        Assert.assertEquals(mappingCityName.getId(), "1103");
    }
}