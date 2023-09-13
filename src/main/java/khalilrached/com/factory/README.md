<!-- generate by readme-generator -->
# Factory Design Pattern

## What is the Factory Design Pattern?

The Factory Design Pattern is a creational design pattern that allows us to create objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method, either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.

## When to use the Factory Design Pattern?

The Factory Design Pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.

## How to implement the Factory Design Pattern?

The Factory Design Pattern can be implemented in two ways:

1. Simple Factory Pattern
2. Creating the products.
3. Defining extensible factories.