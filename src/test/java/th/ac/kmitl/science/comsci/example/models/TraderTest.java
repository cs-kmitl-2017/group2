package th.ac.kmitl.science.comsci.example.models;

import junit.framework.Assert;
import org.junit.Test;

public class TraderTest {

    @Test
    public void testInputSeller() {

        String id = "id58050276";

        String globalId = "GId58050276";

        String name = "mkproduct office";

        String taxId = "TId58050276";

        String uriId = "mkproductinfo@mkproduct.com";

        String email = "mkproductinfo@mkproduct.com";

        Trader trader = new Trader(id, globalId, name, taxId, uriId, email);

        Assert.assertEquals(trader.getId(), id);
        Assert.assertEquals(trader.getGlobalId(), globalId);
        Assert.assertEquals(trader.getName(), name);
        Assert.assertEquals(trader.getTaxId(), taxId);
        Assert.assertEquals(trader.getUriId(), uriId);
        Assert.assertEquals(trader.getEmail(), email);
    }

}
