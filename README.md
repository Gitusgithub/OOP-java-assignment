# OOP-java-assignment\

Java OOP Example: Understanding Interfaces, Abstract Classes, and Concrete Classes

Overview

This Java program is a simple demonstration of Object-Oriented Programming (OOP) principles. It shows how interfaces, abstract classes, and concrete classes work together in Java.

How It Works

1. Interface: Animal

The Animal interface defines basic behaviors that all animals must have:

makeSound(): Represents the sound an animal makes.

eat(): Represents how an animal eats.

2. Abstract Class: Mammal

Implements the eat() method.

Contains a name attribute for the animal.

Requires subclasses to define move().

3. Concrete Class: Dog

Implements makeSound() to print a barking message.

Implements move() to describe how a dog moves.

How to Run the Program

Compile the Java file:javac AnimalDemo.java
Run the compiled program:java AnimalDemo