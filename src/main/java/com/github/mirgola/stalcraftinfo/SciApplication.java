package com.github.mirgola.stalcraftinfo;

import com.github.mirgola.stalcraftinfo.barter.weapons.MeleeWeaponsCount;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
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
    private TableView<Person> personTable;
    private ObservableList<Person> personData = FXCollections.observableArrayList();
    private ObservableList<Barter> bartersData = FXCollections.observableArrayList();
    private ObservableList<MeleeWeaponsCount> meleeWeaponsCountData = FXCollections.observableArrayList();

    public SciApplication() throws SQLException {
        SciDB.readUsers(this);
        SciDB.readBarter(this);
        SciDB.readMeleeWeaponsCount(this);
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    public ObservableList<Barter> getBartersData() {
        return bartersData;
    }

    public ObservableList<MeleeWeaponsCount> getBarterMeleeWeaponsData() {
        return meleeWeaponsCountData;
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        this.primaryStage.initStyle(StageStyle.TRANSPARENT);

        initStage();
        initRootLayout();
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
        showPersonInfo();

        RootLayoutController controller = fxmlLoader.getController();
        controller.setSciApplication(this);
        controller.setPersonTable(personTable);
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
        personTable = controller.getPersonTable();
    }

    public boolean showUserEdit(String stageLabel, StringBuilder nickname, StringBuilder fraction) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("UserEdit.fxml"));
            AnchorPane userEdit = (AnchorPane) fxmlLoader.load();

            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(primaryStage);
            Scene scene = new Scene(userEdit);
            stage.setScene(scene);

            UserEditController controller = fxmlLoader.getController();
            controller.setStage(stage);
            controller.setStageLabel(stageLabel);
            controller.setComboBox();
            controller.setUser(nickname.toString(), fraction.toString());

            if(!nickname.isEmpty()){
                nickname.delete(0, nickname.length());
            }
            if(!fraction.isEmpty()){
                fraction.delete(0, fraction.length());
            }

            stage.showAndWait();

            nickname.append(controller.getNickname());
            fraction.append(controller.getFraction());

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
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
    public void showBarter(PersonInfoController personInfoController) throws IOException{
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
        controller1.setPerson(personTable.getSelectionModel().getSelectedItem());
        controller1.setSciApplication(this);

        controller.setPersonInfoController(personInfoController);
        controller.setPerson(personTable.getSelectionModel().getSelectedItem());
    }

    // Возвращает главную сцену.
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public Scene getScene() {
        return scene;
    }
}
