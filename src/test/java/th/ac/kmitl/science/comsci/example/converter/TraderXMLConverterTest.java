package th.ac.kmitl.science.comsci.example.converter;

import junit.framework.Assert;
import org.junit.Test;
import th.ac.kmitl.science.comsci.example.models.Trader;

public class TraderXMLConverterTest {

    String id = "id58050276";

    String globalId = "GId58050276";

    String name = "mkproduct office";

    String taxId = "TId58050276";

    String uriId = "mkproductinfo@mkproduct.com";

    String email = "mkproductinfo@mkproduct.com";

    @Test
    public void testTraderXMLConverterTest() {
        Trader buyer = new Trader(id, globalId, name, taxId, uriId, email);
        TraderXMLConverter buyerXMLConverter = new TraderXMLConverter(buyer,"buyer");
        Trader seller = new Trader(id, globalId, name, taxId, uriId, email);
        TraderXMLConverter sellerXMLConverter = new TraderXMLConverter(seller,"seller");


        assert(!buyerXMLConverter.getXml().equals(null));
        assert(buyerXMLConverter.getTraderTag().equals("BuyerCITradeParty"));
        assert(!sellerXMLConverter.getXml().equals(null));
        assert(sellerXMLConverter.getTraderTag().equals("SellerCITradeParty"));
    }

}
