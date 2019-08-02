Problem statement:
To find the occurrences of a pattern P within a main text T
m = length(P)
n = length(T)

Naive Approach:
One naive way to solve this problem would be to compare each character of W with T. Every time there is a mismatch, we shift W to the right by 1, then we start comparing again

Disadvantages:
Best case is O(n)
Worst case is O(m*(n-m+1))
worst can occur when all the  characters in pattern and are same
Ex : T= "AAAAAAA"
         P = "AAA"

KMP(Knuth Morris Pratt) Pattern Searching Algorithm:
It is a linear time algorithm to for pattern matching. KMP algorithm preprocesses pat[] and constructs an auxiliary lps[] of size m (same as size of pattern) which is used to skip characters while matching.
name lps indicates longest proper prefix which is also suffix.
Initially j=0 and i=1 lps[]
lps[0] = 0
so we continue till i = n
finally lps becomes = [0, 1, 2, 0, 1, 2, 3]

Time Complexity:
Best case : Time to create lps + Time to compare lps and text T
	O(m+n)
Worst case: O(m+n)
	
Applications:
Pattern searching is an important problem in computer science. When we do search for a string in notepad/word file or browser or database, pattern searching algorithms are used to show the search results. 
