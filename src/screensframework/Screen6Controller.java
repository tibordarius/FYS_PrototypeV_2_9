/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screensframework;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author t
 */
public class Screen6Controller implements Initializable, ControlledScreen {

    @FXML
    private Label label;
    @FXML
    private TableView<LuggageDetailsKoffers> tablekoffers;
    @FXML
    private TableColumn<LuggageDetailsKoffers, String> columnidKoffers;
    @FXML
    private TableColumn<LuggageDetailsKoffers, String> columnGewicht;
    @FXML
    private TableColumn<LuggageDetailsKoffers, String> columnKleur;
    @FXML
    private TableColumn<LuggageDetailsKoffers, String> columnVorm;
    @FXML
    private TableColumn<LuggageDetailsKoffers, String> columnMerk;
    @FXML
    private TableColumn<LuggageDetailsKoffers, String> columnPassagiers_idPassagiers;
    @FXML
    private Button btnLoad;
    //Initialize observable list to hold out database data
    private ObservableList<LuggageDetailsKoffers> data;
    private DbConnection dc;

    ScreensController myController;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dc = new DbConnection();

    }



    /**
     *
     * @param screenParent
     */
    @Override
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    @FXML
    private void goToScreen1(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen1ID);
    }

    @FXML
    private void goToScreen2(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen2ID);
    }

    @FXML
    private void goToScreen3(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen3ID);
    }

    @FXML
    private void goToScreen4(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen4ID);
    }

    @FXML
    private void goToScreen5(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen5ID);
    }

    @FXML
    private void goToScreen6(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen6ID);
    }

    @FXML
    private void goToScreen7(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen7ID);
    }

    @FXML
    private void goToScreen8(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen8ID);
    }

}
