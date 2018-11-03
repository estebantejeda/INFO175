package loggin;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LogginController implements Initializable{
	
	//Creación de Variables

    @FXML
    private JFXTextField userField;

    @FXML
    private JFXPasswordField passField;

    @FXML
    private JFXButton logginButton;
    
    @FXML
    private Label warning, closeButton;
    
    //Creación de Métodos
    
    /*
     * handleClose(event): Se encarga de cerrar la ventana al ser presionada la "X".
     */
    
    @FXML
    void handleClose(MouseEvent event) {
    	System.exit(0);
    }

    /*
     * handleLogginButtonAction(event): Toma el usuario y la contraseña tomada por el usuario (En los campos userField y passField
     * para validar si concuerdan o no con la base de datos.
     */
    	
    @FXML
    void handleLogginButtonAction(ActionEvent event) throws IOException {
    	
    	String userName = userField.getText().trim();
    	String userPass = passField.getText().trim();
    	
    	if(userName.equals("") || userPass.equals("")) {
    		warning.setText("Campo Vacío");
    	}
    	
    	/*
    	 * Como no tenemos una conexión con una base de datos aún, creé de manera "arcaica" un loggin con user/user, además de
    	 * que más abajo imprimo en pantalla el nombre de usuario y contraseña que se ingresaron.
    	 * Esta sección será borrada una vez se logre hacer la conexión con la BBDD.
    	 */
    	
    	//Inicio de código temporal con fines Demostrativos
    	else if(userName.equals("user") || userPass.equals("user")) {
    		showList();
    	}
    	
    	System.out.println("Usuario: " + userName);
    	System.out.println("Contraseña: " + userPass);	
    	//Fin de código temporal con fines Demostrativos
    	
    }

	/*
	 * showList(): Se encarga de cerrar la ventana del loggin para dar paso a la lista de vehículos
	 */
	
	public void showList() throws IOException{
		logginButton.getScene().getWindow().hide();
		Stage listHome = new Stage();
		listHome.initStyle(StageStyle.UNDECORATED);
		Parent root = FXMLLoader.load(getClass().getResource("/list/ListOverview.fxml"));
		Scene scene = new Scene(root);
		listHome.setScene(scene);
		listHome.show();
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		warning.setText("");
		
	}
	



}
