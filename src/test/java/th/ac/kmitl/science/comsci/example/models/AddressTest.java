package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testInputAddress() {
        Address address = new Address();

        address.setPostCode(AddressMock.postCode);
        address.setBuildingName(AddressMock.buildingName);
        address.setLineOne(AddressMock.lineOne);
        address.setLineTwo(AddressMock.lineTwo);
        address.setLineThree(AddressMock.lineThree);
        address.setLineFour(AddressMock.lineFour);
        address.setLineFive(AddressMock.lineFive);
        address.setStreetName(AddressMock.streetName);
        address.setCityName(AddressMock.cityName);
        address.setCitySubDivisionName(AddressMock.citySubDivisionName);
        address.setCountry(AddressMock.country);
        address.setCountrySubDivision(AddressMock.countrySubDivision);
        address.setBuildingNumber(AddressMock.buildingNumber);
        
        Assert.assertEquals(address.getPostCode(), AddressMock.postCode);
        Assert.assertEquals(address.getBuildingName(), AddressMock.buildingName);
        Assert.assertEquals(address.getLineOne(), AddressMock.lineOne);
        Assert.assertEquals(address.getLineTwo(), AddressMock.lineTwo);
        Assert.assertEquals(address.getLineThree(), AddressMock.lineThree);
        Assert.assertEquals(address.getLineFour(), AddressMock.lineFour);
        Assert.assertEquals(address.getLineFive(), AddressMock.lineFive);
        Assert.assertEquals(address.getStreetName(), AddressMock.streetName);
        Assert.assertEquals(address.getCityName(), AddressMock.cityName);
        Assert.assertEquals(address.getCitySubDivisionName(), AddressMock.citySubDivisionName);
        Assert.assertEquals(address.getCountry(), AddressMock.country);
        Assert.assertEquals(address.getCountrySubDivision(), AddressMock.countrySubDivision);
        Assert.assertEquals(address.getBuildingNumber(), AddressMock.buildingNumber);

    }
}
