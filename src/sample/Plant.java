package sample;

import java.util.ArrayList;
import java.util.Objects;

public class Plant {

    private String plant_name;
    private String plant_type;
    private String plant_goone;
    private int age;
    ArrayList<Photo>photos = new ArrayList<Photo>();
    private int min_temp;
    private int max_temp;

    public Plant(String plant_name, String plant_type,
                 String plant_goone, int age, int min_temp, int max_temp) {
        this.plant_name = plant_name;
        this.plant_type = plant_type;
        this.plant_goone = plant_goone;
        this.age = age;
        this.min_temp = min_temp;
        this.max_temp = max_temp;
    }

    public String getPlant_name() {
        return plant_name;
    }

    public void setPlant_name(String plant_name) {
        this.plant_name = plant_name;
    }

    public String getPlant_type() {
        return plant_type;
    }

    public void setPlant_type(String plant_type) {
        this.plant_type = plant_type;
    }

    public String getPlant_goone() {
        return plant_goone;
    }

    public void setPlant_goone(String plant_goone) {
        this.plant_goone = plant_goone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    public int getMin_temp() {
        return min_temp;
    }

    public void setMin_temp(int min_temp) {
        this.min_temp = min_temp;
    }

    public int getMax_temp() {
        return max_temp;
    }

    public void setMax_temp(int max_temp) {
        this.max_temp = max_temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;
        Plant plant = (Plant) o;
        return getAge() == plant.getAge() &&
                getMin_temp() == plant.getMin_temp() &&
                getMax_temp() == plant.getMax_temp() &&
                Objects.equals(getPlant_name(), plant.getPlant_name()) &&
                Objects.equals(getPlant_type(), plant.getPlant_type()) &&
                Objects.equals(getPlant_goone(), plant.getPlant_goone()) &&
                Objects.equals(getPhotos(), plant.getPhotos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlant_name(), getPlant_type(), getPlant_goone(), getAge(), getPhotos(), getMin_temp(), getMax_temp());
    }

    @Override
    public String toString() {
        return "Plant{" +
                "plant_name='" + plant_name + '\'' +
                ", plant_type='" + plant_type + '\'' +
                ", plant_goone='" + plant_goone + '\'' +
                ", age=" + age +
                ", photos=" + photos +
                ", min_temp=" + min_temp +
                ", max_temp=" + max_temp +
                '}';
    }
}
