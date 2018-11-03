package list;

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

public class ListController implements Initializable{

	//Creación de Variables
	
    @FXML
    private JFXButton historicalButton, clientButton, logginOutButton;

    @FXML
    private Label traderName, closeButton;

    @FXML
    private MaterialDesignIconView previousButton, nextButton;

    @FXML
    private FontAwesomeIconView searchButton;

    @FXML
    private ImageView carPhoto1, carPhoto2, carPhoto3, carPhoto4;

    @FXML
    private Label brandLabel1, modelLabel1, typeLabel1, capacityLabel1, stockLabel1, costLabel1;
    
    @FXML
    private Label brandLabel2, modelLabel2, typeLabel2, capacityLabel2, stockLabel2, costLabel2;
    
    @FXML
    private Label brandLabel3, modelLabel3, typeLabel3, capacityLabel3, stockLabel3, costLabel3;
    
    @FXML
    private Label brandLabel4, modelLabel4, typeLabel4, capacityLabel4, stockLabel4, costLabel4;

    @FXML
    private MaterialDesignIconView estade1, estade2, estade3, estade4;

    //Creación de Métodos
    
    
    /*
     * showHistorical(): Se encarga de cerrar la ventana de vehículos para mostrar el historial de arriendos
     */
   
    @FXML
    void showHistorical(ActionEvent event) throws IOException{
		changeOverview(historicalButton, "/history/HistoryOverview.fxml");
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
     * handleEstadeXActionButton(): Se encargan de cerrar la ventana de la lista de autos para poder
     * mostrar el formulario de arriendo
     */
    
    @FXML
    void handleEstade1ActionButton(MouseEvent event) throws IOException {
    	changeOverview(estade1, "/form/FormOverview.fxml");
    }

    @FXML
    void handleEstade2ActionButton(MouseEvent event) throws IOException{
    	changeOverview(estade2, "/form/FormOverview.fxml");
    }

    @FXML
    void handleEstade3ActionButton(MouseEvent event) throws IOException{
    	changeOverview(estade3, "/form/FormOverview.fxml");
    }

    @FXML
    void handleEstade4ActionButton(MouseEvent event) throws IOException{
    	changeOverview(estade4, "/form/FormOverview.fxml");
    }
    
    /*
     * handlePreviousButtonAction(): Se encarga de mostrar la página anterior de vehículos disponibles
     */

    @FXML
    void handlePreviousButtonAction(MouseEvent event) {
    	//PENDIENTE
    }
    
    /*
     * handleNextButtonAction(): Se encarga de mostrar la página siguiente de vehículos disponibles
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
    
    void changeOverview(MaterialDesignIconView button, String path) throws IOException{
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
