# Automation test
This project is an API test automation framework built using Rest-Assured and Java. 
It validates the API response from the below endpoint,
API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false

## Pre-requisite
- Java 8 or Above
- Install [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/?section=windows)
- Maven for project dependency management

## Setup and Installation
- Clone the below repository to your local machine using the following command:
git clone https://github.com/soni21/AUTOMATION-ASSIGNMENT.git

- Navigate to the Project Directory and install the required dependencies using Maven
mvn install

## Execute Tests
To run the tests, execute the following Maven command:
mvn run

## Tests Included
- testCategoryName()
This test is used to validate the category name return from the API.

- testCanRelist()
This test is used to verify the CanRelist field in the API response.

- testGalleryPromotion()
This test is used to verify the description field for the "Gallery" promotion.

## Project Structure
This project follows the Page Object Model (POM) design pattern,
CategoryAPI: This class handles the API requests by sending the necessary HTTP requests to the API endpoint.
CategoryPage: This class is responsible for parsing the API response and providing methods to validate specific data.
CategoryTest: This class contains the test cases that validate the API response.
