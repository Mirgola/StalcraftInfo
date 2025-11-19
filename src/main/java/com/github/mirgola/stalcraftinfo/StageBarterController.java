package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

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
    private void closeButton() {
        stage.close();
        //personInfoController.showPersonDetails(person);
    }


}
