# Task 3: Simple Calculator

## Time Spent
- Research: 10 min
- Code: ~ 1 hour
- Documentation: 30 min

## Research: Conditional Operators
### if/else vs switch
| Criteria | if/else                                                                                                                  | switch                                                                       |
|----------|--------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------|
| Better when | when compare complex conditions or unknown different conditions                                                          | When we want to compare 1 condition against known number of other conditions |
| Advantages | different types of expressions, Good for complex logic, Works with any data type (boolean, int, double, String, objects) | Faster on execution, clean and readable, perfect for menu options and commands                                    |
| Disadvantages | hard to read when there are many conditions, slower than Switch when checking many fixed values                          | Limited to fixed, known values                                                                            |

### What I Chose and Why
I chose switch for the operators because they are only 5 and are known. For checking the boolean value and the input I chosed if/else, because there might be many options and it's more flexible, also allows me to use boolean and string. 

### String Comparison
Why is `str1 == str2` a bad idea?
Because `==` compares the reference of the objects in the memory where they are stored instead of the actual value as .equals(). 
str1 and str2 might be same text but they are two different objects in the memory. 

## Research: Edge Cases
### What Are Edge Cases
Edge case is condition or behaviour or even can be a user story or action that is very rare, less-predictable or unusual. 
Often occurs when an app or feature is used to its limits or not by purpose.

### Edge Cases I Handled
1. Division by zero
2. Unknown operation
3. numA = 0;

## Testing
| a | b | operation | expected result | actual | ✓/✗ |
|---|---|-----------|-----------------|--------|-----|
| 10 | 5 | + | 15 | 15.0   | ✓ |
| 10 | 5 | - | 5 | 5.0    | ✓ |
| 10 | 5 | * | 50 | 50.0   | ✓ |
| 10 | 5 | / | 2 | 2      | ✓ |
| 10 | 0 | / | error | Division by zero is not allowed      | ✓ |
| 10 | 5 | % | unknown | Unknown operation      | ✓ |

## Questions / Unclear Points
Not very confident in the way I designed my calculator, must find a better, more simple way to do it. Not sure if I used the correct script for the goal. 
It works as expected, but feels like the script could be better.

## Sources
https://www.geeksforgeeks.org/java/decision-making-javaif-else-switch-break-continue-jump/
ChatGPT