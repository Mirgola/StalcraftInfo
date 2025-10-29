package com.github.mirgola.stalcraftinfo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.SQLException;

public class SciApplication extends Application {
    private Stage primaryStage;
    private Scene scene;
    private BorderPane stage;
    private BorderPane rootLayout;
    private ObservableList<Person> personData = FXCollections.observableArrayList();

    public SciApplication() throws SQLException {
        SciDB.readUsers(this);
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        this.primaryStage.initStyle(StageStyle.TRANSPARENT);

        initStage();
        initRootLayout();
        showPersonInfo();
    }

    // Инициализация заголовка
    public void initStage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("Stage.fxml"));
        stage = (BorderPane) fxmlLoader.load();

        // Отображаем сцену заголовка
        scene = new Scene(stage);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        StageController controller = fxmlLoader.getController();
        controller.setSciApplication(this);
    }

    // Инициализация корневого макета
    public void initRootLayout() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("RootLayout.fxml"));
        rootLayout = (BorderPane) fxmlLoader.load();

        // Помещаем корневой макет в центр заголовка
        stage.setCenter(rootLayout);
    }

    // Показываем в корневом макете сведения об персонажах
    public void showPersonInfo() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("PersonInfo.fxml"));
        AnchorPane personInfo = (AnchorPane) fxmlLoader.load();

        // Помещаем сведения об персонажах в центр корневого макета
        rootLayout.setCenter(personInfo);

        // Даём контроллеру доступ к главному приложению.
        PersonInfoController controller = fxmlLoader.getController();
        controller.setSciApplication(this);
    }

    public boolean showPersonEdin(Person person) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("PersonEdit.fxml"));
            AnchorPane personEdit = (AnchorPane) fxmlLoader.load();

            // Создаем диалоговое окно
            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(primaryStage);
            Scene scene = new Scene(personEdit);
            stage.setScene(scene);


            // Передаём адресата в контроллер
            PersonEditController controller = fxmlLoader.getController();
            controller.setStage(stage);
            controller.setPerson(person);

            // Отображаем диалоговое окно и ждём, пока пользователь его не закроет
            stage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Инициализация окна бартера
    public void showBarter() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("StageBarter.fxml"));
        BorderPane stageBarter = (BorderPane) fxmlLoader.load();

        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(primaryStage);
        stage.initStyle(StageStyle.TRANSPARENT);
        Scene scene = new Scene(stageBarter);
        stage.setScene(scene);
        stage.show();

        StageBarterController controller = fxmlLoader.getController();
        controller.setStageBarter(stage);

        //
        FXMLLoader fxmlLoader1 = new FXMLLoader(SciApplication.class.getResource("Barter.fxml"));
        BorderPane barter = (BorderPane) fxmlLoader1.load();

        stageBarter.setCenter(barter);

        BarterController controller1 = fxmlLoader1.getController();
        controller1.setBarter(barter);

    }

    // Возвращает главную сцену.
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public Scene getScene() {
        return scene;
    }
}
