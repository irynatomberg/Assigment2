# Triangle Classification – Testing Assignment

## Overview

This project implements and tests a program that classifies a triangle based on three input values **a, b, and c**.

The program determines whether the triangle is:

- **Equilateral** – all sides are equal
- **Isosceles** – two sides are equal
- **Scalene** – all sides are different
- **NotATriangle** – the values do not form a valid triangle

---

## Rules

### Valid input range:
- Each side must be between **1 and 200**

If any value is outside this range, the program returns an error message.

### Triangle condition:
A triangle is valid only if:
- a + b > c
- a + c > b
- b + c > a

If these conditions are not met → **NotATriangle**

---

## Testing Approach

To properly test the program, several testing techniques were used.

### 1. Boundary Value Analysis
Tested values near the limits:
- Minimum (1)
- Maximum (200)
- Values close to boundaries

---

### 2. Equivalence Partitioning
Inputs were divided into groups:
- Valid triangles (Equilateral, Isosceles, Scalene)
- Invalid inputs (out of range or invalid triangle)

---

### 3. Error Guessing
Tested tricky and edge cases, such as:
- Negative numbers
- Degenerate triangles (e.g. 1,1,2)
- Borderline values

---

### 4. White Box Testing
Covered all logical branches in the code:
- Input validation
- Triangle inequality
- All triangle types

---

## Test Coverage

The project uses JaCoCo to measure test coverage.

Results:

- **Instruction Coverage: 95%**
- **Branch Coverage: 85%**

This satisfies the requirement of at least **90% coverage**.

---

## How to Run

Run the following command:

```bash
./gradlew clean test jacocoTestReport