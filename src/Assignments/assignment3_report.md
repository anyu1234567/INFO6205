###     YU An (1523003)
#Program Structures & Algorithms Fall 2021 Assignment No. 3
###Task:<br>
Step 1:<br>
(a) Implement height-weighted Quick Union with Path Compression. For this, you will flesh out the class UF_HWQUPC. All you have to do is to fill in the sections marked with // TO BE IMPLEMENTED ... // ...END IMPLEMENTATION.

(b) Check that the unit tests for this class all work. You must show "green" test results in your submission (screenshot is OK).

Step 2:<br>
Using your implementation of UF_HWQUPC, develop a UF ("union-find") client that takes an integer value n from the command line to determine the number of "sites." Then generates random pairs of integers between 0 and n-1, calling connected() to determine if they are connected and union() if not. Loop until all sites are connected then print the number of connections generated. Package your program as a static method count() that takes n as the argument and returns the number of connections; and a main() that takes n from the command line, calls count() and prints the returned value. If you prefer, you can create a main program that doesn't require any input and runs the experiment for a fixed set of n values. Show evidence of your run(s).

Step 3:<br>
Determine the relationship between the number of objects (n) and the number of pairs (m) generated to accomplish this (i.e. to reduce the number of components from n to 1). Justify your conclusion in terms of your observations and what you think might be going on.

***
Relationship Conclusion:<br>


<br> 

***
Evidence to support the conclusion:
<br>
1.Graphical Representation:<br>
step2:
![UF_client](https://user-images.githubusercontent.com/50298195/136667962-b6f2b3f9-95f8-42a8-90ef-016ec096657d.PNG)
ScreenShot of Excel file:
![relationship](https://user-images.githubusercontent.com/50298195/136668363-86a899dc-308c-41fa-8805-08e0c2fc6eb2.PNG)

<br>

***
Unit tests result:(Snapshot of successful unit)
![UF_HWQUPC_Test shotScreen](https://user-images.githubusercontent.com/50298195/136667988-65a24c58-9707-407d-99c9-8de9988c1756.PNG)
