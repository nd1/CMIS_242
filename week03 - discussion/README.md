### Prompt

What is exception propagation? Give an example of a class that contains at least two methods, in which one method calls another. Ensure that the subordinate method will call a predefined Java method that can throw a checked exception. The subordinate method should not catch the exception. Explain how exception propagation will occur in your example.

### Response

An exception in java is an unwanted event that interrupts the intended/ expected flow of a program. When exceptions occur, they happen at the top of the stack. If the method where the exception occurs does not have the ability to handle (catch) it, the exception will be propagated to the method that called the method where the exception occurred. In essence, it falls down the stack to prior calling methods until either the exception is handled or the program terminates with the exception message.

With checked exceptions, the program will not compile until all checked exceptions are caught. In the attached example, I have created two classes - ExceptionPropagation and ExceptionPropagationCaught. A method called getMyFile is called in main. getMyFile reads in a specified file then calls writeMyFile which will print out the file one character at a time. There are two possible checked exceptions- an IOException in writeMyFile and a FileNotFoundException in getMyFile.

In ExceptionPropagation, neither exception is handled so the program will not compile. In ExceptionPropagationCaught, writeMyFile throws an IOException. This is caught in getMyFile with a try/catch block. The FileNotFoundException is not handled in getMyFile. Instead the method throws the exception and it is handled in main.

If you compile the program without myFile.txt accessible, you will see the text

"File Not Found Exception occurred: "

from the catch in main with the error message. This illustrates that the exception is not caught in the subordinate method getMyFile but instead is handled by main once the exception falls through the stack.

Similarly, if there were an actual issue reading and writing the file, the exception would not be caught in writeMyFile and instead be handled with the catch in getMyFile.
