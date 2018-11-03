package form;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.octicons.OctIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FormController implements Initializable{
	
	//Creación de Variables

    @FXML
    private ImageView carPhoto;

    @FXML
    private Label brandLabel, modelLabel, typeLabel, seatingLabel, stockLabel, costLabel, patentLabel;

    @FXML
    private JFXTextField nameField, lastNameField, rutField, adressField, phoneField, emailField;

    @FXML
    private JFXButton acceptButton, resetAllButton;

    @FXML
    private Label closeButton;
    
    @FXML
    private FontAwesomeIconView backButton;
    
    @FXML
    private OctIconView reportButton;
    
    //Creación de Métodos
    
    /*
     * handleAcceptButtonAction(): Se encarga de guardar todos los datos ingresados del cliente en la base de datos
     * y generar la boleta de arriendo
     */
    
    @FXML
    void HandleAcceptButtonAction(ActionEvent event) {
    	//PENDIENTE
    }

    /*
     * handleResetAllButtonAction(): Se encarga de dejar en blanco todos los datos ingresados por el usuario
     * en el formulario
     */
    
    @FXML
    void HandleResetAllButtonAction(ActionEvent event) {
    	nameField.setText(null);
    	lastNameField.setText(null);
    	rutField.setText(null);
    	adressField.setText(null);
    	phoneField.setText(null);
    	emailField.setText(null);
    }

	/*
	 * handleBack(): Se encarga de cerrar la ventana del formulario para dar paso a la lista de vehículos
	 */
    
    @FXML
    void handleBack(MouseEvent event) throws IOException {
		backButton.getScene().getWindow().hide();
		Stage listHome = new Stage();
		listHome.initStyle(StageStyle.UNDECORATED);
		Parent root = FXMLLoader.load(getClass().getResource("/list/ListOverview.fxml"));
		Scene scene = new Scene(root);
		listHome.setScene(scene);
		listHome.show();
    }
    
    /*
     * handleReportButtonAction(): Se encarga de reportar en caso de que el vehículo presente algún desperfecto
     */
    
    @FXML
    void handleReportButtonAction(MouseEvent event) {
    	//PENDIENTE
    }

    /*
     * handleClose(event): Se encarga de cerrar la ventana al ser presionada la "X".
     */
    
    @FXML
    void handleClose(MouseEvent event) {
    	System.exit(0);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
