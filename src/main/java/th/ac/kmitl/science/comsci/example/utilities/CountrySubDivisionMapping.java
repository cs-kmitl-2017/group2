package th.ac.kmitl.science.comsci.example.utilities;

import th.ac.kmitl.science.comsci.example.models.Mapping;
import java.util.Map;
import java.util.HashMap;

public class CountrySubDivisionMapping extends Mapping {
    private Map<String, String> mappingCountrySubDivision = new HashMap<>();
    private String CountrySubDivisionID;
    private static Mapping map = null; 
    
    private CountrySubDivisionMapping() {
        mappingCountrySubDivision.put("bangkok", "10");
        mappingCountrySubDivision.put("samut prakan", "11");
        mappingCountrySubDivision.put("nonthaburi", "12");
        mappingCountrySubDivision.put("pathum thani", "13");
        mappingCountrySubDivision.put("phra nakhon si ayutthaya", "14");
        mappingCountrySubDivision.put("ang thong", "15");
        mappingCountrySubDivision.put("lopburi", "16");
        mappingCountrySubDivision.put("sing buri", "17");
        mappingCountrySubDivision.put("chai nat", "18");
        mappingCountrySubDivision.put("saraburi", "19");
        mappingCountrySubDivision.put("chonburi", "20");
        mappingCountrySubDivision.put("rayong", "21");
        mappingCountrySubDivision.put("chanthaburi", "22");
        mappingCountrySubDivision.put("trat", "23");
        mappingCountrySubDivision.put("chachoengsao", "24");
        mappingCountrySubDivision.put("prachinburi", "25");
        mappingCountrySubDivision.put("nakhon nayok", "26");
        mappingCountrySubDivision.put("sa kaeo", "27");
        mappingCountrySubDivision.put("nakhon ratchasima", "30");
        mappingCountrySubDivision.put("buriram", "31");
        mappingCountrySubDivision.put("surin", "32");
        mappingCountrySubDivision.put("sisaket", "33");
        mappingCountrySubDivision.put("ubon ratchathani", "34");
        mappingCountrySubDivision.put("yasothon", "35");
        mappingCountrySubDivision.put("chaiyaphum", "36");
        mappingCountrySubDivision.put("amnat charoen", "37");
        mappingCountrySubDivision.put("bueng kan", "38");
        mappingCountrySubDivision.put("nong bua lam phu", "39");
        mappingCountrySubDivision.put("khon kaen", "40");
        mappingCountrySubDivision.put("udon thani", "41");
        mappingCountrySubDivision.put("loei", "42");
        mappingCountrySubDivision.put("nong khai", "43");
        mappingCountrySubDivision.put("maha sarakham", "44");
        mappingCountrySubDivision.put("roi et", "45");
        mappingCountrySubDivision.put("kalasin", "46");
        mappingCountrySubDivision.put("sakon nakhon", "47");
        mappingCountrySubDivision.put("nakhon phanom", "48");
        mappingCountrySubDivision.put("mukdahan", "49");
        mappingCountrySubDivision.put("chiang mai", "50");
        mappingCountrySubDivision.put("lamphun", "51");
        mappingCountrySubDivision.put("lumpang", "52");
        mappingCountrySubDivision.put("uttaradit", "53");
        mappingCountrySubDivision.put("phrae", "54");
        mappingCountrySubDivision.put("nan", "55");
        mappingCountrySubDivision.put("phayao", "56");
        mappingCountrySubDivision.put("chiang rai", "57");
        mappingCountrySubDivision.put("mae hong son", "58");
        mappingCountrySubDivision.put("nakhon sawan", "60");
        mappingCountrySubDivision.put("uthai thani", "61");
        mappingCountrySubDivision.put("kamphaeng phet", "62");
        mappingCountrySubDivision.put("tak", "63");
        mappingCountrySubDivision.put("sukhothai", "64");
        mappingCountrySubDivision.put("phitsanulok", "65");
        mappingCountrySubDivision.put("phichit", "66");
        mappingCountrySubDivision.put("phechabun", "67");
        mappingCountrySubDivision.put("ratchaburi", "70");
        mappingCountrySubDivision.put("kanchanaburi", "71");
        mappingCountrySubDivision.put("suphan buri", "72");
        mappingCountrySubDivision.put("nakhon pathom", "73");
        mappingCountrySubDivision.put("samut sakhon", "74");
        mappingCountrySubDivision.put("samut songkhram", "75");
        mappingCountrySubDivision.put("phetchaburi", "76");
        mappingCountrySubDivision.put("prachuap khiri khan", "77");
        mappingCountrySubDivision.put("nakhon si thammarat", "80");
        mappingCountrySubDivision.put("krabi", "81");
        mappingCountrySubDivision.put("phang nga", "82");
        mappingCountrySubDivision.put("phuket", "83");
        mappingCountrySubDivision.put("surat thani", "84");
        mappingCountrySubDivision.put("ranong", "85");
        mappingCountrySubDivision.put("chumphon", "86");
        mappingCountrySubDivision.put("songkhla", "90");
        mappingCountrySubDivision.put("satun", "91");
        mappingCountrySubDivision.put("trang", "92");
        mappingCountrySubDivision.put("phatthalung", "93");
        mappingCountrySubDivision.put("pattani", "94");
        mappingCountrySubDivision.put("yala", "95");
        mappingCountrySubDivision.put("narathiwat", "96");
    }
    
    public static Mapping getMapping() {
        if (map == null) {
                map = new CountrySubDivisionMapping();
        }
        return map;
    }

    @Override
    public String mappingtosetId(String name) { 
        CountrySubDivisionID = mappingCountrySubDivision.get(name.toLowerCase());
        return CountrySubDivisionID;
    }
}