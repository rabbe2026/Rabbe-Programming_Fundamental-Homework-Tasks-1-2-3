# Java Basic Tasks

Three beginner Java programs using `Scanner` for keyboard input.

| File | Task |
|------|------|
| `Task1.java` | Olympic year checker: prints the edition number if the year is an Olympic year |
| `Task2.java` | Digital clock: prints the time one second after the entered `h m s` |
| `Task3.java` | Leap year checker |

## How to run

Requires JDK 8 or newer.

```bash
javac Task1.java
java Task1

javac Task2.java
java Task2

javac Task3.java
java Task3
```

## Logic summary

**Task 1:** The first Games were in 1896 (edition 1), one every 4 years.
A year `M` is an Olympic year if `M >= 1896` and `(M - 1896) % 4 == 0`.
Edition number = `(M - 1896) / 4 + 1`. Cancelled Games (1916, 1940, 1944) keep their numbers.

**Task 2:** Add 1 to seconds. If seconds reach 60, reset to 0 and add 1 to minutes.
If minutes reach 60, reset to 0 and add 1 to hours. If hours reach 24, reset to 0.

**Task 3:** A year is a leap year if it is divisible by 4 and not by 100, or if it is divisible by 400.

## Sample runs

```
Enter a year: 2024
2024 is an Olympic year.
Edition number: 33
```

```
Enter hours (0-23): 23
Enter minutes (0-59): 59
Enter seconds (0-59): 59
After one second: h = 0, m = 0, s = 0
```

```
Enter a year: 1900
1900 is a non-leap year (365 days).
```
