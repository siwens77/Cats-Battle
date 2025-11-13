import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class CatFights extends Application{
    public void start(Stage stage) {
        Image image1 = new Image(getClass().getResource("/resources/cat.jpeg").toExternalForm());
        ImageView imageView1 = new ImageView(image1);
        imageView1.setX(100);
        imageView1.setY(75);



        Group root = new Group(imageView1);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Cats Battle");
        stage.setScene(scene);
        stage.show();
    }
}