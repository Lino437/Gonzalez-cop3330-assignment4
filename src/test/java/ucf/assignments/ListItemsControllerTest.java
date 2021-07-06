package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListItemsControllerTest {

    @Test
    void addItemClicked() {
        // get last item in the list
        // make user last item match with item appended to the list
    }

    @Test
    void removeItemClicked() {
        // get list of items
        // select a value to remove from list
        // get new list of item
        // check that the deleted item is not in the list
    }

    @Test
    void dueDateButtonClickedSort() {
        // get the list of items description
        // sort those items from newest to oldest
        // compare the old combination of description-dueDate with new one

    }

    @Test
    void descriptionButtonClickedSort() {
        // get the list if items description
        // sort alphabetically
        // check that the alphabetic order match an a to z sequence
        // compare the old combination of description-dueDate with new one

    }

    @Test
    void editButtonItemClicked() {
        // get item selected by user
        // get old Description from Storage
        // get new Description input
        // check new input with old, make sure they do not match
    }

    @Test
    void editDueDateButtonClicked() {
        // get item selected by user
        // get old Due Date from Storage
        // get new Due Date input
        // check new input with old, make sure they do not match
    }

    @Test
    void displayAllClicked() {
        // Load all Items from Storage
        // Display those to the GUI
    }

    @Test
    void displayCompletedClicked() {
        // Load all Items from Storage
        // Display those to the GUI
    }

    @Test
    void displayUncompletedClicked() {
        // Load all Items from Storage
        // Display those to the GUI
    }

    @Test
    void saveItemClicked() {
        // save all data in a file
        // compare data in GUI with the one on the file
    }

    @Test
    void loadItemClicked() {
        // load data from a file
        // compare data in file with the one loaded
    }
}