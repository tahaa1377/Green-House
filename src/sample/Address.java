package sample;

import java.util.Objects;

public class Address {
    private String ostan,city,street,code_posti;

    public Address(String ostan, String city, String street, String code_posti) {
        this.ostan = ostan;
        this.city = city;
        this.street = street;
        this.code_posti = code_posti;
    }

    public String getOstan() {
        return ostan;
    }

    public void setOstan(String ostan) {
        this.ostan = ostan;
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

    public String getCode_posti() {
        return code_posti;
    }

    public void setCode_posti(String code_posti) {
        this.code_posti = code_posti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getOstan(), address.getOstan()) &&
                Objects.equals(getCity(), address.getCity()) &&
                Objects.equals(getStreet(), address.getStreet()) &&
                Objects.equals(getCode_posti(), address.getCode_posti());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOstan(), getCity(), getStreet(), getCode_posti());
    }

    @Override
    public String toString() {
        return "Address{" +
                "ostan='" + ostan + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", code_posti='" + code_posti + '\'' +
                '}';
    }
}
