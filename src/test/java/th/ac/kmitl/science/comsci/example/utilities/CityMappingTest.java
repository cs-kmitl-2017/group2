package th.ac.kmitl.science.comsci.example.utilities;

import th.ac.kmitl.science.comsci.example.models.Mapping;
import junit.framework.Assert;
import org.junit.Test;

public class CityMappingTest {
    
    @Test
    public void testCityMapping() {
        Mapping mappingCityName = CityMapping.getMapping();
        Assert.assertEquals(mappingCityName.mapper("Mueang Samut Prakan"), "1101");
        Assert.assertEquals(mappingCityName.mapper("Bang Bo"), "1102");
        Assert.assertEquals(mappingCityName.mapper("Bang Phli"), "1103");
        Assert.assertEquals(mappingCityName.mapper("Phra Pradaeng"), "1104");
        Assert.assertEquals(mappingCityName.mapper("Phra Samut Chedi"), "1105");
        Assert.assertEquals(mappingCityName.mapper("Bang Sao Thong"), "1106");
        
        mappingCityName.setName("Bang Phli");
        Assert.assertEquals(mappingCityName.getName(), "Bang Phli");
        mappingCityName.setId("Bang Phli");
        Assert.assertEquals(mappingCityName.getId(), "1103");
        

    }
}