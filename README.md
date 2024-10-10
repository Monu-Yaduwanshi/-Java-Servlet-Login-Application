# -Java-Servlet-Login-Application
This project is a simple web application for user authentication, built using Java Servlets, MySQL database, and Apache Tomcat server. The application allows users to log in with predefined credentials, displaying a welcome message upon successful authentication.

Features
User Login: Users can log in with a predefined username and password.
Error Handling: Displays an error message for incorrect login attempts.
Dynamic Response: After successful login, users are forwarded to a welcome page.
Technologies Used
Java Servlet API
MySQL Database
Apache Tomcat Server
HTML/CSS for frontend design
Setup Instructions
Clone the repository:

bash
Copy code
git clone <repository-url>
Configure the MySQL Database:

Ensure you have a MySQL database set up (though this example uses hardcoded credentials).
You may create a table to store user credentials if you wish to expand functionality.
Deploy on Apache Tomcat:

Import the project into your Eclipse IDE.
Configure the Tomcat server in Eclipse.
Run the application on the Tomcat server.
Access the application:

Navigate to http://localhost:8080/your-context-path/Login.html to access the login page.
Author
Monu Yaduwanshi
Notes
The application currently uses hardcoded credentials for demonstration purposes. It can be expanded to include database-driven authentication.
