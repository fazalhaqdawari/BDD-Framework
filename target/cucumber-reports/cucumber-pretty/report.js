$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/DataBaseFeature.feature");
formatter.feature({
  "line": 1,
  "name": "DataBase SQL query Feature Scenario",
  "description": "",
  "id": "database-sql-query-feature-scenario",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15702932000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add and Remove a Mac book from Cart",
  "description": "",
  "id": "database-sql-query-feature-scenario;add-and-remove-a-mac-book-from-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@NewTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Laptop \u0026NoteBook tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Show all Laptop \u0026NoteBook option",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on MacBook item",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should see a message ‘Success: You have added MacBook to your shopping cart!’",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User should see ‘1 tem(s)-602.00’ showed to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on cart option",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click on red X button to remove the item from cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "item should be removed and cart should show ‘0 item(s)’",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 2193288299,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLaptopAndNoteBook.user_click_on_Laptop_NoteBook_tab()"
});
formatter.result({
  "duration": 43515100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLaptopAndNoteBook.user_click_on_Show_all_Laptop_NoteBook_option()"
});
formatter.result({
  "duration": 445273200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLaptopAndNoteBook.user_click_on_MacBook_item()"
});
formatter.result({
  "duration": 1629533299,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLaptopAndNoteBook.user_click_add_to_Cart_button()"
});
formatter.result({
  "duration": 65203300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLaptopAndNoteBook.user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart()"
});
formatter.result({
  "duration": 321157700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    },
    {
      "val": "602",
      "offset": 26
    },
    {
      "val": "00",
      "offset": 30
    }
  ],
  "location": "StepDefinitionLaptopAndNoteBook.user_should_see_tem_s_showed_to_the_cart(int,int,int)"
});
formatter.result({
  "duration": 305468699,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLaptopAndNoteBook.user_click_on_cart_option()"
});
formatter.result({
  "duration": 313149101,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionLaptopAndNoteBook.user_click_on_red_X_button_to_remove_the_item_from_cart()"
});
formatter.result({
  "duration": 42711699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 45
    }
  ],
  "location": "StepDefinitionLaptopAndNoteBook.item_should_be_removed_and_cart_should_show_item_s(int)"
});
formatter.result({
  "duration": 382024300,
  "status": "passed"
});
formatter.after({
  "duration": 686019900,
  "status": "passed"
});
});