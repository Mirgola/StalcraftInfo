package com.github.mirgola.stalcraftinfo;

import com.github.mirgola.stalcraftinfo.barter.attachments.*;
import com.github.mirgola.stalcraftinfo.barter.other.*;
import com.github.mirgola.stalcraftinfo.barter.suits.*;
import com.github.mirgola.stalcraftinfo.barter.weapons.*;
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
    private BorderPane menuBar;
    private TableView<Person> personTable;

    private ObservableList<Person> personData = FXCollections.observableArrayList();
    private ObservableList<Barter> bartersData = FXCollections.observableArrayList();

    private ObservableList<AssaultRiflesCount> assaultRiflesCountData = FXCollections.observableArrayList();
    private ObservableList<SubmachineGunsCount> submachineGunsCountData = FXCollections.observableArrayList();
    private ObservableList<MachineGunsCount> machineGunsCountData = FXCollections.observableArrayList();
    private ObservableList<SniperRiflesCount> sniperRiflesCountData = FXCollections.observableArrayList();
    private ObservableList<ShotgunsAndRiflesCount> shotgunsAndRiflesCountData = FXCollections.observableArrayList();
    private ObservableList<PistolsCount> pistolsCountData = FXCollections.observableArrayList();
    private ObservableList<MeleeWeaponsCount> meleeWeaponsCountData = FXCollections.observableArrayList();

    private ObservableList<BackpacksAndPouchesCount> backpacksAndPouchesCountData = FXCollections.observableArrayList();
    private ObservableList<ContainersCount> containersCountData = FXCollections.observableArrayList();
    private ObservableList<DevicesCount> devicesCountData = FXCollections.observableArrayList();
    private ObservableList<CosmeticsCount> cosmeticsCountData = FXCollections.observableArrayList();
    private ObservableList<AccessoriesCount> accessoriesCountData = FXCollections.observableArrayList();
    private ObservableList<OtherCount> otherCountData = FXCollections.observableArrayList();

    private ObservableList<MuzzlesAndSilencersCount> muzzlesAndSilencersCountData = FXCollections.observableArrayList();
    private ObservableList<MagazinesCount> magazinesCountData = FXCollections.observableArrayList();
    private ObservableList<HanguardsAndBracketsCount> hanguardsAndBracketsCountData = FXCollections.observableArrayList();
    private ObservableList<SightsCount> sightsCountData = FXCollections.observableArrayList();
    private ObservableList<HandlesCount> handlesCountData = FXCollections.observableArrayList();
    private ObservableList<OtherAttachmentsCount> otherAttachmentsCountData = FXCollections.observableArrayList();

    private ObservableList<CombatCount> combatCountData = FXCollections.observableArrayList();
    private ObservableList<CombinedCount> combinedCountData = FXCollections.observableArrayList();
    private ObservableList<ScientistCount> scientistCountData = FXCollections.observableArrayList();

    public SciApplication() throws SQLException {
        SciDB.readUsers(this);
        SciDB.readBarter(this);

        SciDB.readAssaultRiflesCount(this);
        SciDB.readSubmachineGunsCount(this);
        SciDB.readMachineGunsCount(this);
        SciDB.readSniperRiflesCount(this);
        SciDB.readShotgunsAndRiflesCount(this);
        SciDB.readPistolsCount(this);
        SciDB.readMeleeWeaponsCount(this);

        SciDB.readBackpacksAndPouchesCount(this);
        SciDB.readContainersCount(this);
        SciDB.readDevicesCount(this);
        SciDB.readCosmeticsCount(this);
        SciDB.readAccessoriesCount(this);
        SciDB.readOtherCount(this);

        SciDB.readMuzzlesAndSilencersCount(this);
        SciDB.readMagazinesCount(this);
        SciDB.readHanguardsAndBracketsCount(this);
        SciDB.readSightsCount(this);
        SciDB.readHandlesCount(this);
        SciDB.readOtherAttachmentsCount(this);

        SciDB.readCombatCount(this);
        SciDB.readCombinedCount(this);
        SciDB.readScientistCount(this);
    }

    public ObservableList<Person> getPersonData() {return personData;}
    public ObservableList<Barter> getBartersData() {return bartersData;}

    public ObservableList<AssaultRiflesCount> getAssaultRiflesCountData() {return assaultRiflesCountData;}
    public ObservableList<SubmachineGunsCount> getSubmachineGunsCountData() {return submachineGunsCountData;}
    public ObservableList<MachineGunsCount> getMachineGunsCountData() {return machineGunsCountData;}
    public ObservableList<SniperRiflesCount> getSniperRiflesCountData() {return sniperRiflesCountData;}
    public ObservableList<ShotgunsAndRiflesCount> getShotgunsAndRiflesCountData() {return shotgunsAndRiflesCountData;}
    public ObservableList<PistolsCount> getPistolsCountData() {return pistolsCountData;}
    public ObservableList<MeleeWeaponsCount> getMeleeWeaponsCountData() {return meleeWeaponsCountData;}

    public ObservableList<BackpacksAndPouchesCount> getBackpacksAndPouchesCountData() {return backpacksAndPouchesCountData;}
    public ObservableList<ContainersCount> getContainersCountData() {return containersCountData;}
    public ObservableList<DevicesCount> getDevicesCountData() {return devicesCountData;}
    public ObservableList<CosmeticsCount> getCosmeticsCountData() {return cosmeticsCountData;}
    public ObservableList<AccessoriesCount> getAccessoriesCountData() {return accessoriesCountData;}
    public ObservableList<OtherCount> getOtherCountData() {return otherCountData;}

    public ObservableList<MuzzlesAndSilencersCount> getMuzzlesAndSilencersCountData() {return muzzlesAndSilencersCountData;}
    public ObservableList<MagazinesCount> getMagazinesCountData() {return magazinesCountData;}
    public ObservableList<HanguardsAndBracketsCount> getHanguardsAndBracketsCountData() {return hanguardsAndBracketsCountData;}
    public ObservableList<SightsCount> getSightsCountData() {return sightsCountData;}
    public ObservableList<HandlesCount> getHandlesCountData() {return handlesCountData;}
    public ObservableList<OtherAttachmentsCount> getOtherAttachmentsCountData() {return otherAttachmentsCountData;}

    public ObservableList<CombatCount> getCombatCountData() {return combatCountData;}
    public ObservableList<CombinedCount> getCombinedCountData() {return combinedCountData;}
    public ObservableList<ScientistCount> getScientistCountData() {return scientistCountData;}

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        this.primaryStage.initStyle(StageStyle.TRANSPARENT);

        initStage();
        showMenuBar();
    }

    // Инициализация заголовка
    public void initStage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("Stage.fxml"));
        stage = (BorderPane) fxmlLoader.load();

        scene = new Scene(stage);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        StageController controller = fxmlLoader.getController();
        controller.setSciApplication(this);
    }

    // Инициализация корневого макета
    public void showMenuBar() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("MenuBar.fxml"));
        menuBar = (BorderPane) fxmlLoader.load();

        stage.setCenter(menuBar);
        showPersonInfo();

        MenuBarController controller = fxmlLoader.getController();
        controller.setSciApplication(this);
        controller.setPersonTable(personTable);
    }

    // Показываем в корневом макете сведения об персонажах
    public void showPersonInfo() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("PersonInfo.fxml"));
        AnchorPane personInfo = (AnchorPane) fxmlLoader.load();

        menuBar.setCenter(personInfo);

        PersonInfoController controller = fxmlLoader.getController();
        controller.setSciApplication(this);
        personTable = controller.getPersonTable();
    }

    // инициализация окна Редактирование персонажа
    public boolean showUserEdit(String stageLabel, StringBuilder nickname, StringBuilder fraction) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("PersonEdit.fxml"));
            AnchorPane userEdit = (AnchorPane) fxmlLoader.load();

            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(primaryStage);
            Scene scene = new Scene(userEdit);
            stage.setScene(scene);

            PersonEditController controller = fxmlLoader.getController();
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

    // Инициализация окна Редактирование информации персонажа
    public boolean showPersonInfoEdin(Person person) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("PersonInfoEdit.fxml"));
            AnchorPane personInfoEdit = (AnchorPane) fxmlLoader.load();

            // Создаем диалоговое окно
            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(primaryStage);
            Scene scene = new Scene(personInfoEdit);
            stage.setScene(scene);


            // Передаём адресата в контроллер
            PersonInfoEditController controller = fxmlLoader.getController();
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

        // Инициализация меню бартера
        FXMLLoader fxmlLoader1 = new FXMLLoader(SciApplication.class.getResource("MenuBarBarter.fxml"));
        BorderPane menuBarBarter = (BorderPane) fxmlLoader1.load();

        stageBarter.setCenter(menuBarBarter);

        MenuBarBarterController controller1 = fxmlLoader1.getController();
        controller1.setBarter(menuBarBarter);
        controller1.setPerson(personTable.getSelectionModel().getSelectedItem());
        controller1.setSciApplication(this);

        //
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
