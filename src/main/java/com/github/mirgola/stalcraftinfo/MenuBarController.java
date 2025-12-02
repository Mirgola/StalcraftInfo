package com.github.mirgola.stalcraftinfo;

import com.github.mirgola.stalcraftinfo.barter.attachments.*;
import com.github.mirgola.stalcraftinfo.barter.other.*;
import com.github.mirgola.stalcraftinfo.barter.suits.*;
import com.github.mirgola.stalcraftinfo.barter.weapons.*;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.sql.SQLException;

public class MenuBarController {
    private TableView<Person> personTable;
    private SciApplication sciApplication;

    public void setPersonTable(TableView<Person> personTable) {
        this.personTable = personTable;
    }

    public void setSciApplication (SciApplication sciApplication) {
        this.sciApplication = sciApplication;
    }

    // Добавление нового персонажа
    @FXML
    private void handleNewPerson() throws SQLException {
        StringBuilder nickname = new StringBuilder();
        StringBuilder fraction = new StringBuilder();
        boolean okClicked = sciApplication.showUserEdit("Добавить нового персонажа", nickname, fraction);
        if(okClicked) {
            Person person = new Person(nickname.toString(), fraction.toString());
            sciApplication.getPersonData().add(person);
            SciDB.newPerson(person);
            SciDB.newPersonOther(person);

            sciApplication.getAssaultRiflesCountData().add(new AssaultRiflesCount(person.getId(), person.getNickname()));
            sciApplication.getSubmachineGunsCountData().add(new SubmachineGunsCount(person.getId(), person.getNickname()));
            sciApplication.getMachineGunsCountData().add(new MachineGunsCount(person.getId(), person.getNickname()));
            sciApplication.getSniperRiflesCountData().add(new SniperRiflesCount(person.getId(), person.getNickname()));
            sciApplication.getShotgunsAndRiflesCountData().add(new ShotgunsAndRiflesCount(person.getId(), person.getNickname()));
            sciApplication.getPistolsCountData().add(new PistolsCount(person.getId(), person.getNickname()));
            sciApplication.getMeleeWeaponsCountData().add(new MeleeWeaponsCount(person.getId(), person.getNickname()));

            sciApplication.getBackpacksAndPouchesCountData().add(new BackpacksAndPouchesCount(person.getId(), person.getNickname()));
            sciApplication.getContainersCountData().add(new ContainersCount(person.getId(), person.getNickname()));
            sciApplication.getDevicesCountData().add(new DevicesCount(person.getId(), person.getNickname()));
            sciApplication.getCosmeticsCountData().add(new CosmeticsCount(person.getId(), person.getNickname()));
            sciApplication.getAccessoriesCountData().add(new AccessoriesCount(person.getId(), person.getNickname()));
            sciApplication.getOtherCountData().add(new OtherCount(person.getId(), person.getNickname()));

            sciApplication.getMuzzlesAndSilencersCountData().add(new MuzzlesAndSilencersCount(person.getId(), person.getNickname()));
            sciApplication.getMagazinesCountData().add(new MagazinesCount(person.getId(), person.getNickname()));
            sciApplication.getHanguardsAndBracketsCountData().add(new HanguardsAndBracketsCount(person.getId(), person.getNickname()));
            sciApplication.getSightsCountData().add(new SightsCount(person.getId(), person.getNickname()));
            sciApplication.getHandlesCountData().add(new HandlesCount(person.getId(), person.getNickname()));
            sciApplication.getOtherAttachmentsCountData().add(new OtherAttachmentsCount(person.getId(), person.getNickname()));

            sciApplication.getCombatCountData().add(new CombatCount(person.getId(), person.getNickname()));
            sciApplication.getCombinedCountData().add(new CombinedCount(person.getId(), person.getNickname()));
            sciApplication.getScientistCountData().add(new ScientistCount(person.getId(), person.getNickname()));
        }
    }

    // Редактирование персонажа
    @FXML
    private void handleEditPerson() throws SQLException{
        Person person = personTable.getSelectionModel().getSelectedItem();
        StringBuilder nickname = new StringBuilder(person.getNickname());
        StringBuilder fraction = new StringBuilder(person.getFraction());
        boolean okClicked = sciApplication.showUserEdit("Редактировать персонажа", nickname, fraction);
        if(okClicked) {
            person.setNickname(nickname.toString());
            person.setFraction(fraction.toString());
            SciDB.editPerson(person);
        }
    }

    // Удаление персонажа
    @FXML
    private void handleDeletePerson() throws SQLException {
        Person person = personTable.getSelectionModel().getSelectedItem();
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        personTable.getItems().remove(selectedIndex);
        SciDB.deletePerson(person);
    }
}
