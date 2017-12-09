package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testInputAddress() {
        Address address = new Address();

        String postCode = "10540";

        String buildingName = "Chalong Apartment";

        String lineOne = "419/287 M.9 PremruthaiVillage Soi 6 Bangna-Trad";

        String lineTwo = "Bang Chalong Bang Phli Samut Prakan, Thailand";

        String lineThree = "6";

        String lineFour = "PremruthaiVillage";

        String lineFive = "9";

        String streetName = "Bangna-Trad";
        
        String cityName = "Bang Phee";
        
        String citySubDivisionName = "Bang Chalong";
    
        String country = "Thailand";
    
        String countrySubDivision = "Samut Prakan";

        String buildingNumber = "419/287";

        address.setPostCode(postCode);
        address.setBuildingName(buildingName);
        address.setLineOne(lineOne);
        address.setLineTwo(lineTwo);
        address.setLineThree(lineThree);
        address.setLineFour(lineFour);
        address.setLineFive(lineFive);
        address.setStreetName(streetName);
        address.setCityName(cityName);
        address.setCitySubDivisionName(citySubDivisionName);
        address.setCountry(country);
        address.setCountrySubDivision(countrySubDivision);
        address.setBuildingNumber(buildingNumber);

        Assert.assertEquals(address.getPostCode(), postCode);
        Assert.assertEquals(address.getBuildingName(), buildingName);
        Assert.assertEquals(address.getLineOne(), lineOne);
        Assert.assertEquals(address.getLineTwo(), lineTwo);
        Assert.assertEquals(address.getLineThree(), lineThree);
        Assert.assertEquals(address.getLineFour(), lineFour);
        Assert.assertEquals(address.getLineFive(), lineFive);
        Assert.assertEquals(address.getStreetName(), streetName);
        Assert.assertEquals(address.getCityName(), cityName);
        Assert.assertEquals(address.getCitySubDivisionName(), citySubDivisionName);
        Assert.assertEquals(address.getCountry(), country);
        Assert.assertEquals(address.getCountrySubDivision(), countrySubDivision);
        Assert.assertEquals(address.getBuildingNumber(), buildingNumber);

    }
}
