/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screensframework;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    private TableView<LuggageDetails> tablekoffers;
    @FXML
    private TableColumn<LuggageDetails, String> columnidKoffers;
    @FXML
    private TableColumn<LuggageDetails, String> columnGewicht;
    @FXML
    private TableColumn<LuggageDetails, String> columnKleur;
    @FXML
    private TableColumn<LuggageDetails, String> columnVorm;
    @FXML
    private TableColumn<LuggageDetails, String> columnMerk;
    @FXML
    private TableColumn<LuggageDetails, String> columnPassagiers_idPassagiers;
    @FXML
    private Button btnLoad;
    //Initialize observable list to hold out database data
    private ObservableList<LuggageDetails> data;
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

    @FXML

    public void loadDataFromDatabase(ActionEvent actionEvent) {
        try {
            Connection conn = dc.Connect();
            data = FXCollections.observableArrayList();
            // Execute query and store result in a resultset
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM koffers");
            while (rs.next()) {
                //get string from db,whichever way 
                data.add(new LuggageDetails(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }

        } catch (SQLException ex) {
            System.err.println("Error" + ex);
        }

        //Set cell value factory to tableview.
        //NB.PropertyValue Factory must be the same with the one set in model class.
        columnidKoffers.setCellValueFactory(new PropertyValueFactory<>("idKoffers"));
        columnGewicht.setCellValueFactory(new PropertyValueFactory<>("Gewicht"));
        columnKleur.setCellValueFactory(new PropertyValueFactory<>("Kleur"));
        columnVorm.setCellValueFactory(new PropertyValueFactory<>("Vorm"));
        columnMerk.setCellValueFactory(new PropertyValueFactory<>("Merk"));
        columnPassagiers_idPassagiers.setCellValueFactory(new PropertyValueFactory<>("Passagiers_idPassagiers"));

        tablekoffers.setItems(null);
        tablekoffers.setItems(data);

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
