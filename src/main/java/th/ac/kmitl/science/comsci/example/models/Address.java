package th.ac.kmitl.science.comsci.example.models;

public class Address {

    private String postCode;

    private String buildingName;

    private String lineOne;

    private String lineTwo;

    private String lineThree;

    private String lineFour;

    private String lineFive;

    private String streetName;
    
    private Mapping cityName;
    
    private Mapping citySubDivisionName;
    
    private String country;
    
    private Mapping countrySubDivision;
    
    private String buildingNumber;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public String getLineThree() {
        return lineThree;
    }

    public void setLineThree(String lineThree) {
        this.lineThree = lineThree;
    }

    public String getLineFour() {
        return lineFour;
    }

    public void setLineFour(String lineFour) {
        this.lineFour = lineFour;
    }

    public String getLineFive() {
        return lineFive;
    }

    public void setLineFive(String lineFive) {
        this.lineFive = lineFive;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    
    public Mapping getCityName() {
        return cityName;
    }

    public void setCityName(Mapping cityName) {
        this.cityName = cityName;
    }
    
    public Mapping getCitySubDivisionName() {
        return citySubDivisionName;
    }

    public void setCitySubDivisionName(Mapping citySubDivisionName) {
        this.citySubDivisionName = citySubDivisionName;
    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public Mapping getCountrySubDivision() {
        return countrySubDivision;
    }

    public void setCountrySubDivision(Mapping countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }
    
    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

}
