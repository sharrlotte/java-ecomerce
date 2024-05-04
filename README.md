# E-Commerce Website with Java Spring Boot

This repository contains the code for a simple e-commerce website built using Java and the Spring Boot framework. The project demonstrates the use of Spring Boot with Spring MVC, Spring Data JPA, and Thymeleaf to create a fully functional web application.

## Features

- Product catalog
- Shopping cart
- Order management
- User authentication (login and registration)
- RESTful services
- Responsive design using Bootstrap
- Writting RESTFUL API

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 11 or later (https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Maven build tool (https://maven.apache.org/download.cgi)
- A code editor or IDE of your choice (e.g., IntelliJ IDEA, Eclipse)

## Setup

Clone this repository to your local machine:

```bash
git clone https://github.com/Newbies-Coder/hutech-java-ecommerce.git
cd hutech-java-ecommerce
```

## Database Configuration

Create a MySQL database named `ecommerce` and update the `application.properties` file with your MySQL user and password.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce?useSSL=false
spring.datasource.username=root
spring.datasource.password=yourpassword
```

## Install Dependencies

Install dependencies:

```bash
mvn clean install
```

## Running the Application

To run the application, use the following Maven command:

```bash
mvn spring-boot:run
```

The application will start running at <http://localhost:8080>.

## Usage

After starting the application, navigate to <http://localhost:8080> in your web browser to view the product catalog and start interacting with the application.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

To contribute to this project, please follow these steps:

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a pull request

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Contributors

Farmers' MarketPlace API api is a training project and is developed by contributions from the following members:

<table align="center">
  <tbody>
	<tr>
		<td align="center"><a href="https://github.com/qoucname2202"><img src="https://avatars.githubusercontent.com/qoucname2202" width="100px;" alt="Dương Quốc Nam"/><br /><sub><b>Dương Quốc Nam</b></sub></a><br /><a href="#" title="Guide">📝</a></td>
    <td align="center"><a href="https://github.com/sharrlotte"><img src="https://avatars.githubusercontent.com/sharrlotte" width="100px;" alt="Nguyễn Nhơn Hậu"/><br /><sub><b>Nguyễn Nhơn Hậu</b></sub></a><br /><a href="https://github.com/Newbies-Coder/farmer-marketplace-api" title="Code">💻</a></td>
	</tr>
  </tbody>
</table>
