/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.ContextMenuEvent;

public class TodoController {
    @FXML
    public void addButtonClicked(ActionEvent actionEvent) {
        // prompt user for description of task
        // prompt  user for due date
        // store information in database as an item of the list
    }

    @FXML
    public void removeButtonClicked(ActionEvent actionEvent) {
        // get list of items
        // prompt the user from a number of items which to delete
        // delete item from database
    }

    @FXML
    public void editButtonClicked(ActionEvent actionEvent) {
        // ask user with item to edit
        // allow user to overwrite item description
    }

    @FXML
    public void saveButtonClicked(ActionEvent actionEvent) {
        // prompt the user for a list
        // save the selected list from the user
    }

    @FXML
    public void loadButtonClicked(ActionEvent actionEvent) {
        // prompt the user for a list
        // lookup for list in storage
        // load the selected list
        // display to screen
    }
}
