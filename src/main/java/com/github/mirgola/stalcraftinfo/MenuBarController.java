package com.github.mirgola.stalcraftinfo;

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
