package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testInputAddress() {

        AddressMock addressMock = new AddressMock();

        Address address = new Address(addressMock.postCode, addressMock.buildingName, addressMock.lineOne, addressMock.lineTwo,
                addressMock.lineThree, addressMock.lineFour, addressMock.lineFive, addressMock.streetName, addressMock.cityName,
                addressMock.citySubDivisionName, addressMock.country, addressMock.countrySubDivision, addressMock.buildingNumber);

        Assert.assertEquals(address.getPostCode(), addressMock.postCode);
        Assert.assertEquals(address.getBuildingName(), addressMock.buildingName);
        Assert.assertEquals(address.getLineOne(), addressMock.lineOne);
        Assert.assertEquals(address.getLineTwo(), addressMock.lineTwo);
        Assert.assertEquals(address.getLineThree(), addressMock.lineThree);
        Assert.assertEquals(address.getLineFour(), addressMock.lineFour);
        Assert.assertEquals(address.getLineFive(), addressMock.lineFive);
        Assert.assertEquals(address.getStreetName(), addressMock.streetName);
        Assert.assertEquals(address.getCityName(), addressMock.cityName);
        Assert.assertEquals(address.getCitySubDivisionName(), addressMock.citySubDivisionName);
        Assert.assertEquals(address.getCountry(), addressMock.country);
        Assert.assertEquals(address.getCountrySubDivision(), addressMock.countrySubDivision);
        Assert.assertEquals(address.getBuildingNumber(), addressMock.buildingNumber);

    }
}
