package com.github.mirgola.stalcraftinfo;

import com.github.mirgola.stalcraftinfo.barter.attachments.*;
import com.github.mirgola.stalcraftinfo.barter.other.*;
import com.github.mirgola.stalcraftinfo.barter.suits.*;
import com.github.mirgola.stalcraftinfo.barter.weapons.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MenuBarBarterController {
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

    // 1.1 Вызов окна Автоматы
    public void handleAssaultRifles() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/AssaultRifles.fxml"));
        ScrollPane assaultRifles = fxmlLoader.load();
        barter.setCenter(assaultRifles);

        AssaultRiflesController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getAssaultRiflesCount());
    }

    private AssaultRiflesCount getAssaultRiflesCount() {
        AssaultRiflesCount assaultRiflesCount = null;
        for (AssaultRiflesCount thisCount : sciApplication.getAssaultRiflesCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                assaultRiflesCount = thisCount;
            }
        }
        return assaultRiflesCount;
    }

    // 1.2 Вызов окна Пистолеты-пулеметы
    @FXML
    private void handleSubmachineGuns() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/SubmachineGuns.fxml"));
        ScrollPane submachineGuns = fxmlLoader.load();
        barter.setCenter(submachineGuns);

        SubmachineGunsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getSubmachineGunsCount());
    }

    private SubmachineGunsCount getSubmachineGunsCount() {
        SubmachineGunsCount submachineGunsCount = null;
        for (SubmachineGunsCount thisCount : sciApplication.getSubmachineGunsCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                submachineGunsCount = thisCount;
            }
        }
        return submachineGunsCount;
    }

    // 1.3 Вызов окна Пулеметы
    public void handleMachineGuns() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/MachineGuns.fxml"));
        ScrollPane machineGuns = fxmlLoader.load();
        barter.setCenter(machineGuns);

        MachineGunsController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getMachineGunsCount());
    }

    private MachineGunsCount getMachineGunsCount() {
        MachineGunsCount machineGunsCount = null;
        for (MachineGunsCount thisCount : sciApplication.getMachineGunsCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                machineGunsCount = thisCount;
            }
        }
        return machineGunsCount;
    }

    // 1.4 Вызов окна Снайперские винтовки
    public void handleSniperRifles () throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/SniperRifles.fxml"));
        ScrollPane sniperRifles = fxmlLoader.load();
        barter.setCenter(sniperRifles);

        SniperRiflesController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getSniperRiflesCount());
    }

    private SniperRiflesCount getSniperRiflesCount() {
        SniperRiflesCount sniperRiflesCount = null;
        for (SniperRiflesCount thisCount : sciApplication.getSniperRiflesCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                sniperRiflesCount = thisCount;
            }
        }
        return sniperRiflesCount;
    }

    // 1.5 Вызов окна Дробовики и ружья
    @FXML
    private void handleShotgunsAndRifles() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/ShotgunsAndRifles.fxml"));
        ScrollPane shotgunsAndRifles = fxmlLoader.load();
        barter.setCenter(shotgunsAndRifles);

        ShotgunsAndRiflesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getShotgunsAndRiflesCount());
    }

    private ShotgunsAndRiflesCount getShotgunsAndRiflesCount() {
        ShotgunsAndRiflesCount shotgunsAndRiflesCount = null;
        for (ShotgunsAndRiflesCount thisCount : sciApplication.getShotgunsAndRiflesCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                shotgunsAndRiflesCount = thisCount;
            }
        }
        return shotgunsAndRiflesCount;
    }

    // 1.6 Вызов окна Пистолеты
    @FXML
    private void handlePistols() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/Pistols.fxml"));
        ScrollPane pistols = fxmlLoader.load();
        barter.setCenter(pistols);

        PistolsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getPistolsCount());
    }

    private PistolsCount getPistolsCount() {
        PistolsCount pistolsCount = null;
        for (PistolsCount thisCount : sciApplication.getPistolsCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                pistolsCount = thisCount;
            }
        }
        return pistolsCount;
    }

    // 1.7 Вызов окна Ближний бой
    @FXML
    private void handleMeleeWeapons() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/weapons/MeleeWeapons.fxml"));
        ScrollPane meleeWeapons = fxmlLoader.load();
        barter.setCenter(meleeWeapons);

        MeleeWeaponsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getMeleeWeaponsCount());
    }

    private MeleeWeaponsCount getMeleeWeaponsCount() {
        MeleeWeaponsCount meleeWeaponsCount = null;
        for (MeleeWeaponsCount thisCount : sciApplication.getMeleeWeaponsCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                meleeWeaponsCount = thisCount;
            }
         }
        return meleeWeaponsCount;
    }

    // 2.1 Вызов окна Рюкзаки и сумки
    @FXML
    private void handleBackpacksAndPouches() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/BackpacksAndPouches.fxml"));
        ScrollPane backpacksAndPouches = fxmlLoader.load();
        barter.setCenter(backpacksAndPouches);

        BackpacksAndPouchesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getBackpacksAndPouchesCount());
    }

    private BackpacksAndPouchesCount getBackpacksAndPouchesCount() {
        BackpacksAndPouchesCount backpacksAndPouchesCount = null;
        for (BackpacksAndPouchesCount thisCount : sciApplication.getBackpacksAndPouchesCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                backpacksAndPouchesCount = thisCount;
            }
        }
        return backpacksAndPouchesCount;
    }

    // 2.2 Вызов окна Контейнеры
    @FXML
    private void handleContainers() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/Containers.fxml"));
        ScrollPane containers = fxmlLoader.load();
        barter.setCenter(containers);

        ContainersController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getContainersCount());
    }

    private ContainersCount getContainersCount() {
        ContainersCount containersCount = null;
        for (ContainersCount thisCount : sciApplication.getContainersCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                containersCount = thisCount;
            }
        }
        return containersCount;
    }

    // 2.3 Вызов окна Устройства
    @FXML
    private void handleDevices() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/Devices.fxml"));
        ScrollPane devices = fxmlLoader.load();
        barter.setCenter(devices);

        DevicesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getDevicesCount());
    }

    private DevicesCount getDevicesCount() {
        DevicesCount devicesCount = null;
        for (DevicesCount thisCount : sciApplication.getDevicesCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                devicesCount = thisCount;
            }
        }
        return devicesCount;
    }

    // 2.4 Вызов окна Косметика
    @FXML
    private void handleCosmetics() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/Cosmetics.fxml"));
        ScrollPane cosmetics = fxmlLoader.load();
        barter.setCenter(cosmetics);

        CosmeticsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getCosmeticsCount());
    }

    private CosmeticsCount getCosmeticsCount() {
        CosmeticsCount cosmeticsCount = null;
        for (CosmeticsCount thisCount : sciApplication.getCosmeticsCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                cosmeticsCount = thisCount;
            }
        }
        return cosmeticsCount;
    }

    // 2.5 Вызов окна Аксессуары
    @FXML
    private void handleAccessories() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/Accessories.fxml"));
        ScrollPane accessories = fxmlLoader.load();
        barter.setCenter(accessories);

        AccessoriesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getAccessoriesCount());
    }

    private AccessoriesCount getAccessoriesCount() {
        AccessoriesCount accessoriesCount = null;
        for (AccessoriesCount thisCount : sciApplication.getAccessoriesCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                accessoriesCount = thisCount;
            }
        }
        return accessoriesCount;
    }

    // 2.6 Вызов окнна Прочее
    @FXML
    private void handleOther() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/other/Other.fxml"));
        ScrollPane other = fxmlLoader.load();
        barter.setCenter(other);

        OtherController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getOtherCount());
    }

    private OtherCount getOtherCount() {
        OtherCount otherCount = null;
        for (OtherCount thisCount : sciApplication.getOtherCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                otherCount = thisCount;
            }
        }
        return otherCount;
    }

    // 3.1 Вызов окна Надульники и глушители
    @FXML
    private void handleMuzzlesAndSilencers() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/MuzzlesAndSilencers.fxml"));
        ScrollPane muzzlesAndSilencers = fxmlLoader.load();
        barter.setCenter(muzzlesAndSilencers);

        MuzzlesAndSilencersController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getMuzzlesAndSilencersCount());
    }

        private MuzzlesAndSilencersCount getMuzzlesAndSilencersCount() {
        MuzzlesAndSilencersCount muzzlesAndSilencersCount = null;
        for (MuzzlesAndSilencersCount thisCount : sciApplication.getMuzzlesAndSilencersCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                muzzlesAndSilencersCount = thisCount;
            }
        }
        return muzzlesAndSilencersCount;
    }

    // 3.2 Вызов окна Магазины
    @FXML
    private void handleMagazines() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/Magazines.fxml"));
        ScrollPane magazines = fxmlLoader.load();
        barter.setCenter(magazines);

        MagazinesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getMagazinesCount());
    }

    private MagazinesCount getMagazinesCount() {
        MagazinesCount magazinesCount = null;
        for (MagazinesCount thisCount : sciApplication.getMagazinesCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                magazinesCount = thisCount;
            }
        }
        return magazinesCount;
    }

    // 3.3 Вызов окна Цевья и крепления
    @FXML
    private void handleHanguardsAndBrackets() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/HanguardsAndBrackets.fxml"));
        ScrollPane hanguardsAndBrackets = fxmlLoader.load();
        barter.setCenter(hanguardsAndBrackets);

        HanguardsAndBracketsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getHanguardsAndBracketsCount());
    }

    private HanguardsAndBracketsCount getHanguardsAndBracketsCount() {
        HanguardsAndBracketsCount hanguardsAndBracketsCount = null;
        for (HanguardsAndBracketsCount thisCount : sciApplication.getHanguardsAndBracketsCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                hanguardsAndBracketsCount = thisCount;
            }
        }
        return hanguardsAndBracketsCount;
    }

    // 3.4 Вызов окна Прицелы
    @FXML
    private void handleSights() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/Sights.fxml"));
        ScrollPane sights = fxmlLoader.load();
        barter.setCenter(sights);

        SightsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getSightsCount());
    }

    private SightsCount getSightsCount() {
        SightsCount sightsCount = null;
        for (SightsCount thisCount : sciApplication.getSightsCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                sightsCount = thisCount;
            }
        }
        return sightsCount;
    }

    // 3.5 Вызов окна Рукоятки
    @FXML
    private void handleHandles() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/Handles.fxml"));
        ScrollPane handles = fxmlLoader.load();
        barter.setCenter(handles);

        HandlesController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getHandlesCount());
    }

    private HandlesCount getHandlesCount() {
        HandlesCount handlesCount = null;
        for (HandlesCount thisCount : sciApplication.getHandlesCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                handlesCount = thisCount;
            }
        }
        return handlesCount;
    }

    // 3.6 Вызовы окна Прочие обвесы
    @FXML
    private void handleOtherAttachments() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/attachments/OtherAttachments.fxml"));
        ScrollPane otherAttachments = fxmlLoader.load();
        barter.setCenter(otherAttachments);

        OtherAttachmentsController controller = fxmlLoader.getController();
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getOtherAttachmentsCount());
    }

    private OtherAttachmentsCount getOtherAttachmentsCount() {
        OtherAttachmentsCount otherAttachmentsCount = null;
        for (OtherAttachmentsCount thisCount : sciApplication.getOtherAttachmentsCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                otherAttachmentsCount = thisCount;
            }
        }
        return otherAttachmentsCount;
    }

    // 4.1 Вызов окна Боевые
    public void handleCombat() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/suits/Combat.fxml"));
        ScrollPane combat = fxmlLoader.load();
        barter.setCenter(combat);

        CombatController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getCombatCount(), person.getFraction());
    }

    private CombatCount getCombatCount() {
        CombatCount combatCount = null;
        for (CombatCount thisCount : sciApplication.getCombatCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                combatCount = thisCount;
            }
        }
        return combatCount;
    }

    // 4.2 Вызов окна Комбинированные
    public void handleCombined() throws  IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/suits/Combined.fxml"));
        ScrollPane combined = fxmlLoader.load();
        barter.setCenter(combined);

        CombinedController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getCombinedCount(), person.getFraction());
    }

    private CombinedCount getCombinedCount() {
        CombinedCount combinedCount = null;
        for (CombinedCount thisCount : sciApplication.getCombinedCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                combinedCount = thisCount;
            }
        }
        return combinedCount;
    }

    // 4.3 Вызов окна Научные
    public void handleScientist() throws  IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/suits/Scientist.fxml"));
        ScrollPane scientist = fxmlLoader.load();
        barter.setCenter(scientist);

        ScientistController controller = fxmlLoader.getController();
        controller.setBarterController(this);
        controller.setLabel(person.getFraction());
        controller.setPerson(person);
        controller.setField(getScientistCount(), person.getFraction());
    }

    private ScientistCount getScientistCount() {
        ScientistCount scientistCount = null;
        for (ScientistCount thisCount : sciApplication.getScientistCountData()) {
            if (thisCount.getIdPerson() == person.getId()) {
                scientistCount = thisCount;
            }
        }
        return scientistCount;
    }
}
