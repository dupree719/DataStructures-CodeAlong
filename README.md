### NOTES

Arrays:
- Fixed in size
- Efficient for retrieving data
- Arrays always start from index position zero
- Arrays contains a bunch of utility methods (Comes from java.util.Arrays)
(You can print all elements of any array with "Arrays.toString(name of array)")
 - Once you define an array, you can no longer change the size
- "arrayName.length" = amount of data said array holds
- You can loop through an forwards and in reverse with a for loop
(for (int i = 0; i < arrayName.length; i++){ 
}
^You are creating a variable that stores ints, saying as long as this variable is LESS THAN the amount of data array holds, increment the variable by 1
(for (int i = arrayName - 1; i >= 0; i--){ 
}
^You are creating an int variable that is equal to the size of specific array (the size would be a number) - 1, saying as long as the variable is greater/equal to zero, decrement by 1

- Can come in multi-dimensions (2D, 3D, 4D, etc.)
- Anytime you want to use a grid, use 2D arrays
- 2D arrays are just arrays inside arrays


Lists:
- Most popular type is ArrayList
- Use .add to add elements to an ArrayList
- An ArrayList can hold items of different types (Strings, ints, etc.)
- To print the elements of ArrayList, use a sysout and just enter the name of it
- To print size of ArrayList, use arrayListName.size() (works same as .length)
- To check if an ArrayList contains a word, int, etc. use arrayListName.contain
- List.of() method makes an immutable (unmodifiable) list that you cannot .add to

Stack:
Stack<Integer> stack = new Stack<>();
- The Stack class represents a last-in-first-out (LIFO) stack of objects
- Extends class Vector that allows a vector to be treated as a stack
-Vector class implements a growable array of objects. Like an array, it contains components that can be
accessed using an integer index. The size of a Vector can grow or shrink as needed to accomodate
adding and removing items after the Vector has been created.
- You can also make a new Stack using List interface - just change push to add and so on
List<Integer> stack = new Stack<>();


//Sysout these methods
- stack.peek() - looks at the top of stack, aka last item added
- stack.pop() - removes last item pushed from stack
- stack.empty() - gives you a boolean "Is the stack empty?"


Queue:
- Queue class represents first-in-first-out (FIFO) (Opposite of Stack)
- A collection designed for holding elements prior to processing (picked in line)


//Sysout these methods
.peek() - looks at the top of queue, aka first item added
.poll() - removes an item from the queue
.size() - gives you size of queue


LinkedList:
- The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList
- The LinkedList stores its items in "containers"
- The list has a link to the first container and each container has a link to the next container in the list
- To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list
- LionkedList is used to manipulate data 
Methods:
You can add items to the beginning/end of a list |  addFirst(), addLast()
Remove items from beginning/end of a list  | removeFirst(), removeLast()
Get items from the beginning/end of a list | getFirst(), getLast()

Sets:
A collection that contains no duplicates

Map Interface:
A collection of key/value pairs
- Map cannot contain duplicate keys - keys will override if you use it more than once
- Each key can map to only one value max

Map methods
map.put() "insert key and value"
map.get() get key
map.size() show map size
map.containsKey() returns boolean
map.keySet() how many keys
map.entrySet() shows values for each key
map.remove() removes key from map
