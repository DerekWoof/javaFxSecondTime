package dayTwoJavaFx;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class Controller {

    @FXML
    private ListView<Door> myListView;

    @FXML
    private Button myButton;


    public void initialize() {
        ObservableList<Door> listViewItems = myListView.getItems();
        listViewItems.add(new Door(true, 200));
        listViewItems.add(new Door(true, 190));
        listViewItems.add(new Door(false, 130));
        listViewItems.add(new Door(false, 220));
        listViewItems.add(new Door(true, 220));

        myButton.setOnAction(event -> {

        });
        myListView.getSelectionModel()
                .selectedItemProperty()
                .addListener(((observable, oldValue, newValue) -> {
                    System.out.println("Poprzednia zaznaczona wartosc: " + oldValue);
                    System.out.println("Nowa zaznaczona wartosc: " + newValue);
                }));

    }
}
