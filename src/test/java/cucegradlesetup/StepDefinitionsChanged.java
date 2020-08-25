package cucegradlesetup;

import cucegradlesetup.main.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsChanged {

    RestaurantMenuItem menuItem;

    RestaurantMenu locationMenu = new RestaurantMenu();


    @Given("I have a menu item with a name {string} and price {int}")
    public void i_have_a_menu_item_with_a_name_and_price(String newMenuItem, Integer price) {
        // Write code here that turns the phrase above into concrete actions
        menuItem = new RestaurantMenuItem(newMenuItem,newMenuItem,price);
        System.out.println("Step 1");
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        // Write code here that turns the phrase above into concrete actions

        locationMenu.addMenuItem(menuItem);
        System.out.println("Step 2");
    }

    @Then("Menu Item with name {string} should be added")
    public void menu_Item_with_name_should_be_added(String string) {
        // Write code here that turns the phrase above into concrete actions
       boolean Exists = locationMenu.DoesItemExist(menuItem);
        System.out.println("Step 3");
    }

}
