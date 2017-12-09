package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;

public class CityNameTest {
    
    @Test
    public void testCityName() {
        MappingToId mappingCityName = new CityName(); 
        Assert.assertEquals(mappingCityName.mappingToId("Mueang Samut Prakan"), "1101");
        Assert.assertEquals(mappingCityName.mappingToId("Bang Bo"), "1102");
        Assert.assertEquals(mappingCityName.mappingToId("Bang Phli"), "1103");
        Assert.assertEquals(mappingCityName.mappingToId("Phra Pradaeng"), "1104");
        Assert.assertEquals(mappingCityName.mappingToId("Phra Samut Chedi"), "1105");
        Assert.assertEquals(mappingCityName.mappingToId("Bang Sao Thong"), "1106");
        
        mappingCityName.setId("Bang phli");
        Assert.assertEquals(mappingCityName.getId(), "1103");
    }
}
