# 🎰 Java Lottery Game
This project is a simple console-based lottery simulation written in Java.  
The user enters 6 unique numbers, the program draws 6 random lottery numbers, compares both sets, and displays the number of correct hits along with a matching message.

## 📌 Features
- User inputs 6 unique numbers between 1 and 49  
- Program generates 6 random lottery numbers  
- Invalid or duplicate inputs are automatically rejected  
- Compares both number sets and counts hits  
- Displays personalized win or consolation messages:  
  - 0–1 hits: no win  
  - 2–3 hits: small win  
  - 4–5 hits: big win  
  - 6 hits: jackpot – lottery millionaire!  

## 🧪 How it works
1. The user enters six numbers  
2. The program validates each input  
   - Must be between 1 and 49  
   - Must not appear twice  
3. Six unique random numbers are drawn  
4. The sets are compared and matched numbers are counted  
5. A suitable message is printed based on the result  

## 🚀 Technologies Used
- Java  
- IntelliJ IDEA  

## 📁 Project Structure
```
src/
 ├── Main.java
 └── Aufgabe.txt
```

## 🎯 Goal
This project was created as part of a career retraining program (Umschulung) and serves as a programming exercise to practice and strengthen core Java skills, including:
- User input handling  
- Array operations  
- Random number generation  
- Conditional logic  
- Basic control structures  
- Applying programming fundamentals in the context of professional reskilling  
- Working with instructor-provided task descriptions (included in `src/Aufgabe.txt`)
