package sample;

import java.util.Objects;

public class Photo {

    private String name_file;
    private int width,height;
    private String format_photo;

    public Photo(String name_file, int width, int height, String format_photo) {
        this.name_file = name_file;
        this.width = width;
        this.height = height;
        this.format_photo = format_photo;
    }

    public String getName_file() {
        return name_file;
    }

    public void setName_file(String name_file) {
        this.name_file = name_file;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFormat_photo() {
        return format_photo;
    }

    public void setFormat_photo(String format_photo) {
        this.format_photo = format_photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Photo)) return false;
        Photo photo = (Photo) o;
        return getWidth() == photo.getWidth() &&
                getHeight() == photo.getHeight() &&
                Objects.equals(getName_file(), photo.getName_file()) &&
                Objects.equals(getFormat_photo(), photo.getFormat_photo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName_file(), getWidth(), getHeight(), getFormat_photo());
    }

    @Override
    public String toString() {
        return "Photo{" +
                "name_file='" + name_file + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", format_photo='" + format_photo + '\'' +
                '}';
    }
}
