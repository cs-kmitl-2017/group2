package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testInputAddress() {
        Address address = new Address();

        String postCode = "10540";

        String buildingName = "";

        String lineOne = "419/287 M.9 PremruthaiVillage Soi 6 Bangna-Trad";

        String lineTwo = "Bangchalong Bangphee Samutprakan, Thailand";

        String lineThree = "6";

        String lineFour = "PremruthaiVillage";

        String lineFive = "9";

        String streetName = "Bangna-Trad";

        String buildingNumber = "419/287";

        address.setPostCode(postCode);
        address.setBuildingName(buildingName);
        address.setLineOne(lineOne);
        address.setLineTwo(lineTwo);
        address.setLineThree(lineOne);
        address.setLineFour()(lineTwo);
        address.setLineFive(lineThree);
        address.setStreetName(streetName);
        address.setBuildingNumber(buildingNumber);

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
