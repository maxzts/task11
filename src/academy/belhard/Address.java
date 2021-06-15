package academy.belhard;

public class Address {
    private int id;
    private String city;
    private String street;
    private int houseNumber;
    private Integer housePart;
    private Integer apartmentNumber;

    public Address( int id, String city, String street, int houseNumber, Integer housePart, Integer apartmentNumber) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.housePart = housePart;
        this.apartmentNumber = apartmentNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Integer getHousePart() {
        return housePart;
    }

    public void setHousePart(Integer housePart) {
        this.housePart = housePart;
    }

    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(Integer apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return  "Address: " +
                "id-" + id +
                ", city-" + city +
                ", street-" + street +
                ", house_number-" + houseNumber +
                ", house_part-" + housePart +
                ", apartment_number-" + apartmentNumber + "\n";
    }
    public static Address createFoSaving (String city, String street, int houseNumber, Integer housePart, Integer apartmentNumber) {
        return new Address(-1, city, street, houseNumber, housePart, apartmentNumber);
    }
}
