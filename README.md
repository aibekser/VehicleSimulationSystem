# Vehicle Simulation System

A simple Java object-oriented programming (OOP) project demonstrating inheritance and class hierarchy with vehicle types.

## Overview

This project models different vehicle types using Java inheritance:
- Base `Vehicle` class with common vehicle properties and behaviors
- `Car` class extending `Vehicle` with car-specific features
- `SUV` class extending `Car` with SUV-specific functionality

## Class Structure

### Vehicle (Base Class)
- Core properties: name, current speed, current direction
- Basic methods: move(), steer(), stop()
- Getters and setters for all properties

### Car (Extends Vehicle)
- Additional properties: type, transmission type (manual/automatic), number of gears/wheels/doors
- Methods: changeGear(), changeSpeed()
- Maintains current gear state

### SUV (Extends Car)
- Pre-configured as 6-gear, 4-wheel, 5-door vehicle
- Specialized accelerate() method that automatically handles gear changes based on speed

## Usage Example

### Example Execution (`Main.java`)
```java
SUV lexusUX = new SUV("Lexus UX", false);
lexusUX.move(40, 0);      // Set initial speed and direction
lexusUX.accelerate(15);   // Increase speed (auto gear change)
lexusUX.accelerate(10);   // Further acceleration
```

### Expected Output
```java
Moving at 40 in direction 0

Changed to gear 4
Moving at 55 in direction 0

Changed to gear 5
Moving at 65 in direction 0
```
