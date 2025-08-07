# 🌱 Spring Boot + Jenkins CI/CD Demo

This repository demonstrates a **Spring Boot** application integrated with **Jenkins** for Continuous Integration and Continuous Deployment (CI/CD).

---

## 📦 Project Structure

spring-jenkins-demo/
├── src/ # Application source code
├── .mvn/ # Maven wrapper files
├── .gitignore # Git ignore rules
├── mvnw / mvnw.cmd # Maven wrapper scripts
├── pom.xml # Maven project file
└── README.md # Project documentation



---

## 🚀 Features

- Simple Spring Boot REST API
- Maven-based build
- Jenkins pipeline integration
- Webhook-compatible (for GitHub)
- Auto build and deploy with Jenkins

---

## ⚙️ Technologies Used

- Java 17+
- Spring Boot 3.x
- Maven
- Jenkins
- Git & GitHub

---

## ✅ Setup Instructions

### 🔧 Prerequisites

- Java JDK 17+
- Maven
- Jenkins installed and running
- GitHub account and repository

---

## 🔨 Run the Project

1. **Clone the Repo**  
   ```bash
   git clone https://github.com/Anusha-1084/spring-jenkins-demo.git
   cd spring-jenkins-demo
Run Locally


./mvnw spring-boot:run
Build the Project


./mvnw clean install
🛠 Jenkins CI/CD Integration
Create a Jenkins freestyle or pipeline job.

Configure the GitHub repository.

Set up Maven build steps:

clean install

spring-boot:run or deploy steps

(Optional) Set up GitHub webhook to trigger build on push.

📝 .gitignore Included
Standard .gitignore added to exclude:

IDE configs (.idea, .vscode, .project)

Build folders (target/, build/)

Maven wrapper files

OS-specific temp files

🙋‍♀️ Author
👩‍💻 Anusha-1084

📄 License
This project is licensed under the MIT License.



---

Let me know if you want:

- A working Jenkins `Jenkinsfile` for pipeline setup  
- A `Dockerfile` to containerize this app  
- A `.env` file for external configs  
- Or GitHub Actions instead of Jenkins

I’m here to help.
