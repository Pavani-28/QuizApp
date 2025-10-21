##  Quiz Application (Spring Boot)

A backend REST API for creating and managing quizzes with categorized questions.

##  Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL/MySQL
- Maven
  ##  API Endpoints

###  Question Controller
| Method | Endpoint | Description |
|:-------|:----------|:-------------|
| `GET`  | `/question/allQuestions` | Fetch all questions from the database |
| `GET`  | `/question/category/{category}` | Fetch questions based on category |
| `POST` | `/question/add` | Add a new question |

---

###  Quiz Controller
| Method | Endpoint | Description |
|:-------|:----------|:-------------|
| `POST` | `/quiz/create?category={category}&numQ={numQ}&title={title}` | Create a new quiz using a given category and number of questions |
| `GET`  | `/quiz/get/{id}` | Retrieve questions for a specific quiz |
| `POST` | `/quiz/submit/{id}` | Submit quiz answers and get the score |

---



##  Project Structure
```plaintext
com.pavani.quizapp
 ├── controller
 │    ├── QuestionController.java
 │    └── QuizController.java
 ├── dao
 │    ├── QuestionDao.java
 │    └── QuizDao.java
 ├── model
 │    ├── Question.java
 │    ├── QuestionWrapper.java
 │    ├── Quiz.java
 │    └── Response.java
 ├── service
 │    ├── QuestionService.java
 │    └── QuizService.java
 └── QuizappApplication.java
