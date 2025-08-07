# 🌱 Spring Boot + Jenkins CI/CD Demo

This repository demonstrates a simple **Spring Boot** application integrated with **Jenkins** for Continuous Integration and Deployment (CI/CD).

---

## 🚀 Technologies Used

- Java 17+
- Spring Boot
- Maven
- Jenkins
- Git & GitHub

---

## 📁 Project Structure

spring-jenkins-demo/
├── .mvn/ # Maven wrapper
├── src/ # Java source code
│ └── main/java # App code
│ └── test/java # Unit tests
├── mvnw / mvnw.cmd # Maven wrapper scripts
├── pom.xml # Project dependencies and build config
├── .gitignore # Git ignored files
└── README.md # Project documentation



---

## 🛠️ How to Run the App Locally

```bash
# Clone the repository
git clone https://github.com/anusha-84/spring-jenkins-demo.git

# Move into the project directory
cd spring-jenkins-demo

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
