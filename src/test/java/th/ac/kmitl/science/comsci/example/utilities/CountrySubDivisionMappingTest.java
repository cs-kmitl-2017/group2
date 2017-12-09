package th.ac.kmitl.science.comsci.example.utilities;

import th.ac.kmitl.science.comsci.example.models.Mapping;
import junit.framework.Assert;
import org.junit.Test;

public class CountrySubDivisionMappingTest {
    
    @Test
    public void testCountrySubDivisionMapping() {
        Mapping mappingCountrySubDivision = CountrySubDivisionMapping.getMapping();
        Assert.assertEquals(mappingCountrySubDivision.mappingtosetId("Bangkok"), "10");
        Assert.assertEquals(mappingCountrySubDivision.mappingtosetId("Chachoengsao"), "24");
        Assert.assertEquals(mappingCountrySubDivision.mappingtosetId("Nakhon Ratchasima"), "30");
        Assert.assertEquals(mappingCountrySubDivision.mappingtosetId("Roi Et"), "45");
        Assert.assertEquals(mappingCountrySubDivision.mappingtosetId("Chiang Mai"), "50");
        Assert.assertEquals(mappingCountrySubDivision.mappingtosetId("Chiang Rai"), "57");
        Assert.assertEquals(mappingCountrySubDivision.mappingtosetId("Sukhothai"), "64");
        Assert.assertEquals(mappingCountrySubDivision.mappingtosetId("Kanchanaburi"), "71");
        Assert.assertEquals(mappingCountrySubDivision.mappingtosetId("Nakhon Si Thammarat"), "80");
        Assert.assertEquals(mappingCountrySubDivision.mappingtosetId("Yala"), "95");
        
        mappingCountrySubDivision.setId("BANGKOK");
        Assert.assertEquals(mappingCountrySubDivision.getId(), "10");
    }
}
