/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Jose Gonzalez
 *
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ListItemsController {
    @FXML
    public void addItemClicked(ActionEvent actionEvent) {
        // prompt user for description of task
        // prompt  user for due date
        // store information in database as an item of the list
    }

    @FXML
    public void removeItemClicked(ActionEvent actionEvent) {
        // get list of items
        // prompt the user from a number of items which to delete
        // delete item from database
    }

    @FXML
    public void dueDateButtonClickedSort(ActionEvent actionEvent) {
        // get due dates with the respective description
        // sort by due date keeping the appropriate description of the item
        // on click sort oldest to newest
        // another click newest to oldest
    }

    @FXML
    public void descriptionButtonClickedSort(ActionEvent actionEvent) {
        // get due dates with the respective description
        // sort by description alphabetically keeping the appropriate due date of the item
    }

    @FXML
    public void editButtonItemClicked(ActionEvent actionEvent) {
        // ask user with item to edit
        // allow user to overwrite item description
    }

    @FXML
    public void editDueDateButtonClicked(ActionEvent actionEvent) {'
        // ask user with item to edit
        // allow user to overwrite item due date
    }

    @FXML
    public void displayAllClicked(ActionEvent actionEvent) {
        // display all items within the database of items
        //
    }

    @FXML
    public void displayCompletedClicked(ActionEvent actionEvent) {
        // check database for completed item
        // display only those that meet the display criteria
]    }

    @FXML
    public void displayUncompletedClicked(ActionEvent actionEvent) {
        // check database for not completed item
        // display only those that meet the display criteria
    }

    @FXML
    public void saveItemClicked(ActionEvent actionEvent) {
        // prompt the user for a list
        // save the selected list from the user
    }

    @FXML
    public void loadItemClicked(ActionEvent actionEvent) {
        // prompt the user for a list
        // lookup for list in storage
        // load the selected list
        // display to screen
    }
}
