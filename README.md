# Automation Tester-QA Coding Exercise

### Codes and Tests Prepared by:
**Talha OZLEBLEBICI**
*QA Test Automation Engineer / Industrial Engineer*

talha43gs@gmail.com

https://www.linkedin.com/in/talha-ozleblebici-1b7660189/

------------
### Questions:
**a.** Write a program in python or java which accepts a single list as a parameter. This list consists of any number of lists (1..n), and you can assume each list only contains words (e..g. [‘apple’, ‘mango’, ‘cherry’…]). The program should print out the following:
   - words that appear in more than one list
   - The total number of unique words across all lists
   - Top five frequent words in the all lists

**b.** How would you test this program? Write a test to verify it?

------------
### Answers:
**a.** Please see "src/main/java/**QAcodingExercise**.java" class for program.

**b.** Here are my test steps in summary;
(Also please see "src/test/java/**QAcodingExerciseTest**.java" class for Unit test methods.)
1- I start my tests with the pre-code review. Basically, I review codes and methods. By doing syntax, execution, and logic error checks, I have done the basic tests.

2- First, I run the program with the base test(happy test) method by selecting small, simple size test data. In this way, I can do a basic function test.

3- Afterwards, I try to test the upper and lower limits (boundary test) of the method parameters by selecting the test data at the limit values. Also, I check case Sensitivity with sperate data.
For example, I test all methods with a minimum (1) element parameter value. In addition, I do the parameter coverage tests with lower and upper limits.
For example, for the "The total number of unique words across all lists" method, I do tests with test data that does not contain any unique data.

4- I do separate tests using repeating duplicate data and null data.
For example, for the "words that appear in more than one list" method, I do tests using only the sample test data that is not in the other lists, repeating more than once in its own list.

5- I do negative status tests with sample data below the output values required by the methods.
For example, for the "Top five frequent words in the all lists" method, I give data less than 5 words and test whether the method outputs according to the data without any errors.

6- Finally, I apply performance tests with extremely large test data. For this test also I prefer to use random data to simulate monkey style test data selection. 
For example; I try to prepare sample test data as the max int value for all methods and run them.


2020 September&reg;
https://github.com/Ozleblebici

###End


------------



