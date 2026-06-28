# Java Fundamentals: Complete Learning Guide
## Part 1 - Core Concepts & OOP

---

## Table of Contents
1. Variables & Data Types
2. Operators
3. Control Flow
4. Methods
5. Arrays & Collections
6. OOP Fundamentals
7. Practice Exercises

---

## 1. Variables & Data Types 📊

### Primitive Data Types (8 types)

```java
// Integer Types
byte age = 25;           // -128 to 127 (1 byte)
short year = 2024;       // -32,768 to 32,767 (2 bytes)
int salary = 50000;      // -2^31 to 2^31-1 (4 bytes)
long population = 8000000000L;  // -2^63 to 2^63-1 (8 bytes) - Note: L suffix

// Floating Point Types
float price = 19.99f;    // 32-bit (Note: f suffix)
double rate = 3.14159;   // 64-bit (more precision)

// Character & Boolean
char grade = 'A';        // Single character (16-bit Unicode)
boolean isStudent = true; // true or false
```

**Key Points:**
- `int` and `double` are defaults for numeric literals
- Use `L` suffix for long and `f` suffix for float
- String is NOT a primitive (it's an object)

### Reference Data Types

```java
// Strings (Most common reference type)
String name = "Alice";
String message = new String("Hello");

// Objects
Person person = new Person("Bob", 30);

// Arrays
int[] numbers = {1, 2, 3, 4, 5};
String[] names = new String[3];

// null reference
String nullable = null;
```

### Type Casting

```java
// Widening (automatic - safe)
int num = 42;
long largeNum = num;  // int → long (no loss of data)
double decimal = num; // int → double

// Narrowing (manual - must be explicit)
double price = 99.99;
int rounded = (int) price;  // double → int (loss of decimal)

// String conversions
String numStr = "123";
int parsed = Integer.parseInt(numStr);      // "123" → 123
double parsed2 = Double.parseDouble("3.14"); // "3.14" → 3.14
String converted = Integer.toString(42);     // 42 → "42"
```

### Variable Scope

```java
public class ScopeExample {
    public static int globalVar = 10;  // Class scope
    
    public void methodExample() {
        int methodVar = 20;  // Method scope
        
        {
            int blockVar = 30;  // Block scope
            System.out.println(blockVar);  // ✅ works
        }
        System.out.println(blockVar);  // ❌ Error: out of scope
    }
}
```

---

## 2. Operators 🔧

### Arithmetic Operators
```java
int a = 20, b = 10;

int sum = a + b;        // 30
int diff = a - b;       // 10
int product = a * b;    // 200
int division = a / b;   // 2
int remainder = a % b;  // 0

// Shorthand operators
a += 5;    // a = a + 5 = 25
b -= 3;    // b = b - 3 = 7
a *= 2;    // a = a * 2 = 50
b /= 2;    // b = b / 2 = 3
```

### Comparison Operators (Return boolean)
```java
int x = 10, y = 20;

boolean equal = (x == y);        // false
boolean notEqual = (x != y);     // true
boolean lessThan = (x < y);      // true
boolean greaterThan = (x > y);   // false
boolean lessEqual = (x <= y);    // true
boolean greaterEqual = (x >= y); // false
```

### Logical Operators
```java
boolean condition1 = true;
boolean condition2 = false;

// AND (&&) - both must be true
boolean and = condition1 && condition2;  // false

// OR (||) - at least one must be true
boolean or = condition1 || condition2;   // true

// NOT (!) - negates the condition
boolean not = !condition1;                // false

// Example in if statement
if (age >= 18 && isStudent) {
    System.out.println("Eligible for student discount");
}
```

### Bitwise Operators (For interview prep)
```java
int a = 5;      // Binary: 0101
int b = 3;      // Binary: 0011

int and = a & b;    // 0001 = 1
int or = a | b;     // 0111 = 7
int xor = a ^ b;    // 0110 = 6
int not = ~a;       // ~0101 = -6 (two's complement)
int leftShift = a << 1;   // 0101 << 1 = 1010 = 10
int rightShift = a >> 1;  // 0101 >> 1 = 0010 = 2
```

### Ternary Operator (Conditional)
```java
int age = 25;
String status = (age >= 18) ? "Adult" : "Minor";
// Syntax: condition ? valueIfTrue : valueIfFalse

// Nested ternary
String category = age < 13 ? "Child" : age < 18 ? "Teen" : "Adult";
```

---

## 3. Control Flow 🔀

### if-else statements
```java
int score = 85;

if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

### switch statement
```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Other day");
}

// Java 14+ - Switch expressions (cleaner)
String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Other";
};
```

### Loops

#### for loop
```java
// Traditional for loop
for (int i = 0; i < 5; i++) {
    System.out.println("Count: " + i);  // 0, 1, 2, 3, 4
}

// Enhanced for loop (for arrays/collections)
int[] numbers = {10, 20, 30, 40};
for (int num : numbers) {
    System.out.println(num);
}
```

#### while loop
```java
int count = 0;
while (count < 5) {
    System.out.println("Count: " + count);
    count++;
}

// do-while (executes at least once)
int num = 0;
do {
    System.out.println("Num: " + num);
    num++;
} while (num < 3);
```

#### Loop Control
```java
// break - exit loop
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // Loop stops at 5
    }
    System.out.println(i);
}

// continue - skip current iteration
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;  // Skips printing 2
    }
    System.out.println(i);  // Prints 0, 1, 3, 4
}
```

---

## 4. Methods (Functions) 🎯

### Method Structure
```java
public class Calculator {
    // Method signature: [access] [return-type] [method-name]([parameters])
    
    // Method with parameters and return type
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method with no return type (void)
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
    
    // Method with no parameters
    public String getMessage() {
        return "Welcome to Java!";
    }
    
    // Method with multiple parameters
    public double calculateArea(double length, double width) {
        return length * width;
    }
}
```

### Calling Methods
```java
Calculator calc = new Calculator();

int result = calc.add(5, 3);           // 8
calc.greet("Alice");                   // Output: Hello, Alice
String msg = calc.getMessage();         // "Welcome to Java!"
double area = calc.calculateArea(5, 10); // 50.0
```

### Variable Arguments (varargs)
```java
// Method that accepts any number of arguments
public int sum(int... numbers) {
    int total = 0;
    for (int num : numbers) {
        total += num;
    }
    return total;
}

// Usage
int result1 = sum(1, 2, 3);              // 6
int result2 = sum(1, 2, 3, 4, 5);        // 15
int result3 = sum();                     // 0
```

### Method Overloading (Same name, different parameters)
```java
public class Printer {
    // Overloaded methods - same name, different parameters
    
    public void print(String message) {
        System.out.println("String: " + message);
    }
    
    public void print(int number) {
        System.out.println("Integer: " + number);
    }
    
    public void print(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}

// Usage
Printer printer = new Printer();
printer.print("Hello");           // String version
printer.print(42);                // Integer version
printer.print("Repeat", 3);       // Both parameters version
```

### Pass by Value (Important!)
```java
public class PassByValueDemo {
    public static void modifyInt(int num) {
        num = 100;  // Changes local copy only
    }
    
    public static void modifyArray(int[] arr) {
        arr[0] = 999;  // Changes original array (reference!)
    }
    
    public static void main(String[] args) {
        int original = 10;
        modifyInt(original);
        System.out.println(original);  // Still 10
        
        int[] array = {1, 2, 3};
        modifyArray(array);
        System.out.println(array[0]);  // Changed to 999!
    }
}
```

**Key Point**: Java passes primitives by value, objects by reference (reference copied, but still points to same object)

---

## 5. Arrays & ArrayList 📦

### Arrays (Fixed Size)
```java
// Declaration and initialization
int[] numbers = {1, 2, 3, 4, 5};
int[] empty = new int[5];  // Size 5, all zeros by default

// Accessing elements
int first = numbers[0];     // 1
numbers[0] = 10;            // Change first element
int length = numbers.length; // 5

// Iterating
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// Enhanced for loop
for (int num : numbers) {
    System.out.println(num);
}

// 2D Arrays
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
int value = matrix[1][2];  // 6
```

### ArrayList (Dynamic Size) ⭐
```java
import java.util.ArrayList;

// Create ArrayList
ArrayList<Integer> numbers = new ArrayList<>();

// Add elements
numbers.add(10);    // [10]
numbers.add(20);    // [10, 20]
numbers.add(30);    // [10, 20, 30]

// Add at specific index
numbers.add(1, 15); // [10, 15, 20, 30]

// Get element
int first = numbers.get(0);  // 10

// Size and capacity
int size = numbers.size();   // 4

// Remove element
numbers.remove(1);           // [10, 20, 30]
numbers.remove(Integer.valueOf(20));  // [10, 30]

// Check if contains
boolean hasValue = numbers.contains(10);  // true

// Clear all
numbers.clear();

// Iterate
for (int num : numbers) {
    System.out.println(num);
}
```

### Other Collections

#### HashSet (Unique values only)
```java
import java.util.HashSet;

HashSet<String> fruits = new HashSet<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple");  // Won't add duplicate

System.out.println(fruits.size());  // 2
System.out.println(fruits.contains("Apple"));  // true
fruits.remove("Banana");
```

#### HashMap (Key-Value pairs)
```java
import java.util.HashMap;

HashMap<String, Integer> ages = new HashMap<>();
ages.put("Alice", 25);
ages.put("Bob", 30);
ages.put("Charlie", 35);

int aliceAge = ages.get("Alice");  // 25
boolean hasAlice = ages.containsKey("Alice");  // true

ages.remove("Bob");

// Iterate
for (String name : ages.keySet()) {
    System.out.println(name + ": " + ages.get(name));
}
```

---

## 6. Object-Oriented Programming (OOP) 🏗️

### Classes and Objects

```java
public class Person {
    // Attributes (instance variables)
    private String name;
    private int age;
    
    // Constructor (initializes objects)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    
    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Usage
Person person = new Person("Alice", 25);
person.displayInfo();           // Name: Alice, Age: 25
person.setAge(26);
System.out.println(person.getAge());  // 26
```

### Encapsulation (private/public)

```java
public class Student {
    // Private - only accessible within this class
    private double gpa;
    private String studentId;
    
    // Public - accessible from anywhere
    public String name;
    
    // Private method
    private void calculateGPA() {
        // calculation logic
    }
    
    // Public method
    public void updateGPA(double newGPA) {
        if (newGPA >= 0 && newGPA <= 4.0) {
            gpa = newGPA;  // Validation before setting
        }
    }
}
```

**Benefits**: Data protection, validation, flexibility to change implementation

### Inheritance (is-a relationship)

```java
// Parent/Super class
public class Animal {
    protected String name;  // protected: accessible in child classes
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
}

// Child/Sub class
public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name);  // Call parent constructor
        this.breed = breed;
    }
    
    @Override  // Override parent method
    public void eat() {
        System.out.println(name + " is eating dog food");
    }
    
    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}

// Usage
Dog dog = new Dog("Buddy", "Golden Retriever");
dog.eat();      // Output: Buddy is eating dog food
dog.bark();     // Output: Buddy says: Woof!
```

### Polymorphism (Many forms)

```java
public class PolymorphismExample {
    public static void main(String[] args) {
        // Parent reference, child object
        Animal myDog = new Dog("Rex", "Labrador");
        Animal myCat = new Cat("Whiskers");
        
        // Same method call, different behavior
        myDog.eat();   // Output: Rex is eating dog food
        myCat.eat();   // Output: Whiskers is eating cat food
    }
}

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void eat() {
        System.out.println(name + " is eating cat food");
    }
}
```

### Interfaces

```java
// Interface - contract for what methods must exist
public interface Animal {
    void eat();
    void sleep();
}

// Implementing interface
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
    
    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats");
    }
    
    @Override
    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
```

### Abstract Classes

```java
// Abstract class - partial implementation + interface
public abstract class Vehicle {
    private String color;
    
    public Vehicle(String color) {
        this.color = color;
    }
    
    // Concrete method
    public void displayColor() {
        System.out.println("Color: " + color);
    }
    
    // Abstract method - must be implemented by child
    public abstract void startEngine();
    public abstract void stopEngine();
}

public class Car extends Vehicle {
    public Car(String color) {
        super(color);
    }
    
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}
```

---

## 7. Practice Exercises 💪

### Exercise 1: Temperature Converter
**Task**: Create a class that converts temperature between Celsius and Fahrenheit.

```java
public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    // TODO: Test this with different values
}
```

### Exercise 2: Student Grade Calculator
**Task**: Create a Student class with ability to add grades and calculate GPA.

```java
public class Student {
    private String name;
    private ArrayList<Integer> grades;  // Store grades
    
    // TODO: Implement constructor
    // TODO: Implement addGrade(int grade)
    // TODO: Implement calculateGPA() - returns average
    // TODO: Implement getLetterGrade() - A(90+), B(80-89), C(70-79), etc.
}
```

### Exercise 3: Bank Account System
**Task**: Create Account, Savings Account, and Checking Account classes with inheritance.

```java
// Parent class
public class Account {
    protected double balance;
    protected String accountNumber;
    
    // TODO: Constructor
    // TODO: deposit() method
    // TODO: withdraw() method
    // TODO: getBalance() method
}

// Child classes
public class SavingsAccount extends Account {
    private double interestRate;
    
    // TODO: Implement addInterest() method
}

public class CheckingAccount extends Account {
    private double monthlyFee;
    
    // TODO: Implement deductFee() method
}
```

### Exercise 4: Collections Practice
**Task**: Create a simple inventory system using ArrayList, HashMap, and HashSet

```java
public class Inventory {
    private ArrayList<String> items;      // All items
    private HashMap<String, Integer> quantities;  // Item count
    private HashSet<String> categories;   // Unique categories
    
    // TODO: addItem(String item, int quantity)
    // TODO: removeItem(String item)
    // TODO: getQuantity(String item)
    // TODO: displayInventory()
}
```

### Exercise 5: String Operations
**Task**: Various string manipulation tasks

```java
public class StringExercises {
    // TODO: reverseString(String s) - returns reversed string
    // TODO: isPalindrome(String s) - checks if string reads same forwards/backwards
    // TODO: countVowels(String s) - counts vowels
    // TODO: removeSpaces(String s) - removes all spaces
    // TODO: capitalize(String s) - first letter uppercase
}
```

---

## Key Takeaways 🎓

✅ **Variables**: Know primitive vs reference types  
✅ **Operators**: Arithmetic, logical, comparison, bitwise  
✅ **Control Flow**: if/else, switch, loops  
✅ **Methods**: Parameters, return types, overloading  
✅ **Collections**: ArrayList, HashMap, HashSet  
✅ **OOP**: Classes, inheritance, polymorphism, interfaces  

---

## Next Steps

1. **Complete Setup**: Follow `1_Java_Mac_Setup_Guide.md`
2. **Run Examples**: Type all code examples in IntelliJ
3. **Practice Exercises**: Solve all 5 exercises above
4. **Test Your Knowledge**: Create a project combining all concepts
5. **Move to Part 2**: Collections Deep Dive when ready

---

## Quick Reference Commands

```bash
# Compile Java file
javac HelloWorld.java

# Run compiled program
java HelloWorld

# Using Maven (more common)
mvn clean compile
mvn exec:java
```

---

## Common Mistakes to Avoid ⚠️

1. **Confusing `==` with `.equals()`**
   ```java
   String a = "Hello";
   String b = new String("Hello");
   a == b;           // false (different objects)
   a.equals(b);      // true (same content)
   ```

2. **Null Pointer Exception**
   ```java
   String name = null;
   System.out.println(name.length());  // ❌ Error!
   
   // Fix:
   if (name != null) {
       System.out.println(name.length());  // ✅
   }
   ```

3. **Index Out of Bounds**
   ```java
   int[] arr = {1, 2, 3};
   System.out.println(arr[5]);  // ❌ Error! Only 0,1,2 exist
   ```

4. **Infinite Loops**
   ```java
   while (true) {
       System.out.println("This runs forever!");
       // Missing break or condition update
   }
   ```

---

**Happy Learning! Move forward systematically and practice regularly! 🚀**
