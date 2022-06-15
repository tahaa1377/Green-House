package sample;

import java.util.ArrayList;
import java.util.Objects;

public class GreenHouse {

    private String name_green_house;
    private Address address;
    public ArrayList<Section>sections = new ArrayList<>();

    public GreenHouse() {
    }

    public GreenHouse(String name_green_house, Address address) {
        this.name_green_house = name_green_house;
        this.address = address;
    }

    public double total_masahat(){
        double d=0;

        for (Section s:sections) {
            d+=s.getMasaaht();
        }

        return d;
    }

    public double avg_temprater(){
        double d=0;

        for (Section s:sections) {
            d+=(s.getMax_temp_section() - s.getMin_temp_section());
        }

        return d/sections.size();
    }


    public String getName_green_house() {
        return name_green_house;
    }

    public void setName_green_house(String name_green_house) {
        this.name_green_house = name_green_house;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GreenHouse)) return false;
        GreenHouse that = (GreenHouse) o;
        return Objects.equals(getName_green_house(), that.getName_green_house()) &&
                Objects.equals(getAddress(), that.getAddress()) &&
                Objects.equals(getSections(), that.getSections());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName_green_house(), getAddress(), getSections());
    }

    @Override
    public String toString() {
        return "GreenHouse{" +
                "name_green_house='" + name_green_house + '\'' +
                ", address=" + address +
                ", sections=" + sections +
                '}';
    }
}
