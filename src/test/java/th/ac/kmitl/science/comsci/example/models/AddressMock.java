package th.ac.kmitl.science.comsci.example.models;

import th.ac.kmitl.science.comsci.example.utilities.CityMapping;
import th.ac.kmitl.science.comsci.example.utilities.CitySubDivisionMapping;
import th.ac.kmitl.science.comsci.example.utilities.CountrySubDivisionMapping;

public class AddressMock {
    
        public static String postCode = "10540";
        public static String buildingName = "Chalong Apartment";
        public static String lineOne = "419/287 M.9 PremruthaiVillage Bangna-Trad Soi 6";
        public static String lineTwo = "Bangchalong Bangphli Samutprakan, Thailand";
        public static String lineThree = "Bangna-Trad Soi 6";
        public static String lineFour = "PremruthaiVillage";
        public static String lineFive = "M.9";
        public static String streetName = "Bangna-Trad";
        public static Mapping cityName = CityMapping.getMapping();
        public static Mapping citySubDivisionName = CitySubDivisionMapping.getMapping();
        public static String country = "Thailand";
        public static Mapping countrySubDivision = CountrySubDivisionMapping.getMapping();
        public static String buildingNumber = "419/287";
    
}
