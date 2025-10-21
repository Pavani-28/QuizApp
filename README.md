# QuizApp

A Java-based Quiz Application that lets users take multiple-choice quizzes, tracks scores, and shows results. This repository contains the QuizApp source code (written in Java).

Badges
- Language: Java [SpringBoot, Postgresql]

Table of Contents
- [About](#about)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
  - [Using Maven (recommended)](#using-maven-recommended)
  - [From source (plain Java)](#from-source-plain-java)
- [Running the App](#running-the-app)
- [Usage example and sample quiz file](#usage-example-and-sample-quiz-file)
- [Project Structure](#project-structure)
- [How to add questions](#how-to-add-questions)
- [Contributing](#contributing)
- [Testing](#testing)
- [License](#license)
- [Contact](#contact)
- [Acknowledgements](#acknowledgements)

About
-----
QuizApp is a simple, extendable Java-SpringBoot quiz application. It is intended as a learning/demo project and can be adapted to run as a console, desktop (Swing/JavaFX), or server-side app.

Features
--------
- Load quizzes from JSON files
- Multiple-choice questions
- Score tracking and results summary
- Simple, extensible codebase for adding more question types or UI

Prerequisites
-------------
- Java Development Kit (JDK) 8 or newer (JDK 11+ recommended)
- If using Maven: Apache Maven 3.x
- (Optional) Gradle if you prefer to add a build script

Installation
------------

Using Maven (recommended)
1. Make sure a `pom.xml` is present in the project root.
2. Build the project:
   mvn clean package
3. The packaged JAR (if configured) will be in `target/`. Run with:
   java -jar target/QuizApp.jar

From source (plain Java)
1. Compile source files:
   javac -d out $(find src -name "*.java")
2. Run the main class (replace `com.yourpackage.Main` with your actual main class):
   java -cp out com.yourpackage.Main

Running the App
---------------
- If you have a runnable JAR (see Maven instructions):
  java -jar target/QuizApp.jar path/to/quiz.json
- If running from IDE, set the program arguments to the path of a quiz JSON file or use default behavior implemented in Main.

Usage example and sample quiz file
---------------------------------
Below is an example of the expected quiz JSON format. Adjust keys to match how your app loads/parses data.

Sample quiz JSON (sample_quiz.json):
```json
{
  "title": "General Knowledge Quiz",
  "timeLimitSeconds": 600,
  "questions": [
    {
      "id": 1,
      "question": "What is the capital of France?",
      "options": ["Paris", "Rome", "Berlin", "Madrid"],
      "answerIndex": 0
    },
    {
      "id": 2,
      "question": "Which number is prime?",
      "options": ["4", "6", "7", "9"],
      "answerIndex": 2
    },
    {
      "id": 3,
      "question": "What does HTTP stand for?",
      "options": [
        "HyperText Transfer Protocol",
        "High Transfer Text Protocol",
        "Hyper Transfer Text Process",
        "Home Transfer Text Protocol"
      ],
      "answerIndex": 0
    }
  ]
}
```

- `answerIndex` is zero-based (0 corresponds to the first option).
- Provide the quiz file path as an argument or place it in the app's default resource path.

Project Structure
-----------------
A suggested structure (adjust to your actual repo):
- src/
  - main/
    - java/
      - com/yourpackage/   (application code)
        - Main.java
        - Quiz.java
        - Question.java
        - QuizLoader.java
        - QuizRunner.java
  - resources/
    - sample_quiz.json
- pom.xml (if using Maven)
- README.md

How to add questions
--------------------
- Open the JSON quiz file (e.g., `sample_quiz.json`).
- Add a new object to the `questions` array with `id`, `question`, `options` (array), and `answerIndex`.
- Save and run the app to see the new question included.

Contributing
------------
Contributions are welcome! Please follow these steps:
1. Fork the repo.
2. Create a feature branch: git checkout -b feature/your-feature
3. Make changes and add tests where applicable.
4. Commit and push: git push origin feature/your-feature
5. Create a Pull Request explaining your changes.

If you want a CONTRIBUTING.md, I can draft that too.

Testing
-------
- If using Maven:
  mvn test
- Add unit tests using JUnit (recommended) under `src/test/java`.

License
-------
Specify a license (e.g., MIT). Update this section with your chosen license and include a LICENSE file.

Authors
-------
- Pavani-28 

Contact
-------
- Create an Issues page for bug reports and feature requests: https://github.com/Pavani-28/QuizApp/issues
- Email: pavanieee12@gmail.com
