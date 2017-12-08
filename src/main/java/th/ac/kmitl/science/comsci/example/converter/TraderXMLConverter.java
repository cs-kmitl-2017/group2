package th.ac.kmitl.science.comsci.example.converter;

import th.ac.kmitl.science.comsci.example.models.Trader;

public class TraderXMLConverter {

    private String traderTag;

    private String id ;

    private  String globalId;

    private String name;

    private String taxId;

    private String uriId;

    private  String email;

    private String xmlCode;

    public TraderXMLConverter (Trader trader, String traderTag){

        EnumTraderTags traderTags = EnumTraderTags.valueOf(traderTag);
        this.traderTag = traderTags.getTraderTags();
        id = trader.getId();
        globalId = trader.getGlobalId();
        name = trader.getName();
        taxId = trader.getTaxId();
        uriId = trader.getUriId();
        email = trader.getEmail();
        setXml();
    }

    public void setXml() {
        String xmlCode = "<ram:"+traderTag+"> "
                +"\n\t<ram:ID> "+id+" </ram:ID>"
                +"\n\t<ram:GlobalID> "+globalId+" </ram:GlobalID>"
                +"\n\t<ram:Name> "+name+" </ram:Name>"
                +"\n</ram:"+traderTag+">"
                +"\n<ram:SpecifiedClLegalOrganization> "
                +"\n\t<ram:ID> "+taxId+" </ram:ID>"
                +"\n</ram:SpecifiedClLegalOrganization> ";
        this.xmlCode = xmlCode;
    }

    public String getXml() {
        return this.xmlCode;
    }

    public String getTraderTag(){
        return this.traderTag;
    }
}
