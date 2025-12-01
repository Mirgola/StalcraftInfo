package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.sql.SQLException;

public class StageBarterController {
    private Stage stage;
    private PersonInfoController personInfoController;
    private Person person;

    public void setStageBarter(Stage stage) {
        this.stage = stage;
    }

    public void setPersonInfoController(PersonInfoController personInfoController) {
        this.personInfoController = personInfoController;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    // Закрытие окна
    @FXML
    private void closeButton() throws SQLException {
        stage.close();
        System.out.println(SciDB.isOkClicked());
        if (SciDB.isOkClicked()) {
            personInfoController.setRemains(person);
            personInfoController.showPersonDetails(person);
            SciDB.updateRemains(person);
        }
    }
}
