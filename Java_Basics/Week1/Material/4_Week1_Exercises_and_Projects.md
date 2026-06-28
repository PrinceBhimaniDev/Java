# Week 1: Exercises & Projects - Ready to Code! 🚀

## Quick Start Guide

1. **Set up your Java project** following `1_Java_Mac_Setup_Guide.md`
2. **Create new Java files** for each exercise
3. **Type all code** (don't copy-paste!)
4. **Run and test** your programs
5. **Commit to GitHub** at the end of each day

---

## Day 1 (Monday): Variables & Data Types

### Exercise 1.1: Data Types Exploration

Create a file: `DataTypesExplore.java`

```java
public class DataTypesExplore {
    public static void main(String[] args) {
        // Integer types
        byte smallNum = 127;           // Range: -128 to 127
        short mediumNum = 32000;       // Range: -32,768 to 32,767
        int normalNum = 100000;        // Range: -2^31 to 2^31-1
        long largeNum = 10000000000L;  // Note the 'L' suffix!
        
        // Floating point types
        float singlePrecision = 3.14f;      // Note the 'f' suffix
        double doublePrecision = 3.14159;   // Default for decimals
        
        // Character and Boolean
        char grade = 'A';
        boolean isJavaFun = true;
        
        // String (reference type, not primitive)
        String language = "Java";
        
        // Print all values
        System.out.println("=== Data Types in Java ===");
        System.out.println("byte: " + smallNum);
        System.out.println("short: " + mediumNum);
        System.out.println("int: " + normalNum);
        System.out.println("long: " + largeNum);
        System.out.println("float: " + singlePrecision);
        System.out.println("double: " + doublePrecision);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String: " + language);
        
        // Print memory sizes
        System.out.println("\n=== Memory Sizes ===");
        System.out.println("byte size: " + Byte.BYTES + " bytes");
        System.out.println("int size: " + Integer.BYTES + " bytes");
        System.out.println("long size: " + Long.BYTES + " bytes");
    }
}
```

**What to Learn**:
- All 8 primitive data types
- Suffixes needed (L for long, f for float)
- String is not primitive
- Memory size differences

**Run and observe**: What do you notice about the output?

---

### Exercise 1.2: Type Casting

Create a file: `TypeCastingDemo.java`

```java
public class TypeCastingDemo {
    public static void main(String[] args) {
        System.out.println("=== Widening (Automatic) Casting ===");
        
        // Widening - automatic, safe (smaller to larger)
        byte b = 10;
        short s = b;      // byte → short
        int i = s;        // short → int
        long l = i;       // int → long
        float f = l;      // long → float
        double d = f;     // float → double
        
        System.out.println("byte → short: " + s);
        System.out.println("short → int: " + i);
        System.out.println("int → long: " + l);
        System.out.println("long → float: " + f);
        System.out.println("float → double: " + d);
        
        System.out.println("\n=== Narrowing (Manual) Casting ===");
        
        // Narrowing - manual, may lose data (larger to smaller)
        double price = 19.99;
        float discountedPrice = (float) price;      // double → float
        long bigNumber = 123456789L;
        int smallerNumber = (int) bigNumber;        // long → int
        int quantity = 50;
        byte tinyNum = (byte) quantity;             // int → byte (might lose data!)
        
        System.out.println("double → float: " + discountedPrice);
        System.out.println("long → int: " + smallerNumber);
        System.out.println("int → byte: " + tinyNum);
        
        System.out.println("\n=== String Conversions ===");
        
        // String to primitive
        String numStr = "42";
        int convertedInt = Integer.parseInt(numStr);
        System.out.println("String \"42\" to int: " + convertedInt);
        
        String floatStr = "3.14";
        double convertedDouble = Double.parseDouble(floatStr);
        System.out.println("String \"3.14\" to double: " + convertedDouble);
        
        // Primitive to String
        int number = 100;
        String stringNum = Integer.toString(number);
        System.out.println("int 100 to String: " + stringNum);
        System.out.println("Type of stringNum: " + stringNum.getClass().getSimpleName());
    }
}
```

**What to Learn**:
- Automatic widening conversion
- Manual narrowing conversion with casting
- String to primitive conversions
- Primitive to String conversions

**Challenge**: What happens if you cast 256 to byte? Why?

---

### Exercise 1.3: Basic Calculator

Create a file: `SimpleCalculator.java`

```java
public class SimpleCalculator {
    public static void main(String[] args) {
        // Define two numbers
        double num1 = 25.5;
        double num2 = 10.3;
        
        // Perform operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;
        
        // Display results with proper formatting
        System.out.println("=== Simple Calculator ===");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println();
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + addition);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtraction);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiplication);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + division);
        System.out.println("Remainder: " + num1 + " % " + num2 + " = " + remainder);
    }
}
```

**What to Learn**:
- Arithmetic operations
- String concatenation with `+`
- Output formatting

**Enhance It**: Try with different numbers. What happens with division by zero?

---

### Exercise 1.4: Temperature Converter

Create a file: `TemperatureConverter.java`

```java
public class TemperatureConverter {
    public static void main(String[] args) {
        // Convert Celsius to Fahrenheit
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("=== Temperature Conversion ===");
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        
        // Convert Fahrenheit to Celsius
        double fahrenheit2 = 77.0;
        double celsius2 = (fahrenheit2 - 32) * 5/9;
        
        System.out.println(fahrenheit2 + "°F = " + celsius2 + "°C");
        
        // Try multiple conversions
        System.out.println("\n=== Multiple Conversions ===");
        int[] celsiusValues = {0, 10, 20, 30, 40};
        
        for (int c : celsiusValues) {
            double f = (c * 9/5) + 32;
            System.out.println(c + "°C = " + f + "°F");
        }
    }
}
```

**What to Learn**:
- Formula application
- Multiple calculations
- Loop basics (preview)

---

## Day 3 (Wednesday): Practice & Exercises

### Exercise 2.1: Even/Odd Checker

Create a file: `EvenOddChecker.java`

```java
public class EvenOddChecker {
    public static void main(String[] args) {
        int number = 42;
        
        if (number % 2 == 0) {
            System.out.println(number + " is EVEN");
        } else {
            System.out.println(number + " is ODD");
        }
        
        // Check multiple numbers
        System.out.println("\n=== Check Multiple Numbers ===");
        int[] numbers = {7, 14, 21, 36, 45, 100};
        
        for (int num : numbers) {
            String result = (num % 2 == 0) ? "EVEN" : "ODD";
            System.out.println(num + " is " + result);
        }
    }
}
```

### Exercise 2.2: Grade Calculator

Create a file: `GradeCalculator.java`

```java
public class GradeCalculator {
    public static void main(String[] args) {
        int score = 85;
        String grade;
        
        // Determine grade
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        
        // Or using ternary operator
        String status = (score >= 60) ? "PASS" : "FAIL";
        System.out.println("Status: " + status);
    }
}
```

### Exercise 2.3: Largest of Three Numbers

Create a file: `LargestOfThree.java`

```java
public class LargestOfThree {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 89;
        int num3 = 23;
        
        int largest = num1;  // Assume first is largest
        
        if (num2 > largest) {
            largest = num2;
        }
        
        if (num3 > largest) {
            largest = num3;
        }
        
        System.out.println("Numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Largest: " + largest);
    }
}
```

### Exercise 2.4: Simple Loops

Create a file: `SimpleLoops.java`

```java
public class SimpleLoops {
    public static void main(String[] args) {
        System.out.println("=== Count from 1 to 10 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("\n=== Multiplication Table (5) ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 × " + i + " = " + (5 * i));
        }
        
        System.out.println("\n=== Countdown ===");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("BLAST OFF!");
    }
}
```

---

## Day 5 (Friday): Mini-Project

### Project: Student Information System

Create a file: `StudentInfo.java`

```java
public class StudentInfo {
    // Student attributes
    private String name;
    private int rollNumber;
    private double gpa;
    private String branch;
    
    // Constructor - initialize student when creating object
    public StudentInfo(String name, int rollNumber, double gpa, String branch) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.gpa = gpa;
        this.branch = branch;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public String getBranch() {
        return branch;
    }
    
    // Setter methods
    public void setGpa(double newGpa) {
        if (newGpa >= 0 && newGpa <= 4.0) {
            gpa = newGpa;
        } else {
            System.out.println("Invalid GPA! Must be between 0 and 4.0");
        }
    }
    
    public void setBranch(String newBranch) {
        branch = newBranch;
    }
    
    // Display student information
    public void displayInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("GPA: " + gpa);
        System.out.println("Branch: " + branch);
    }
    
    // Calculate grade based on GPA
    public String getLetterGrade() {
        if (gpa >= 3.7) {
            return "A";
        } else if (gpa >= 3.0) {
            return "B";
        } else if (gpa >= 2.0) {
            return "C";
        } else {
            return "F";
        }
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Create a student object
        StudentInfo student1 = new StudentInfo("Alice", 101, 3.8, "Computer Science");
        student1.displayInfo();
        System.out.println("Letter Grade: " + student1.getLetterGrade());
        
        // Update student information
        System.out.println("\n--- Updating GPA ---");
        student1.setGpa(3.9);
        System.out.println("New GPA: " + student1.getGpa());
        System.out.println("New Letter Grade: " + student1.getLetterGrade());
        
        // Try invalid GPA
        System.out.println("\n--- Attempting Invalid GPA ---");
        student1.setGpa(5.0);  // This will fail
        
        // Create another student
        System.out.println("\n");
        StudentInfo student2 = new StudentInfo("Bob", 102, 3.2, "Electronics");
        student2.displayInfo();
        System.out.println("Letter Grade: " + student2.getLetterGrade());
    }
}
```

**What You'll Learn**:
- Creating classes with attributes
- Constructors
- Getters and setters
- Methods
- Object instantiation
- Encapsulation

**Run and Test**:
```bash
javac StudentInfo.java
java StudentInfo
```

**Expected Output**:
```
=== Student Information ===
Name: Alice
Roll Number: 101
GPA: 3.8
Branch: Computer Science
Letter Grade: A

--- Updating GPA ---
New GPA: 3.9
New Letter Grade: A

--- Attempting Invalid GPA ---
Invalid GPA! Must be between 0 and 4.0

=== Student Information ===
Name: Bob
Roll Number: 102
GPA: 3.2
Branch: Electronics
Letter Grade: B
```

**Enhancements to Try**:
1. Add a method to check if student is on dean's list (GPA >= 3.7)
2. Add attendance tracking (percentage)
3. Add a method to calculate expected grade based on marks
4. Store multiple subjects and their grades

---

## Day 7 (Sunday): Review & Challenge

### Weekly Challenge: Number to Binary Converter

Create a file: `BinaryConverter.java`

```java
public class BinaryConverter {
    public static void main(String[] args) {
        // Challenge: Convert decimal numbers to binary
        
        System.out.println("=== Decimal to Binary Conversion ===");
        
        // Method 1: Using Java's built-in function
        int num1 = 10;
        String binary1 = Integer.toBinaryString(num1);
        System.out.println(num1 + " in binary: " + binary1);
        
        int num2 = 255;
        String binary2 = Integer.toBinaryString(num2);
        System.out.println(num2 + " in binary: " + binary2);
        
        int num3 = 1024;
        String binary3 = Integer.toBinaryString(num3);
        System.out.println(num3 + " in binary: " + binary3);
        
        // Challenge: Can you write your own conversion without toBinaryString?
        // Hint: Use division by 2 and modulo operator
    }
}
```

**Challenge**: Implement manual binary conversion without using `toBinaryString()`.

---

## Week 1 Checklist ✅

- [ ] Java setup complete
- [ ] Ran first "Hello World" program
- [ ] Completed Exercise 1.1 (Data Types)
- [ ] Completed Exercise 1.2 (Type Casting)
- [ ] Completed Exercise 1.3 (Calculator)
- [ ] Completed Exercise 1.4 (Temperature Converter)
- [ ] Completed Exercise 2.1 (Even/Odd)
- [ ] Completed Exercise 2.2 (Grade Calculator)
- [ ] Completed Exercise 2.3 (Largest of Three)
- [ ] Completed Exercise 2.4 (Loops)
- [ ] Completed StudentInfo project
- [ ] Attempted binary converter challenge
- [ ] Created GitHub repository
- [ ] Committed all code to GitHub

---

## GitHub Setup & Commits

### One-time setup:
```bash
# Go to your project directory
cd /path/to/JavaLearning

# Initialize git
git init

# Add all files
git add .

# First commit
git commit -m "week1: initialize java learning project"

# Link to GitHub (create repo on GitHub first)
git remote add origin https://github.com/YOUR_USERNAME/JavaLearning.git
git branch -M main
git push -u origin main
```

### After each session:
```bash
git add .
git commit -m "week1: complete [exercise name]"
git push
```

---

## Common Issues & Solutions

### Issue: Code won't compile
**Solution**: Check for:
- Typos in class names and method names
- Missing semicolons at end of statements
- Mismatched parentheses `{}` `()`

### Issue: Wrong output
**Solution**:
- Add `System.out.println()` statements to debug
- Check variable values
- Trace through logic step by step

### Issue: Can't run the program
**Solution**:
- Ensure file name matches public class name
- Check file is saved
- Try from terminal: `javac FileName.java` then `java FileName`

---

## What's Next?

After completing Week 1:
- ✅ You understand variables and data types
- ✅ You can perform basic operations
- ✅ You understand control flow
- ✅ You created your first OOP project
- ✅ You have code on GitHub

**Next Week (Week 2)**: Operators & More Control Flow → Advanced conditionals, loops, and project

---

## Tips for Maximum Learning 💡

1. **Type Everything**: Don't copy-paste. Typing helps muscle memory.
2. **Understand First**: Before running code, trace through it mentally.
3. **Experiment**: Change values and see what happens.
4. **Make Mistakes**: Errors are learning opportunities.
5. **Test Thoroughly**: Use different inputs to test edge cases.
6. **Save Your Work**: Commit to GitHub regularly.
7. **Celebrate Progress**: Each program completed is progress!

---

**You've got this! 🚀 Start with Exercise 1.1 on Monday!**
