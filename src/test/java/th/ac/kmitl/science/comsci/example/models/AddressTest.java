package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testInputAddress() {

        String postCode = "10540";

        String buildingName = "Chalong Apartment";

        String lineOne = "419/287 M.9 PremruthaiVillage Soi 6 Bangna-Trad";

        String lineTwo = "Bangchalong Bangphee Samutprakan, Thailand";

        String lineThree = "6";

        String lineFour = "PremruthaiVillage";

        String lineFive = "9";

        String streetName = "Bangna-Trad";

        String buildingNumber = "419/287";

        Address address = new Address(postCode, buildingName, lineOne, lineTwo, lineThree, lineFour, lineFive, streetName, buildingNumber);

        Assert.assertEquals(address.getPostCode(), postCode);
        Assert.assertEquals(address.getBuildingName(), buildingName);
        Assert.assertEquals(address.getLineOne(), lineOne);
        Assert.assertEquals(address.getLineTwo(), lineTwo);
        Assert.assertEquals(address.getLineThree(), lineThree);
        Assert.assertEquals(address.getLineFour(), lineFour);
        Assert.assertEquals(address.getLineFive(), lineFive);
        Assert.assertEquals(address.getStreetName(), streetName);
        Assert.assertEquals(address.getBuildingNumber(), buildingNumber);

    }
}
