#Jacob Forrest

#Lab03 - Version control and branch management exercise

#Collaborating with Brian Mungal


Find All Duplicates

Write a function (or static method in the case of Java) that accepts a list of integers and returns a list of only those integers that appear more than once.

Different Approaches

The find duplicate function can be implemented in a number of different ways. The first way implemented in this lab is to iterate through the list and compare each element in the list to the other elements, and add the element to the list of duplicates if it matches another element in the list.
The second implementation of this function is to create an auxillary dictionary (or any other kind of set that only contains unique elements). Next, iterate through the list, checking if each element is in the dictionary. If the element is in the dictionary already, then it can be added to the list of duplicates. If the element is not in the dictionary already, it can then be added because it is a unique element.
The major drawback of the first method is that it is inefficient, because it requires comparing every element in the list to every other element. Conversely, The second method requires allocating additional space in memory that the first method does not require. 