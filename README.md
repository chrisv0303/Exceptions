# Chapter 11 - Risky Behavior Notes

- Java's exception-handling mechanism is a clean, well-lighted way to handle exceptional situations at runtime, letting us put all of our error-handling code into one easy-to-read place. An object of type Exception CAN be an instance of any subclass of Exception.
- Using a 'try/catch' block tells the compiler that you know an exceptional thing could happen in the method you're calling, so it knows you are the one taking care of it. There's another block called the 'finally' block where the code will run regardless of an exception.
- The flow control in try/catch blocks can happen in two ways when calling a risky method:
	- The risky method either succeeds and the try block completes or,
	- The risky method throws an exception back to the calling method.
- A method can throw multiple exceptions but the method's declaration must declare all the checked exceptions it can throw. We can stack the catch blocks under the try, one after the other. However, the order in which we stack the catch blocks matter.
- Exceptions can be referred to polymorphically where a method doesn't have to explicitly declare every possible exception it throws; it can declare a superclass of the exceptions. This means the higher up within the Exception inheritance tree, the bigger the 'catch' basket, and moving down the tree will have more specialized Exception classes.
- There are a number of rules when handling exceptions:
	- You cannot have a 'catch' or 'finally' without a 'try'.
	- You cannot put code between the 'try' and the 'catch'.
	- A 'try' MUST be followed by either a 'catch' or a 'finally'.
	- A 'try' with only a 'finally' (no catch) must still declare the exception.
