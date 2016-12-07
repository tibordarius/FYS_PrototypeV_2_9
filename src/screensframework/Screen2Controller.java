/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License"). You
 * may not use this file except in compliance with the License. You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
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
 * @author Angie
 */
public class Screen2Controller implements Initializable, ControlledScreen {

    
    /**
     * Initializes the controller class.
     */



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


