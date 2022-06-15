package sample;

import java.util.ArrayList;
import java.util.Objects;

public class Section {

    ArrayList<Plant>plants = new ArrayList<>();
    private double masaaht;
    private int min_temp_section,max_temp_section;

    public Section(double masaaht, int min_temp_section, int max_temp_section) {
        this.masaaht = masaaht;
        this.min_temp_section = min_temp_section;
        this.max_temp_section = max_temp_section;
    }

    public ArrayList<Plant> getPlants() {
        return plants;
    }

    public void setPlants(ArrayList<Plant> plants) {
        this.plants = plants;
    }

    public double getMasaaht() {
        return masaaht;
    }

    public void setMasaaht(double masaaht) {
        this.masaaht = masaaht;
    }

    public int getMin_temp_section() {
        return min_temp_section;
    }

    public void setMin_temp_section(int min_temp_section) {
        this.min_temp_section = min_temp_section;
    }

    public int getMax_temp_section() {
        return max_temp_section;
    }

    public void setMax_temp_section(int max_temp_section) {
        this.max_temp_section = max_temp_section;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Section)) return false;
        Section section = (Section) o;
        return Double.compare(section.getMasaaht(), getMasaaht()) == 0 &&
                getMin_temp_section() == section.getMin_temp_section() &&
                getMax_temp_section() == section.getMax_temp_section() &&
                Objects.equals(getPlants(), section.getPlants());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlants(), getMasaaht(), getMin_temp_section(), getMax_temp_section());
    }

    @Override
    public String toString() {
        return "Section{" +
                "plants=" + plants +
                ", masaaht=" + masaaht +
                ", min_temp_section=" + min_temp_section +
                ", max_temp_section=" + max_temp_section +
                '}';
    }
}
