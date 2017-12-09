package th.ac.kmitl.science.comsci.example.utilities;

import th.ac.kmitl.science.comsci.example.models.Mapping;
import junit.framework.Assert;
import org.junit.Test;

public class CountrySubDivisionMappingTest {
    
    @Test
    public void testCountrySubDivisionMapping() {
        Mapping mappingCountrySubDivision = CountrySubDivisionMapping.getMapping();
        Assert.assertEquals(mappingCountrySubDivision.mapper("Bangkok"), "10");
        Assert.assertEquals(mappingCountrySubDivision.mapper("Chachoengsao"), "24");
        Assert.assertEquals(mappingCountrySubDivision.mapper("Nakhon Ratchasima"), "30");
        Assert.assertEquals(mappingCountrySubDivision.mapper("Roi Et"), "45");
        Assert.assertEquals(mappingCountrySubDivision.mapper("Chiang Mai"), "50");
        Assert.assertEquals(mappingCountrySubDivision.mapper("Chiang Rai"), "57");
        Assert.assertEquals(mappingCountrySubDivision.mapper("Sukhothai"), "64");
        Assert.assertEquals(mappingCountrySubDivision.mapper("Kanchanaburi"), "71");
        Assert.assertEquals(mappingCountrySubDivision.mapper("Nakhon Si Thammarat"), "80");
        Assert.assertEquals(mappingCountrySubDivision.mapper("Yala"), "95");
        
        mappingCountrySubDivision.setName("BANGKOK");
        Assert.assertEquals(mappingCountrySubDivision.getName(), "BANGKOK");
        mappingCountrySubDivision.setId("BANGKOK");
        Assert.assertEquals(mappingCountrySubDivision.getId(), "10");
   
    }
}
