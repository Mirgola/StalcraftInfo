package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.sql.SQLException;

public class RootLayoutController {
    @FXML
    private MenuItem editUserMenu;

    private TableView<Person> personTable;
    private SciApplication sciApplication;

    public void setPersonTable(TableView<Person> personTable) {
        this.personTable = personTable;
    }

    public void setSciApplication (SciApplication sciApplication) {
        this.sciApplication = sciApplication;
    }

    @FXML
    private void handleNewUser() throws SQLException {
        StringBuilder nickname = new StringBuilder();
        StringBuilder fraction = new StringBuilder();
        boolean okClicked = sciApplication.showUserEdit("Добавить нового персонажа", nickname, fraction);
        if(okClicked) {
            Person person = new Person(sciApplication.getPersonData().size() + 1, nickname.toString(), fraction.toString());
            sciApplication.getPersonData().add(person);
            SciDB.newUser(person);
        }
    }

    @FXML
    private void handleEditUser() throws SQLException{
        Person person = personTable.getSelectionModel().getSelectedItem();
        StringBuilder nickname = new StringBuilder(person.getNickname());
        StringBuilder fraction = new StringBuilder(person.getFraction());
        boolean okClicked = sciApplication.showUserEdit("Редактировать персонажа", nickname, fraction);
        if(okClicked) {
            person.setNickname(nickname.toString());
            person.setFraction(fraction.toString());
            SciDB.editUser(person);
        }
    }

    @FXML
    private void handleDeleteUser() throws SQLException {
        Person person = personTable.getSelectionModel().getSelectedItem();
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        personTable.getItems().remove(selectedIndex);
        SciDB.deleteUser(person);
    }
}
