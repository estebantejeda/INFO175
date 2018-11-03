package history;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
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

public class HistoryController implements Initializable{

    @FXML
    private JFXButton vehicleButton, clientButton, logginOutButton;

    @FXML
    private Label traderName, closeButton;

    @FXML
    private MaterialDesignIconView previousButton, nextButton;

    @FXML
    private FontAwesomeIconView searchButton;

    @FXML
    private MaterialDesignIconView estade1, estade2, estade3, estade4;    
    
    @FXML
    private ImageView carPhoto1, carPhoto2, carPhoto3, carPhoto4;

    @FXML
    private Label brandLabel1, patentLabel1, costLabel1, clientLabel1, startLabel1, finishLabel1;
    
    @FXML
    private Label brandLabel2, patentLabel2, costLabel2, clientLabel2, startLabel2, finishLabel2;
    
    @FXML
    private Label brandLabel3, patentLabel3, costLabel3, clientLabel3, startLabel3, finishLabel3;
    
    @FXML
    private Label brandLabel4, patentLabel4, costLabel4, clientLabel4, startLabel4, finishLabel4;    

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
     * logginOut(): Se encarga de cerrar la sesión actual y mostrar la pantalla de loggin
     */
    
    @FXML
    void logginOut(ActionEvent event) throws IOException{
    	changeOverview(logginOutButton, "/loggin/LogginOverview.fxml");
	}
    
    /*
     * handlePreviousButtonAction(): Se encarga de mostrar la página anterior de vehículos no disponibles
     */

    @FXML
    void handelPreviousButtonAction(MouseEvent event) {
    	//PENDIENTE
    }
    
    /*
     * handleNextButtonAction(): Se encarga de mostrar la página siguiente de vehículos no disponibles
     */

    @FXML
    void handleNextButtonAction(MouseEvent event) {
    	//PENDIENTE
    }
    
    /*
     * handleSearchButtonAction(): Se encarga de abrir un panel de búsqueda para encontrar autos que no están 
     * disponibles para el arriendo
     */

    @FXML
    void handleSearchButtonAction(MouseEvent event) {
    	//PENDIENTE
    }
    
    /*
     * handleClose(event): Se encarga de cerrar la ventana al ser presionada la "X".
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
