# JAVA-Programs

1. How Many X's?

Given an integer X within the range of 0 to 9, and given two positive integers as upper and lower bounds respectively, find the number of times X occurs as a digit in an integer within the range, excluding the bounds. Print the frequency of occurrence as output.

Note : Save the file / class as “countXInRange” with appropriate file extension.  

Input:
The first line of input is an integer T, denoting the number of test cases. For each test case, there are two lines of input, first consisting of the integer X, whose occurrence has to be counted. Second, the lower and upper bound, L and U which are positive integers, on the same line separated by a single space, respectively.

Output:
For each test case, there is only one line of output, the count of the occurrence of X as a digit in the numbers lying between the lower and upper bound, excluding them.

Constraints:
1<=T<=100
0<=X<=9
0<L<U<=10^5

Example:
Input:
2
3
100 250
0
20 21
Output:
35
0

Explanation:
In the first test case, the occurrence of 3 in the numbers starting from 101 to 249 is counted and comes out to be 35.
Similarly, for all the other test cases, the occurrence of the given number X is printed as output.

Input:
3
2
10000 12345
9
899 1000
1
1100 1345
Output:
1120
120
398

2. Find the Minimum difference pair

Given an unsorted array, find the minimum difference between any pair in given array.

Note : Save the file / class as “minDifferencePair” with appropriate file extension.  

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N, the size of array. Second line of the test case is the Array.

Output:
Print the minimum difference between any two pairs.

Constraints:
1 <= T <= 30
1 < N <= 100
1 <= arr[i] <= 100000

Example:
Input:
2
5
2 4 5 7 9
10
87 32 99 75 56 43 21 10 68 49

Output:
1
6

3. Find the Maximum money

Given street of houses (a row of houses), each house having some amount of money kept inside; now there is a thief who is going to steal this money but he has a constraint/rule that he cannot steal/rob two adjacent houses. Find the maximum money he can rob.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N and money.

Output:
Print maximum money he can rob.

Note : Save the file / class as “maxMoney” with appropriate file extension.

Constraints:
1 ≤ T ≤ 100
1 ≤ money ≤ 100
1 ≤ N ≤ 1000

Example:
Input:
2
5 10
2 12

Output:
30
12

4. Rotate Array

Given an unsorted array arr[] of size N, rotate it by D elements (anti-clockwise). 

Note : Save the file / class as “rotateArrayNTimes” with appropriate file extension.

Input: 
The first line of the input contains T denoting the number of testcases. First line of eacg test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output: 
For each testcase, in a new line, output the rotated array.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105

Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2

5. Twice counter

Given an array of n words. Some words are repeated twice, we need count such words.

Note : Save the file / class as “wordTwiceCounter” with appropriate file extension.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n denoting the number of words in the string. The next line contains n space separated words forming the string.

Output:
Print the count of the words which are repeated twice in the string.

Constraints:
1<=T<=105  
1<=no of words<=105
1<=length of each word<=105

Example:
Input:
2
10
hate love peace love peace hate love peace love peace
8
Tom Jerry Thomas Tom Jerry Courage Tom Courage

Output:
1
2

6. Write a program to check whether the given two input strings are Anagram or Not. 
Two Strings are said to be anagram if frequency of each character in String 1 is equal to the frequency of character in string 2.

Sample Input 1 :
String 1 : LISTEN
String 2 : SILENT

Sample Output:
Strings are Anagram

Sample Input 2 :
String 1 : INTEGRAL
String 2 : TRIANGLE

Sample Output:
Strings are Anagram

Sample Input 3 :
String 1 : SAMPLE
String 2 : SAAMPLE

Sample Output:
 Not Anagram

Sample Input 4 :
String 1 : TEXT
String 2 : TEST

Sample Output:
 Not Anagram

7. Given a string. Output the first non repeating character in the given string. If no non repeating character is found Print -1.

Sample Input 1 :
String 1 : MADAM

Sample Output:
D

Sample Input 2 :
String 1 : SUGGESTION

Sample Output:
U

Sample Input 3 :
String 1 : ANNA

Sample Output:
 -1

Sample Input 4 :
String 1 : RADAR

Sample Output:
 D

Sample Input 5 :
String 1 : REVERSE

Sample Output:
V


8. Write a program that can check and if a string has matching pair of parentheses or not. Example : ( ) has matching parenthesis, but ( ( )  doesn’t.

Sample Input 1 :
String 1 :  ( ( ) ) 

Sample Output:
True

Sample Input 2 :
String 1 :  ) ( ) 

Sample Output:
False

Sample Input 3 :
String 1 :  ( ( ( ) ( ( ( ) ( ) )

Sample Output:
False

9. Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it. She decides to share a contiguous segment of the bar selected such that the length of the segment matches Ron's birth month and the sum of the integers on the squares is equal to his birth day. You must determine how many ways she can divide the chocolate.
Consider the chocolate bar as an array of squares, .s = [2,2,1,3.2]. She wants to find segments summing to Ron's birth day, d= 4  with a length equalling his birth month, m=2 . In this case, there are two segments meeting her criteria: [2,2] and .[1,3]

Function Description

Complete the birthday function in the editor below. It should return an integer denoting the number of ways Lily can divide the chocolate bar.

birthday has the following parameter(s):

●	s: an array of integers, the numbers on each of the squares of chocolate
●	d: an integer, Ron's birth day
●	m: an integer, Ron's birth month

Input Format
The first line contains an integer n , the number of squares in the chocolate bar. 
The second line contains  n space-separated integers s[ i ] , the numbers on the chocolate squares.
The third line contains two space-separated integers, d and m, Ron's birth day and his birth month.

Output Format

Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.

Sample Input -1 
5
1 2 1 3 2
3 2

Sample Output :  
2

Explanation : 
Lily wants to give Ron  m = 2 squares summing to d =3. The following two segments meet the criteria:
 
Sample Input -2 
6
1 1 1 1 1 1 1
3 2
Sample Output :  
0

Sample Input -2 
1
4
4 1
Sample Output :  
1

10. You have been asked to help study the population of birds migrating across the continent. Each type of bird you are interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added to your array of sightings. You would like to be able to find out which type of bird is most common given a list of sightings. Your task is to print the type number of that bird and if two or more types of birds are equally common, choose the type with the smallest ID number.
For example, assume your bird sightings are of types .arr = [ 1, 1, 2, 3, 3 ] There are two each of types  1 and 2, and one sighting of type 3 . Pick the lower of the two types seen twice: type 1.

Function Description

Complete the migratoryBirds function in the editor below. It should return the lowest type number of the most frequently sighted bird.
migratoryBirds has the following parameter(s):

●	arr: an array of integers representing types of birds sighted

Input Format

The first line contains an integer denoting , the number of birds sighted and reported in the array . 
The second line describes  as  space-separated integers representing the type numbers of each bird sighted.

Constraint : 

It is guaranteed that each type is 1, 2, 3, 4 or 5

Sample Input 1 :
6
1 4 4 4 5 3

Sample Output:
4

The different types of birds occur in the following frequencies:

●	Type 1:  1 bird
●	Type 2: 0 birds
●	Type 3:  1 bird
●	Type 4: 3 birds
●	Type 5: 1 bird

The type number that occurs at the highest frequency is type 4, so we print 4 as our answer.

Sample Input 2 :
11
1 2 3 4 5 4 3 2 1 3 4

Sample Output:
3

The different types of birds occur in the following frequencies:

●	Type 1:  2 birds
●	Type 2: 2 birds
●	Type 3:  3 birds
●	Type 4:  3 birds
●	Type 5: 1 bird

The type number that occurs at the highest frequency is type 3 and type 4, so we print 3 as our answer.

11. How to find if there is a sub array with sum equal to zero?
Here you are given an array of positive and negative numbers, find if
there is a sub-array of continuous elements with 0 sum.
File / Class name should be "subArrayZero".
Input Format :
N - size of the array
'N' integer values
Output Format :
true - if sum of any sub-array of continuous elements is zero
false - otherwise
Input :
5
4 2 -3 1 6
Output:
true 
