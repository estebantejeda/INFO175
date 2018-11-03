package client;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
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

public class ClientController implements Initializable{

    @FXML
    private JFXButton vehicleButton, historicalButton, clientButton, logginOutButton;

    @FXML
    private Label nameLabel, lastNameLabel, emailLabel, rutLabel, adressLabel ,phoneLabel;
    
    @FXML
    private Label brandLabel, patentLabel, costLabel, modelLabel, startLabel, finishLabel;
    
    @FXML
    private Label traderName, closeButton;

    @FXML
    private ImageView carPhoto;

    @FXML
    private MaterialDesignIconView estade;

    //Creación de Métodos
    
    /*
     * showVehicle(): Se encarga de mostrar la lista de vehículos para arrendar
     */
    
    @FXML
    void showVehicle(ActionEvent event) throws IOException {
    	changeOverview(vehicleButton, "/list/ListOverview.fxml");
    }
    
    /*
     * showClient(): Se encarga de cerrar la ventana de vehículos para iniciar el buscador de clientes
     */
    
    @FXML
    void showClient(ActionEvent event) throws IOException{
		changeOverview(clientButton, "/clientLoggin/ClientLogginOverview.fxml");
	}
    
    /*
     * showHistorical(): Se encarga de cerrar la ventana de vehículos para mostrar el historial de arriendos
     */    
    
    @FXML
    void showHistorical(ActionEvent event) throws IOException {
    	changeOverview(historicalButton, "/history/HistoryOverview.fxml");
    }
    
    /*
     * logginOut(): Se encarga de cerrar la sesión actual y mostrar la pantalla de loggin
     */    

    @FXML
    void logginOut(ActionEvent event) throws IOException {
    	changeOverview(logginOutButton, "/loggin/LogginOverview.fxml");
    }
    
    /*
     * handleClose(): Se encarga de cerrar la ventana al ser presionada la "X".
     */
    
    @FXML
    void handleClose(MouseEvent event) {
    	System.exit(0);
    }

    /*
     * changeOverview(): Este método se creó con el fin de facilitar el cambio entre ventanas. Antes había que programar a mano cada cambio entre las vistas,
     * mientras que ahora solo se debe llamar al método con el nombre del botón que realiza la acción (button) y la ruta de la vista que se quiere ejecutar
     * (path).
     */    
    
    void changeOverview(JFXButton button, String path) throws IOException{
    	button.getScene().getWindow().hide();
    	Stage newView = new Stage();
    	newView.initStyle(StageStyle.UNDECORATED);
    	Parent root = FXMLLoader.load(getClass().getResource(path));
    	Scene scene = new Scene(root);
    	newView.setScene(scene);
    	newView.show();
    } 

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
