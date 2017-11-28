package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testInputAddress() {
        Address address = new Address();

        String postCode = "10540";

        String buildingName = "ApartmentKhunPa";

        String firstLineAddress = "Some 1stLineAddress";

        String secondLineAddress = "Some 2ndLineAddress";

        String alley = "4/5";

        String village = "Inwza Village";

        String villageNo = "9";

        String street = "Ladkrabang";

        String buildingNumber = "87/6";

        address.setPostCode(postCode);
        address.setBuildingName(buildingName);
        address.setFirstLineAddress(firstLineAddress);
        address.setSecondLineAddress(secondLineAddress);
        address.setAlley(alley);
        address.setVillage(village);
        address.setVillageNo(villageNo);
        address.setStreet(street);
        address.setBuildingNumber(buildingNumber);

        Assert.assertEquals(address.getPostCode(), postCode);
        Assert.assertEquals(address.getBuildingName(), buildingName);
        Assert.assertEquals(address.getFirstLineAddress(), firstLineAddress);
        Assert.assertEquals(address.getSecondLineAddress(), secondLineAddress);
        Assert.assertEquals(address.getAlley(), alley);
        Assert.assertEquals(address.getVillage(), village);
        Assert.assertEquals(address.getVillageNo(), villageNo);
        Assert.assertEquals(address.getStreet(), street);
        Assert.assertEquals(address.getBuildingNumber(), buildingNumber);

    }
}
