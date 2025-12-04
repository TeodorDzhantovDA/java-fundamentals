# Task 4: Palindrome Checker

## Time Spent
- Research: 45 min
- Code: 1.5 hour
- Documentation: 30 min
- 
## Research: String Methods
### Useful String Methods
| Method | What It Does | Example                                                                          |
|--------|--------------|----------------------------------------------------------------------------------|
| length() | Return the number of characters in a string | String txt = "ABC" so txt.length() -> returns 3 (int)                            |
| charAt(i) | returns the character at the specified index in a string | String txt = "abc". Char at 0 is "a"                                             |
| toLowerCase() | converts a string to lower case letters | String txt = "ABC"; String newTxt = txt.toLowerCase() ->> "abc"                  |
| substring() | returns a substring from the string | String txt = "abc defg"; String newSubstring = txt.substring(4,7); returns "defg" |

### Which Ones I Used
length()
toLowerCase()
charAt()

## Research: Loops
### for vs while
| for                                                                | while                                                                          |
|--------------------------------------------------------------------|--------------------------------------------------------------------------------|
| Better when: When I know the number of iterations that I will need | Better when: When I don't know exact number of iterations that will be needed. |

### What I Chose and Why
For the Palindrome check itself I've used for loop because I know that the loop will go through the length of the word exactly.
Also used While loop to check the input for command "End". In this case there is unknown times of user typing word != End.

## Algorithm

### Description in Words (before writing code)
1. Take the word to lowercase
2. Check each char in the word from outside to inside  
3. If words has 5 chars, 1st and 5th - same, 2nd and 4-th -same -> word is palindrome 
4. Print the result in the console

### Did the Algorithm Change After Writing Code?
Yes. first I thought to separate the word with substring to first part - (0, word.length/2) and second part (word.length/2+1, word.length). 
Then I realized that this will not work after debugging and checking the actual results saved in the two variables.

## Testing
| Word | Expected | Actual           | ✓/✗ |
|------|----------|------------------|-----|
| radar | palindrome | Palindrome       | ✓ |
| hello | no | Not a palindrome | ✓ |
| Level | palindrome | Palindrome       | ✓ |
| Kayak | palindrome | Palindrome       | ✓ |
| A | palindrome | Palindrome       | ✓ |
| ab | no | Not a palindrome | ✓ |

## What Was Most Difficult
Even thought I know about the existence of these methods and their usage, most difficult part was to think of how to 
use it correctly, to create the algorithm of solving the problem.
## Questions / Unclear Points
[minimum 1]
## Sources
https://www.w3schools.com/java/java_ref_string.asp