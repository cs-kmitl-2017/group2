package th.ac.kmitl.science.comsci.example.converter;

public enum EnumTraderTags {
    buyer("BuyerCITradeParty"),
    seller("SellerCITradeParty"),
    ;

    public String traderTags;

    EnumTraderTags(String traderTags){
        this.traderTags = traderTags;
    }

    public String getTraderTags(){
        return this.traderTags;
    }
}
