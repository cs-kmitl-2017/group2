package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;

public class SellerTest {

    @Test
    public void testInputSeller() {

        String id = "id58050276";

        String globalId = "GId58050276";

        String name = "thanathat office";

        String taxId = "TId58050276";

        Seller seller = new Seller();

        seller.setId(id);
        seller.setGlobalId(globalId);
        seller.setName(name);
        seller.setTaxId(taxId);

        Assert.assertEquals(seller.getId(),id);
        Assert.assertEquals(seller.getGlobalId(),globalId);
        Assert.assertEquals(seller.getName(),name);
        Assert.assertEquals(seller.getTaxId(),taxId);
    }

}
