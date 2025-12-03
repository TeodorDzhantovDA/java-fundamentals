# Task 2: Temperature Converter

## Time Spent
- Research: 45
- Code: 20
- Documentation: 20
## Research: Number Formatting

### Ways to Round Numbers in Java
class DecimalFormat
method String.format();
class Math with methods -> floor, ceil, round
class BigDecimal

### Which Method I Chose and Why
I choose String.format() because the output is just for display. If I was doing some financial calculations I would use DecimalFormat or BigDecimal, because they are more accurate when it comes to value after the floating point. 
The task does not require calculations with the final output. 

### Operator Precedence
Is there a difference between `C * 9 / 5 + 32` and `C * (9 / 5) + 32`?
In this situation with used integers - NO, but if we use double as we should for calculating temperature, the position of the parentesis defines which action is calculated first. 
For example `F = (C * 9.0) / 5.0 + 32` and `F = C * 9.0 / (5.0 + 32)` will produce different result
Operators with higher precedence are evaluated first

## Test Results
| Celsius | Fahrenheit | Kelvin | Verification (correct?) |
|---------|------------|--------|-------------------------|
| 0 | 32.00      | 273.15 | Correct                 |
| 100 | 212.00          | 373.15      | Correct                 |
| -40 | -40.00          | 233.15      | Correct                 |
| 36.6 | 97.88          | 309.75      | Correct                 |

## What I Learned
New class learned: BigDecimal
What is operator precedence in Java and how it works. 
Calculating more accurate values have to be done with double or decimal for precision.
Formulas for calculating Celsius to Fahrenheit and Kelvins

## Questions / Unclear Points


## Sources
https://sentry.io/answers/round-a-number-to-n-decimal-places-in-java/#:~:text=The%20DecimalFormat%20class%20is%20better,precise%20and%20reusable%20rounding%20methods.