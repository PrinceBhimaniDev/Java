# Your Personalized Learning Schedule 📅
## Based on: Mon/Wed/Fri (90 mins) + Sunday (2 hours) = ~5.5 hours/week

---

## Schedule Overview

| Day | Time | Focus |
|-----|------|-------|
| **Monday** | 90 mins | Concept Learning & Theory |
| **Wednesday** | 90 mins | Practice & Exercises |
| **Friday** | 90 mins | Projects & Application |
| **Sunday** | 120 mins | Review, Assessment, Weekly Challenge |

---

## ⏱️ Time Breakdown (Per Session)

### Monday Session (90 mins)
- 5 mins: Warm-up (quick recap of last topic)
- 50 mins: Learn new concept (reading + understanding)
- 20 mins: Type along with examples
- 10 mins: Summary and questions
- 5 mins: Preview next topic

### Wednesday Session (90 mins)
- 5 mins: Recap Monday's topic
- 60 mins: Solve practice problems/exercises
- 20 mins: Debug and understand mistakes
- 5 mins: Note down weaknesses

### Friday Session (90 mins)
- 5 mins: Recap problems from Wednesday
- 70 mins: Build mini-project/real application
- 10 mins: Test your project
- 5 mins: Commit to GitHub

### Sunday Session (120 mins)
- 20 mins: Full week review
- 40 mins: Solve weekly challenge problem
- 30 mins: Take assessment quiz
- 20 mins: Plan next week + reflect
- 10 mins: Watch 1 video explanation if needed

---

## Phase 1: Java Fundamentals (Weeks 1-4)

### Week 1: Setup & Basic Concepts

**Estimated Duration**: 5.5 hours
**Prerequisites**: None

#### Monday (90 mins)
- [ ] Complete Java setup on Mac (Setup Guide)
- [ ] Understand variables and data types
- [ ] Know 8 primitive types
- [ ] Practice type casting

**Content to Cover**:
```java
int age = 25;
double gpa = 3.8;
boolean isActive = true;
char grade = 'A';
String name = "John";
```

**Key Concepts**:
- Primitives vs Objects
- Type casting (widening/narrowing)
- String conversions

#### Wednesday (90 mins)
- [ ] Complete 10 exercises on variables and data types
- [ ] Create 5 programs using different data types
- [ ] Practice type conversions

**Exercises**:
1. Create program to read 3 numbers and find maximum
2. Convert temperature Celsius to Fahrenheit
3. Check if number is even or odd
4. Calculate simple interest
5. String concatenation and operations

#### Friday (90 mins)
- [ ] Create mini-project: Student Information System (basic)
  - Store: name, rollNo, gpa, branch
  - Display student details
  - Update GPA

**Project Requirements**:
```java
public class StudentInfo {
    // Store student details
    // Display information
    // Update information
    public static void main(String[] args) {
        // Test your code
    }
}
```

#### Sunday (120 mins)
- [ ] Review: Variables, Data Types, Type Casting
- [ ] Weekly Challenge: Create a program that converts any number to binary
- [ ] Take 15-question quiz on concepts
- [ ] Debug 2 common mistakes

**Weekly Challenge Code Template**:
```java
public class NumberToBinary {
    // TODO: Convert decimal to binary
    // Test with: 10, 255, 1024
    public static void main(String[] args) {
        // Your code here
    }
}
```

---

### Week 2: Operators & Control Flow

**Estimated Duration**: 5.5 hours
**Prerequisites**: Week 1 concepts

#### Monday (90 mins)
- [ ] Learn all operators (Arithmetic, Logical, Comparison, Bitwise)
- [ ] Understand operator precedence
- [ ] Practice ternary operator

**Key Topics**:
- Arithmetic: +, -, *, /, %
- Comparison: ==, !=, <, >, <=, >=
- Logical: &&, ||, !
- Bitwise: &, |, ^, ~, <<, >>

**Example Code**:
```java
int a = 5, b = 3;
System.out.println(a + b);      // 8
System.out.println(a > b && b > 0);  // true
System.out.println(a & b);      // 1 (bitwise)
```

#### Wednesday (90 mins)
- [ ] Solve 15 operator problems
- [ ] Practice control flow (if-else, switch)
- [ ] Understand loop structures

**Problems**:
1. Check if number is prime
2. Grade calculator (score to letter)
3. Leap year checker
4. Find largest of 3 numbers
5. Simple calculator with switch

#### Friday (90 mins)
- [ ] Create project: Number Guessing Game
  - Random number generation
  - User input with loops
  - Hints (higher/lower)
  - Count attempts

**Project Structure**:
```java
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Generate random number 1-100
        // Take user input
        // Give hints
        // Track attempts
        // Declare winner
    }
}
```

#### Sunday (120 mins)
- [ ] Review: Operators & Control Flow
- [ ] Weekly Challenge: FizzBuzz program
  - Print 1 to 100
  - Divisible by 3 → "Fizz"
  - Divisible by 5 → "Buzz"
  - Both → "FizzBuzz"
- [ ] Quiz: 20 questions on control flow
- [ ] Optimize your guessing game code

---

### Week 3: Methods & Arrays

**Estimated Duration**: 5.5 hours
**Prerequisites**: Weeks 1-2

#### Monday (90 mins)
- [ ] Understand method structure and syntax
- [ ] Learn parameters and return types
- [ ] Method overloading concept
- [ ] Variable arguments (varargs)

**Key Concepts**:
```java
public int add(int a, int b) {
    return a + b;
}

public void printMessage(String msg) {
    System.out.println(msg);
}

public int sum(int... numbers) {  // varargs
    // Can accept any number of int arguments
}
```

#### Wednesday (90 mins)
- [ ] Solve 20 method-based problems
- [ ] Practice method overloading
- [ ] Understand pass-by-value

**Exercises**:
1. Method to check prime number
2. Method to calculate factorial
3. Method to reverse array
4. Overloaded methods for different types
5. Palindrome checker using methods

#### Friday (90 mins)
- [ ] Create project: Simple Banking System
  - Methods for deposit/withdraw
  - Balance calculation
  - Transaction history (using array)
  - Interest calculation

**Project Features**:
```java
public class BankAccount {
    private double balance;
    private String[] transactions;  // Store transaction history
    
    public void deposit(double amount) { }
    public void withdraw(double amount) { }
    public void displayBalance() { }
    public void displayHistory() { }
}
```

#### Sunday (120 mins)
- [ ] Review: Methods & Arrays
- [ ] Weekly Challenge: Find missing number
  - Array 1-10 with one missing
  - Find and display it
  - Solve in 2 different ways
- [ ] Quiz: 15 questions on methods
- [ ] Code review of your banking system

---

### Week 4: Object-Oriented Programming Basics

**Estimated Duration**: 5.5 hours
**Prerequisites**: Weeks 1-3

#### Monday (90 mins)
- [ ] Classes and Objects fundamentals
- [ ] Constructors and initialization
- [ ] Encapsulation (private/public)
- [ ] Getters and setters

**Key Concepts**:
```java
public class Person {
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getters
    public String getName() { return name; }
    
    // Setters
    public void setAge(int age) {
        if (age > 0) this.age = age;
    }
}
```

#### Wednesday (90 mins)
- [ ] Create 10 classes with proper encapsulation
- [ ] Practice constructors
- [ ] Implement getters and setters

**Exercises**:
1. Circle class (radius, area, perimeter)
2. Book class (title, author, pages, price)
3. Employee class (name, salary, department)
4. Rectangle class (length, width)
5. Car class (brand, model, year)

#### Friday (90 mins)
- [ ] Create project: Library Management System
  - Book class (title, author, isbn, available)
  - Member class (name, memberId, books)
  - Methods to borrow/return books
  - Display books in library

**Project Structure**:
```java
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    
    // Constructor, getters, setters
}

public class LibraryMember {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;
    
    // Methods to borrow/return books
}
```

#### Sunday (120 mins)
- [ ] Review: Classes, Objects, Encapsulation
- [ ] Weekly Challenge: Create complete Student class
  - Attributes: name, rollNo, gpa, courses
  - Methods: addCourse, removeCourse, calculateGPA
  - Proper encapsulation
- [ ] Quiz: 20 questions on OOP basics
- [ ] Refactor your banking system to use OOP properly

---

## Phase 2: Collections & Advanced OOP (Weeks 5-8)

### Week 5: Collections Framework

**Monday**: ArrayList, LinkedList operations
**Wednesday**: HashMap, HashSet practice problems
**Friday**: Project - Contact Management System (ArrayList of contacts)
**Sunday**: Review & weekly challenge

---

## Progress Tracker

### Week 1 Progress
- [ ] Variables learned: ___/10
- [ ] Setup completed: Yes/No
- [ ] Student Info project: Complete/In Progress/Not Started
- [ ] Confidence level: 1-10 (___/10)
- [ ] Topics to revise: _____________

### Week 2 Progress
- [ ] Operators mastered: Yes/No
- [ ] Control flow understood: Yes/No
- [ ] Guessing game working: Yes/No
- [ ] Confidence level: ___/10
- [ ] Struggled with: _____________

### Week 3 Progress
- [ ] Methods understood: Yes/No
- [ ] Method overloading clear: Yes/No
- [ ] Banking system complete: Yes/No
- [ ] Confidence level: ___/10
- [ ] Need more practice on: _____________

### Week 4 Progress
- [ ] OOP concepts clear: Yes/No
- [ ] Encapsulation implemented: Yes/No
- [ ] Library system working: Yes/No
- [ ] Confidence level: ___/10
- [ ] Ready to move forward: Yes/No

---

## Tips for Success 💡

### Monday (Learning)
- Take notes while reading
- Type examples, don't copy-paste
- Pause and explain concept aloud
- Write down 3 key points

### Wednesday (Practice)
- Read problem carefully first
- Try solving without help initially
- Look at solution if stuck for 10+ mins
- Understand the approach, not just answer

### Friday (Application)
- Build something you find interesting
- Test with different inputs
- Refactor for cleaner code
- Commit to GitHub with meaningful messages

### Sunday (Review)
- Make flashcards for concepts
- Explain topics to someone else (or rubber duck)
- Attempt weekly challenge without looking at notes
- Reflect on weaknesses

---

## GitHub Commits Guide

```bash
# Week 1, Day 1
git commit -m "week1: add student info system"

# Week 1, Day 3
git commit -m "week1: complete guessing game with all features"

# Always commit after each session!
git add .
git commit -m "week[N]: [topic] - [what you did]"
git push origin main
```

---

## Study Resources Needed

### For Each Week:
1. This learning guide (Fundamentals Content)
2. IntelliJ IDEA (IDE)
3. Java Compiler (already installed)
4. Code Editor
5. GitHub account

### Supplementary:
- Google when stuck
- GeeksforGeeks for quick reference
- Stack Overflow for debugging

---

## When You Get Stuck 🚨

1. **Read the error message carefully** (often tells you the exact problem)
2. **Google the error** (add "java" to search)
3. **Rubber duck debugging** (explain code line by line to a rubber duck 🦆)
4. **Take a break** (10-15 minutes away helps!)
5. **Ask in Stack Overflow or Java communities**

---

## Next: After Week 4

After completing 4 weeks of fundamentals:
1. ✅ You'll understand core Java
2. ✅ You'll be ready for Collections & Advanced OOP
3. ✅ You'll have 4 complete projects
4. ✅ You'll feel confident with Java basics

**Then move to**: `3_Collections_And_Advanced_OOP.md`

---

## Weekly Reflection Template

Copy this to a notebook and fill it every Sunday:

```
Week ___ Reflection:

Topics Learned:
- Topic 1: Confidence level ___/10
- Topic 2: Confidence level ___/10
- Topic 3: Confidence level ___/10

Best Experience This Week:
_________________________________

Most Challenging Concept:
_________________________________

Time Spent:
Monday: ___ mins
Wednesday: ___ mins
Friday: ___ mins
Sunday: ___ mins

Code Quality:
- Readability: ___/10
- Functionality: ___/10
- Documentation: ___/10

Next Week's Focus:
_________________________________

Questions/Topics to revisit:
_________________________________
```

---

**Start Week 1 on your next available Monday! 🚀**

*Remember: Consistency > Intensity. 30 mins of focused learning beats 3 hours of distracted coding.*
