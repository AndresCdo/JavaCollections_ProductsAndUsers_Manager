# Java Backend Practice
This is a Java project that demonstrates the use of collections to manage a list of products and users. The project includes several classes that define the data models, as well as a demo application that shows how to use the collections to manipulate the data.

## Installation
To run this project, you will need to have the following installed on your system:

- Java Development Kit (JDK) 8 or later
- Apache Maven

Once you have these installed, follow these steps:

1. Clone the repository to your local machine.
2. Open a terminal or command prompt and navigate to the root directory of the project.
2. Run `mvn package` to build the project and create a JAR file in the `target` directory.

## Usage
To run the demo application, follow these steps:

1. Open a terminal or command prompt and navigate to the root directory of the project.

2. Run `java -cp target/myproject.jar com.mycompany.collections.DemoColecciones` to start the demo application.

The demo application will display a menu of options. Use the number keys to select an option and press Enter to execute it.

## Data Models
The project includes the following data models:

### `Product`
Represents a product with a name, description, price, and quantity.

### `User`
Represents a user with a name and email address.

### `Data`
Provides methods for managing collections of `Product` and `User` objects.

### `DBConnection`
Provides methods for connecting to a database and retrieving `Product` and `User` objects.

## Demo Application
The demo application, `DemoColecciones`, demonstrates the use of the `Data` class to manage collections of `Product` and `User` objects. The application allows the user to add, update, and remove products and users, as well as display lists of all products and users.

The demo application also demonstrates the use of the `DBConnection` class to retrieve data from a database. The application connects to a local MySQL database and retrieves a list of products and users.

## Contributing
If you would like to contribute to this project, please fork the repository and submit a pull request with your changes.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.
