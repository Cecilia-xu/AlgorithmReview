# Java_Basics
## Table of contents 
- [Chapter 1: Basic concepts](https://github.com/Cecilia-xu/CS_Notes/blob/master/Java/readme.md#chapter-1-basic-concepts)
- [Chapter 2: OOP](https://github.com/Cecilia-xu/CS_Notes/blob/master/Java/readme.md#chapter-2-object-oriented-programming-oop)
## Chapter 1: Basic concepts
1. Complier: a computer program to transform source code written in a programming language (the source language) into another computer language (the target language).
e.g. Java - high level programming language -> machine code
2. SDK (Software Development Kit) -> JDK
3. JRE/JVM (Java Runtime Environment aka Java Virtual Machine): allows program to run on multiple operating systems
4. IDE(Integrated Development Environment)
5. variables: a space in memory(RAM)
- RAM: Computer memory or random access memory (RAM) is your system’s short-term data storage; it stores the information your computer is actively using so that it can be accessed quickly. The more programs your system is running, the more memory you’ll need. 
6. Declaration
7. Initialization
8. Overflow: Storing a value that is too large for a declared type of variable will cause an overflow error
9. Primitive data type<br>
<img src = "https://s2.ax1x.com/2019/09/29/u3P6pQ.png" width = 80%></img>
- Note: String is not a primitive data type, but a reference type/class(which has methods)
<img src = "https://s2.ax1x.com/2019/09/29/u3Ph7V.png" width = 80%></img>
10. Naming conventions
- Variable names 
  - begin with a lettr 
  - single-word variable: lowercase letters
  - multi-word variabl: CamelCase notation
- Constant
  - keyword final
  - names: all letters are capitalized
  - multi-word name: words are separated with an underscore
- Method (Same as for variables)
11. Typecasting: to explicitly convert one data type to another e.g.(int)/(double)
12. Char
- MUST in Single quotation marks
- encoding
  - Unicode (Java): 16 bits
  - ASCII(subset of Unicode): 128 / 128 (Extended ASCII)
  - Note: solving leetcode questions —— ask what is the character set they want? just letter: 26 * 2 = 52/ letter + number = 62/ All ASCII/+ Extended ASCII
  - Escape Sequence
13. Conditions(if statement)
- Compare
  - Numbers/chars: relational operators (< <= > >= == !=)
  - String: equals/compareTo(compares strings in lexicographic order)
  - Objects: ==(whether two object **references** are identical)/ equals(whether two object **contents** are identical) <br>
  Note: works correctly only if the implementors of the class have supplied it
- Combine conditions(Boolean operators)
  - && and || : short-circuit evaluation (As soon as the truth value is determined, no further conditions are evaluated.)
  - !
13. Errors
- types
  - syntax error/compile error
  - runtime error
  - logic error
- debug
  - hand trace
  - debugging tools
##  Chapter 2: Object Oriented Programming (OOP)
1. Objects have
- fields
- methods
2. Instantiation: keyword "new"
3. Method
<img src="https://s2.ax1x.com/2019/09/29/u3PqXR.png" width = 50%></img>
- return statement
- calling method
4. UML diagram<br>
<img src="https://s2.ax1x.com/2019/09/29/u3iC1H.png" width = 40%></img>
5. The advantage of object oriented software development are:
- Modular development of code -> easy maintenance + modification
- Reusability
- reliability and flexibility
- increase understanding of code
6. 4 features:
### feature 1: encapsulation
- Refers to data hiding. In Java, there are three access modifiers: public, private and protected.
- Getter and setter methods used to access private fields
### feature 2: polymorphism

### feature 3: inheritance
### feature 4: abstraction
6. Constructors: the attributes are not initialized in the class, instead, they are unutualizaed in the constructors
- can verify and correct the values for the attributes and avoid weird or meaningless states!
- Overload: have more than 1 constructors, each of which has different parameters
  - differentiated by the number, the type, and the order of the arguments passed. 
7. reference: this





