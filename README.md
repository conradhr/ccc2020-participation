# ccc2020-participation
My solution code for the Canadian Computing Competition.

for more info visit: https://cemc.uwaterloo.ca/contests/computing.html

Problem J1: Dog Treats
Problem Description
Barley the dog loves treats. At the end of the day he is either happy or sad depending on the
number and size of treats he receives throughout the day. The treats come in three sizes: small,
medium, and large. His happiness score can be measured using the following formula:

1 × S + 2 × M + 3 × L

where S is the number of small treats, M is the number of medium treats and L is the number of
large treats.

If Barley’s happiness score is 10 or greater then he is happy. Otherwise, he is sad. Determine
whether Barley is happy or sad at the end of the day.

Input Specification
There are three lines of input. Each line contains a non-negative integer less than 10. The first line
contains the number of small treats, S, the second line contains the number of medium treats, M,
and the third line contains the number of large treats, L, that Barley receives in a day.

Output Specification
If Barley’s happiness score is 10 or greater, output happy. Otherwise, output sad.

Sample Input 1
3
1
0

Output for Sample Input 1
sad

Explanation of Output for Sample Input 1
Barley’s happiness score is 1 × 3 + 2 × 1 + 3 × 0 = 5, so he will be sad.

Sample Input 2
3
2
1

Output for Sample Input 2
happy

Explanation of Output for Sample Input 2
Barley’s happiness score is 1 × 3 + 2 × 2 + 3 × 1 = 10, so he will be happy.

---------------------------------------------------------------------------------------------------------

Problem J2: Epidemiology
Problem Description
People who study epidemiology use models to analyze the spread of disease. In this problem, we
use a simple model. When a person has a disease, they infect exactly R other people but only on the very next day. No
person is infected more than once. We want to determine when a total of more than P people have
had the disease.

Input Specification
There are three lines of input. Each line contains one positive integer. The first line contains the
value of P. The second line contains N, the number of people who have the disease on Day 0. The
third line contains the value of R. 

Assume that P ≤ 107 and N ≤ P and R ≤ 10.

Output Specification
Output the number of the first day on which the total number of people who have had the disease
is greater than P.

Sample Input 1
750
1
5

Output for Sample Input 1
4

Explanation of Output for Sample Input 1
The 1 person on Day 0 with the disease infects 5 people on Day 1. On Day 2, exactly 25 people
are infected. On Day 3, exactly 125 people are infected. A total of 1 + 5 + 25 + 125 + 625 = 781
people have had the disease by the end of Day 4 and 781 > 750.

Sample Input 2
10
2
1

Output for Sample Input 2
5

Explanation of Output for Sample Input 2
There are 2 people on Day 0 with the disease. On each other day, exactly 2 people are infected. By
the end of Day 4, a total of exactly 10 people have had the disease and by the end of Day 5, more
than 10 people have had the disease.
