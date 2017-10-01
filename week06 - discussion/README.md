### Prompt

Provide a recursive definition of some sequence of numbers. Choose one different from that of any posted thus far. Write a recursive method that given n, computes the nth term of that sequence. Also provide an equivalent iterative implementation. How do the two implementations compare?

### Response

Alas, I was stumped for a knitting related example.

My sequence adds the next even number to the previous value in the sequence.

The sequence looks like:

 0, 2, 6, 12, 20...

 (0(+2), 2(+4), 6(+6), 12(+8), 20(+10))

The iterative implementation requires more local variables. There is a variable to hold the value, as well as a counter used in the for loop. For this example. the amount of code I used in each implementation is not all that different. As the value of n increases, the iterative implementation will be more efficient as it does not require multiple method calls.

Sample output:

Enter a positive integer: 10

Iterative AddNextEven = 110

Recursive AddNextEven = 110
