# Learning-Management-System

This project is a **Java-based Learning Management System (LMS)** developed as a concept-focused mini project to demonstrate a strong understanding of Object-Oriented Programming (OOP) principles.

The project emphasizes **core Java concepts and UML-based design**, rather than UI or database integration.

## Project Structure (Conceptual)

The project follows a **multi-level inheritance model**, representing a real-world LMS structure:

```vbnet
src/
 └── Platform.java     (Abstract Base Class)
 └── Course.java       (Abstract Class)
 └── Instructor.java  (Concrete Class)
 └── Student.java     (Concrete Class)
 └── LaunchLMS.java   (Main Class)
```

## Technologies Used
- **Java**
- **Object-Oriented Programming (OOP)**



###  OOP Concepts Implemented

| Concept | Description |
|------|------------|
| **Inheritance** | Classes inherit properties and behaviors using `extends` |
| **Single-Level Inheritance** | Child class inherits from one parent |
| **Multi-Level Inheritance** | Parent → Child → Grandchild hierarchy |
| **Abstraction** | Abstract classes and methods (`abstract`) |
| **Polymorphism** | Same method name with different behavior |
| **Method Overloading** | Same method name, different parameters |
| **Method Overriding** | Child class provides its own implementation |
| **Constructors** | Parameterized constructors and execution order |
| **Encapsulation** | Data hiding using access modifiers |
| **Static vs Non-Static** | Understanding class-level vs object-level members |
| **this & super** | Referencing current and parent class members |


## #Getting Started

Follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

### #Cloning the Repository

You can clone the repository using the command line or GitHub Desktop.

#### Using the Command Line

1. Navigate to the repository: [Learning-Management-System](https://github.com/MastanSayyad/Learning-Management-System/) 
2. Clone the repository:

   ```vbnet
   git clone https://github.com/MastanSayyad/Learning-Management-System.git
   ```
3. Navigate to the project directory:
   ```bash
   cd Learning-Management-System
   cd src

   ```

#### Using GitHub Desktop
1. Download and install GitHub Desktop from desktop.github.com.
2. Open GitHub Desktop.
3. Click on "File" in the menu bar and select "Clone repository..."
4. In the "Clone a Repository" window, select the "URL" tab.
5. Paste the repository URL: https://github.com/MastanSayyad/Learning-Management-System.git
6. Choose the local path where you want to clone the repository.
7. Click "Clone".


### #Running the Project Locally
1. Navigate to the project directory if you are not already there:

   ```bash
   cd Learning-Management-System
   cd src
    ```
2. Open the `LaunchLMS.java` file in and execute to view the project locally.



## Additional Resources

- **GitHub Documentation:** [GitHub Docs](https://docs.github.com/)
- **Git Tutorial:** [Git Documentation](https://git-scm.com/doc)

## Conclusion


This project demonstrates a clear understanding of Java OOP fundamentals and proper system design using UML modeling.







