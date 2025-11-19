package com.github.mirgola.stalcraftinfo;

import com.github.mirgola.stalcraftinfo.barter.attachments.*;
import com.github.mirgola.stalcraftinfo.barter.other.*;
import com.github.mirgola.stalcraftinfo.barter.suits.CombatController;
import com.github.mirgola.stalcraftinfo.barter.suits.CombinedController;
import com.github.mirgola.stalcraftinfo.barter.suits.ScientistController;
import com.github.mirgola.stalcraftinfo.barter.weapons.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class BarterController {
    private BorderPane barter;
    private Person person;
    private SciApplication sciApplication;

    public void setBarter(BorderPane barter) {
        this.barter = barter;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setSciApplication(SciApplication sciApplication) {
        this.sciApplication = sciApplication;
    }

    // Вызов окна Автоматы
    public void handleAssaultRifles() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/AssaultRifles.fxml"));
        ScrollPane assaultRifles = (ScrollPane) fxmlLoader.load();
        barter.setCenter(assaultRifles);

        AssaultRiflesController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Пистолеты-пулеметы
    @FXML
    private void handleSubmachineGuns() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/SubmachineGuns.fxml"));
        ScrollPane submachineGuns = (ScrollPane) fxmlLoader.load();
        barter.setCenter(submachineGuns);

        SubmachineGunsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Пулеметы
    public void handleMachineGuns() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/MachineGuns.fxml"));
        ScrollPane machineGuns = (ScrollPane) fxmlLoader.load();
        barter.setCenter(machineGuns);

        MachineGunsController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Снайперские винтовки
    public void handleSniperRifles () throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/SniperRifles.fxml"));
        ScrollPane sniperRifles = (ScrollPane) fxmlLoader.load();
        barter.setCenter(sniperRifles);

        SniperRiflesController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Дробовики и ружья
    @FXML
    private void handleShotgunsAndRifles() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/ShotgunsAndRifles.fxml"));
        ScrollPane shotgunsAndRifles = (ScrollPane) fxmlLoader.load();
        barter.setCenter(shotgunsAndRifles);

        ShotgunsAndRiflesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Пистолеты
    @FXML
    private void handlePistols() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/Pistols.fxml"));
        ScrollPane pistols = (ScrollPane) fxmlLoader.load();
        barter.setCenter(pistols);

        PistolsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Ближний бой
    @FXML
    private void handleMeleeWeapons() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/MeleeWeapons.fxml"));
        ScrollPane meleeWeapons = (ScrollPane) fxmlLoader.load();
        barter.setCenter(meleeWeapons);

        MeleeWeaponsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setBarterMeleeWeapons(sciApplication.getBarterMeleeWeaponsData().get(person.getId() - 1));
    }

    // Вызов окна Рюкзаки и сумки
    @FXML
    private void handleBackpacksAndPouches() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/BackpacksAndPouches.fxml"));
        ScrollPane backpacksAndPouches = (ScrollPane) fxmlLoader.load();
        barter.setCenter(backpacksAndPouches);

        BackpacksAndPouchesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Контейнеры
    @FXML
    private void handleContainers() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/Containers.fxml"));
        ScrollPane containers = (ScrollPane) fxmlLoader.load();
        barter.setCenter(containers);

        ContainersController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Устройства
    @FXML
    private void handleDevices() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/Devices.fxml"));
        ScrollPane devices = (ScrollPane) fxmlLoader.load();
        barter.setCenter(devices);

        DevicesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Косметика
    @FXML
    private void handleCosmetics() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/Cosmetics.fxml"));
        ScrollPane cosmetics = (ScrollPane) fxmlLoader.load();
        barter.setCenter(cosmetics);

        CosmeticsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Аксессуары
    @FXML
    private void handleAccessories() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/Accessories.fxml"));
        ScrollPane accessories = (ScrollPane) fxmlLoader.load();
        barter.setCenter(accessories);

        AccessoriesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окнна Прочее
    @FXML
    private void handleOther() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/Other.fxml"));
        ScrollPane other = (ScrollPane) fxmlLoader.load();
        barter.setCenter(other);

        OtherController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Надульники и глушители
    @FXML
    private void handleMuzzlesAndSilencers() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/MuzzlesAndSilencers.fxml"));
        ScrollPane muzzlesAndSilencers = (ScrollPane) fxmlLoader.load();
        barter.setCenter(muzzlesAndSilencers);

        MuzzlesAndSilencersController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Магазины
    @FXML
    private void handleMagazines() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/Magazines.fxml"));
        ScrollPane magazines = (ScrollPane) fxmlLoader.load();
        barter.setCenter(magazines);

        MagazinesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Цевья и крепления
    @FXML
    private void handleHanguardsAndBrackets() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/HanguardsAndBrackets.fxml"));
        ScrollPane hanguardsAndBrackets = (ScrollPane) fxmlLoader.load();
        barter.setCenter(hanguardsAndBrackets);

        HanguardsAndBracketsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Прицелы
    @FXML
    private void handleSights() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/Sights.fxml"));
        ScrollPane sights = (ScrollPane) fxmlLoader.load();
        barter.setCenter(sights);

        SightsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Рукоятки
    @FXML
    private void handleHandles() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/Handles.fxml"));
        ScrollPane handles = (ScrollPane) fxmlLoader.load();
        barter.setCenter(handles);

        HandlesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызовы окна Прочие обвесы
    @FXML
    private void handleOtherAttachments() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/OtherAttachments.fxml"));
        ScrollPane otherAttachments = (ScrollPane) fxmlLoader.load();
        barter.setCenter(otherAttachments);

        OtherAttachmentsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Боевые
    public void handleCombat() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/suits/Combat.fxml"));
        ScrollPane combat = (ScrollPane) fxmlLoader.load();
        barter.setCenter(combat);

        CombatController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Комбинированные
    public void handleCombined() throws  IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/suits/Combined.fxml"));
        ScrollPane combined = (ScrollPane) fxmlLoader.load();
        barter.setCenter(combined);

        CombinedController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
    }

    // Вызов окна Научные
    public void handleScientist() throws  IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/suits/Scientist.fxml"));
        ScrollPane scientist = (ScrollPane) fxmlLoader.load();
        barter.setCenter(scientist);

        ScientistController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
    }
}
