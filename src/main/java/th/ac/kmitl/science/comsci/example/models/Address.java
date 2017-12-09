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

    private String buildingNumber;

    public Address(String postCode, String buildingName, String lineOne, String lineTwo,
                   String lineThree, String lineFour, String lineFive, String streetName,
                   String buildingNumber){
        setPostCode(postCode);
        setBuildingName(buildingName);
        setLineOne(lineOne);
        setLineTwo(lineTwo);
        setLineThree(lineThree);
        setLineFour(lineFour);
        setLineFive(lineFive);
        setStreetName(streetName);
        setBuildingNumber(buildingNumber);
    }

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

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

}
