# Task 1: User Info

## Time Spent
- Research: 30 min
- Code: 30 min
- Documentation: 45 min

## Research: Naming Conventions

### Variable Naming Rules in Java
1.Names should be descriptive and meaningful.
2.Classes and interfaces use the PascalCase convention.
3.Methods should be verbs, in mixed case with the first letter lowercase and with the first letter of each although in my current project I was told to use the action performed by the method as a first word of it's name for example clickDropdownMenu button.
4.Methods and variables use camelCase convention. 
5.Variables must indicate to the observer the intent of its use example isActive, userAge, totalAmount.
6.Constants use all uppercase letters with words separated by underscores for example from Office Life project we have localized strings for 3 different languages like error messages, names of months etc, they are all in capital letters separated with _. 

P.S. I allowed myself to change the names of the packages according to the naming convention instead the way they were presented in the document

### Examples
| Correct     | Incorrect   | Why                                                                       |
|-------------|-------------|---------------------------------------------------------------------------|
| userName    | user_name   | user_name is not using the naming convention for variables in Java        |
| age         | a           | unclear meaning of the variable, can cause confusion or missunderstanding |
| class Car{} | class car{} | classes should be named with first capital letter                         |
## Research: Data Types

### Primitive Types I Used
| Type | For What | Why This One                                                                                    |
|------|----------|-------------------------------------------------------------------------------------------------|
| String | name | It's the data type for text                                                                     |
| int | age | it holds a whole number, age should always be a whole number                                    |
| double | salary | it can hold a floating point number used in calculations with precision after the floating point |
| boolean | license | can be true or false, either has an license or no                                               |

### int vs long — what's the difference?
The main difference between int and long is their size and the range of value they store. 
int has a range from -2,147,483,648 to 2,147,483,647, while long has a larger range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.

### double vs float — what's the difference?
The difference between double and float is again associated with their size and precision.
float - ~6–7 digits precision, double ~15–16 digits precision

## Code
Created a program that reads input values for name, age, monthly salary and if the user has a driving license. 
Then the program checks the response for hasDrivingLicense and if the input is true or false the value shown as an output is converted to string "yes" and "no".
The program checks if the input is neither true or false (case insensitive) then it prompts the user to enter valid input. 
The same logic could be applied to all input types

## Experiment
Changed age type to String and tried to calculate age × 2.
Result: It worked, which confused me a bit. 

## Questions / Unclear Points
Is it the concatenating at the output that covered the case with age as a string? 

## Sources
https://www.geeksforgeeks.org/java/java-data-types/
