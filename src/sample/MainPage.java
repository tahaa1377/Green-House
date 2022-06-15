package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;

import java.awt.*;
import java.io.File;

public class MainPage {


    @FXML
    private Label flower_count;

    @FXML
    private ImageView image_plant;

    @FXML
    private Label lbl_area;

    @FXML
    private Label lbl_search;

    @FXML
    private Label lbl_temp;

    @FXML
    private ListView<String> list_plant;

    @FXML
    private TextField text_fild_searcg;

    ObservableList<String>observableList = FXCollections.observableArrayList();


    @FXML
    void btn_calculate(ActionEvent event) {

        GreenHouse greenHouse = add();
        lbl_area.setText(String.valueOf(greenHouse.total_masahat())+ " m^2");
        lbl_temp.setText(String.valueOf( greenHouse.avg_temprater())+ " centigrad");

        int count=0;
        for (Section s:greenHouse.sections) {

            for (Plant p:s.plants) {
                count++;
            }
        }


        flower_count.setText(String.valueOf(count));

    }

    @FXML
    void btn_show(ActionEvent event) {
        GreenHouse greenHouse = add();


        for (Section s:greenHouse.sections) {

            for (Plant p:s.plants) {
                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append("              ").append(p.getPlant_name()).append("              ").append(p.getPlant_type()).append("                   ").
                        append(p.getAge()).append("          ").append("          ").append(p.getMin_temp()).append("              ").append("      ").append(p.getMax_temp());
                observableList.add(stringBuilder.toString());
            }
        }

        list_plant.setItems(observableList);
    }

    @FXML
    void press_search(ActionEvent event) {
        GreenHouse greenHouse = add();
        String search = text_fild_searcg.getText();

        for (Section s:greenHouse.sections) {

            for (Plant p:s.plants) {
                if (p.getPlant_name().trim().equals(search.trim())){

                    lbl_search.setText(p.getPlant_name()+"\n"+p.getPlant_type()+"\n"
                    +p.getPlant_goone()+"\n"+p.getMin_temp()+"\n"+p.getMax_temp());

                    for (Photo photo:p.photos) {

                        File file = new File(photo.getName_file());
                        Image image = new Image(file.toURI().toString());
                        image_plant.setImage(image);
                        break;

                    }




                }
            }
        }

    }

    private GreenHouse add(){
        GreenHouse greenHouse = new GreenHouse();

        Section section1 = new Section(40,20,30);

        Plant plant1 = new Plant("acer palmatum","a","b",10,10,20);
        plant1.photos.add(new Photo("C:\\Users\\Taha\\IdeaProjects\\fxproject\\src\\img\\acer-palmatum-600x600.jpg",600,600,"jpg"));
        section1.plants.add(plant1);
        Plant plant2 = new Plant("aloe vera         ","c","v",20,40,40);
        plant2.photos.add(new Photo("C:\\Users\\Taha\\IdeaProjects\\fxproject\\src\\img\\aloe-vera-600x600.jpg",600,600,"jpg"));
        section1.plants.add(plant2);

        greenHouse.sections.add(section1);

        Section section2 = new Section(30,10,20);

        Plant plant11 = new Plant("anthurium      ","f","g",10,10,20);
        plant1.photos.add(new Photo("C:\\Users\\Taha\\IdeaProjects\\fxproject\\src\\img\\anthurium-600x600.jpg",600,600,"jpg"));
        section1.plants.add(plant11);
        Plant plant21 = new Plant("Broliad guzmia","k","h",20,40,40);
        plant2.photos.add(new Photo("C:\\Users\\Taha\\IdeaProjects\\fxproject\\src\\img\\Bromeliad-guzmania-600x600.jpg",600,600,"jpg"));
        section1.plants.add(plant21);
        greenHouse.sections.add(section2);

        return greenHouse;

    }

}
