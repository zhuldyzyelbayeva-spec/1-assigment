
## Project Overview
This project is a simple Java program for managing students and courses.
The goal of this project is to practice basic Object-Oriented Programming (OOP)
concepts such as classes, objects, constructors, methods, and arrays.

The program creates students, adds them to a course, and calculates academic
information like GPA and credits.

---

## Student Class
The Student class represents one student.

**Fields:**
- name – student name
- id – student ID
- major – student major
- gpa – current GPA
- credits – total credits

**Constructor:**
- sets name, id, and major
- initializes gpa to 0.0
- initializes credits to 0

**Methods:**
- getters for all fields
- updateGpa(double) – updates GPA
- addCredits(int) – adds credits
- isHonors() – checks if GPA is 3.5 or higher
- toString() – prints student information

---

## Course Class
The Course class represents a course and contains an array of students.
This class shows composition because a course has many students.

**Fields:**
- courseName – name of the course
- instructor – instructor name
- students[] – array of Student objects

**Methods:**
- addStudent(Student, index) – adds a student to the array
- courseAverageGPA() – calculates average GPA
- highestCreditStudent() – finds the student with the most credits
- toString() – prints course information

---

## Main Program
The Main class is the driver program.

The program:
- creates at least five students
- updates their GPA and credits
- adds students to a course
- prints course information
- finds:
  - average GPA
  - student with highest credits
  - student with highest GPA
  - number of honors students
  - total credits

---

## How to Compile and Run
Open terminal in the src folder and run:

```bash
javac *.java
java Main


https://www.ilovepdf.com/ru/download/kbccxf25sdm5qkt22qpzymts8yf8pw71Ald9zy200sbw78mxg52gz05zqyftfclnwrybyg5ll4430rsxqp6Adtlmf7btj5hfhpz1ty3w1wr691y9z1z0h65Apmgf6A72rA93fq24zj3k8q6nvAq42phj8c5r0p2gdf1x3y4vm4z5r1kswkx1/30

Reflection

In this assignment, I learned how to work with classes and objects in Java.
I also learned how to use arrays of objects and how to apply encapsulation.

The main challenge was fixing method names and small syntax errors.
This project helped me understand why OOP is important for organizing code
and making it easier to read and maintain.

assignment4-student-management/
├── src/
│   ├── Student.java
│   ├── Course.java
│   └── Main.java
├── docs/
│   └── screenshots/
├── README.md
└── .gitignore

## Screenshots

## Screenshots

![Program Output](docs/screenshots/output.png)





