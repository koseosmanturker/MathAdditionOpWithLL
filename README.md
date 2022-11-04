# MathAdditionOpWithLL
In older personal computers, the largest integer is 32,767 and the largest long integer is 2,147,483,647. Some applications, such as cryptography and security algorithms, may require an unbounded integer. 
One way to store and manipulate integers of unlimited size is by using a linked list. Each digit is stored in a node of the list. Following figure shows how we could store a five-digit number in a list. Although the list in Figure is represented as moving from right to left, there is no physical direction in a list. (We represent it in this way to clarify the problem.) 

 
To add two numbers, we simply add the corresponding digit in the same location in their respective lists with the carry from the previous addition.  Write a function for adding two numbers (in the form of linked list) that will take two linked lists as input and returns new linked list which is the result of sum.   (assume add is a friend function of LinkedList class.)


LinkedList add(LinkedList l1, LinkedList l2)
