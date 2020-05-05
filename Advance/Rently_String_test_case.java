-2 means no output

Input:

3
bob and alice like to text each other
bob does not like to ski but does not like to fall
Alice likes to ski
3
bob alice
alice
like

Output:

0
0
0 1 1

Input:

1
like like like like like like like like like like like
1
like

Output:

-2

Input:

3
jim likes mary
kate likes tom
tom does not like jim
2
jim tom jim tom
likes

Output:

2
0 1

Input:

3
jim likes mary
kate likes tom
tom does not like jim
2
jim tom
likes

Output:

2
0 1

Input:

4
how it was done
are you how
it goes to
goes done are it
2
done it

Output:

0 3
0 2 3

Input:

3
it go will away
go do art
what to will east
3
it will
go east will
will

Output:

0
-1
0 2

Input:

3
it go will away
go do art
what to will east/.,/ sad
3
it will
go east will
will

Output:

0
-1
0 2

Input:

3
it go will away
go do art
what to will east/.,/ sad
3
it will
go east will
will/.,

Output:

0
-1
-2