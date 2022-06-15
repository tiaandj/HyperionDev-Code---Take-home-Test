# Section A - Python Review

This is a code review for anagram.py

For the student:

I firstly want to take some time to firstly congratulate you with this beautiful code you presented, but unfortunately your code did not execute, and there are just a couple of things I would like to comment on.

* The only error in your program was the missing argument of the sorted() function in line 5. Remember: The sorted() function returns a sorted list of the specified iterable object. So to determine if two strings are anagrams of each other, we must first sort the strings into lists. The sorted function requires you to enter either a list, or in our case a String as an argument to know what list/string needs to be sorted.

* Because we are already busy looping through my array of strings, we can just use our loop control variable (i) to enter the value of our string in my argument.

* You received the following error when you tried to execute your program:

