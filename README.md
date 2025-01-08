# LeetCode 1295: Find Even Numbers of Digits

## Author
Samridhi Gupta

## Date
08/01/2025

## Problem Statement
The program solves the problem of counting how many numbers in a given array have an even number of digits. This is based on the LeetCode problem 1295.

## Description
The `LeetCode1295` program is a simple Java application that prompts the user to input a fixed number of integers, then calculates and displays how many of these integers contain an even number of digits.

## Features
- Accepts user input for 5 integers.
- Calculates the count of integers with an even number of digits.
- Outputs the result clearly.

## How to Run the Program

### Prerequisites
- Java Development Kit (JDK) installed on your machine.

### Steps
1. **Clone the Repository** 

2. **Compile the Program**:
   Open a terminal and navigate to the directory containing the `LeetCode1295.java` file. Then run:
   ```bash
   javac LeetCode1295.java
   ```

3. **Run the Program**:
   Execute the compiled Java program using:
   ```bash
   java LeetCode1295
   ```

4. **Input**:
   - The program will prompt you to enter 5 integers.

5. **Output**:
   The program will display the count of numbers with an even number of digits.

## Example

### Input:
```
Enter 5 integers:
12
345
2
6
7896
```

### Output:
```
Count of numbers with even digits: 2
```

## Code Explanation

- The program begins by importing the `Scanner` class for user input.
- It defines the `LeetCode1295` class, which contains the `main` method and the `findNumbers` method.
- The `main` method handles user input and calls the `findNumbers` method.
- The `findNumbers` method iterates through the array to check the number of digits in each number and counts how many have an even number of digits.

## Conclusion
This program provides a straightforward approach to solving the problem of counting integers with an even number of digits, demonstrating basic Java programming concepts such as arrays, loops, and user input.
