package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Main extends Application {
    private TableView<WordCounter> table;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Asssignment1");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

        /* creates the table (for the center of the userinterface */
        table = new TableView<>();
        //table.setItems(TestFile.getSpammProbabiility());
        table.setEditable(true);

        TableColumn<TestFile,Double> spamProbability = null;
        spamProbability = new TableColumn<>("File");
        spamProbability.setMinWidth(100);
        spamProbability.setCellValueFactory(new PropertyValueFactory<>("File"));

    }


    public static void main(String[] args) {
        launch(args);
    }
}
