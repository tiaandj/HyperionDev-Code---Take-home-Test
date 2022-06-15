# Section A - Python Review

This is a code review for anagram.py

For the student:

I firstly want to take some time to firstly congratulate you with this beautiful code you presented, but unfortunately your code did not execute, and there are just a couple of things I would like to comment on.

* The only error in your program was the missing argument of the sorted() function in line 5. Remember: The sorted() function returns a sorted list of the specified iterable object. So to determine if two strings are anagrams of each other, we must first sort the strings into lists. The sorted function requires you to enter either a list, or in our case a String as an argument to know what list/string needs to be sorted.

![Your Code](https://drive.google.com/uc?export=view&id=1CcYIXxegwoPqFbFWwjBlHiU-hJLO3jmq)

* Because we are already busy looping through my array of strings, we can just use our loop control variable (i) to enter the value of our string in my argument.

* You received the following error when you tried to execute your program:

![Errors](https://drive.google.com/uc?export=view&id=1NhA8Red-xdENJnfilr2k5rUy_ySDrszR)

* It is nothing to be scared of! The top part of the error:
*print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))* - is the line of code that could not execute, and it is because of the second part of the error: 
*x = "".join(sorted())
TypeError: sorted expected 1 argument, got 0*\
TypeError is a very common error, it’s when you have incompatible data types. In your case, you did not include any data type. 

*	The last thing I want to comment on is the lack of comments in your code. Remember you want to make it as easy and clear as possible for the reviewer or any other coder that works with your code to understand your logic. I added some comments to the solution, these comments might be a bit excessive, but it is there to give you an idea on wat to write next time:

![Solution](https://drive.google.com/uc?export=view&id=1hb6IDSAfxKKyVDCUCNITX7y3KQqhM5he)