###     YU An (1523003)
#Program Structures & Algorithms Fall 2021 Assignment No. 3
###Task:<br>
Step 1:<br>
A cutoff (defaults to, say, 1000) which you will update according to the first argument in the command line when running. It's your job to experiment and come up with a good value for this cutoff. If there are fewer elements to sort than the cutoff, then you should use the system sort instead.

Step 2:<br>
Recursion depth or the number of available threads. Using this determination, you might decide on an ideal number (t) of separate threads (stick to powers of 2) and arrange for that number of partitions to be parallelized (by preventing recursion after the depth of lg t is reached).

Step 3:<br>
An appropriate combination of these.

***
Relationship Conclusion:<br>
According the data I collected through this experiment, for the same array size, it can be seen that when the number of Thread is 4, it spend more time than thread equal to 6 and 8. But threads equal to 6 spend less time than 8;
For the large array, the more time it takes to sort by the same number of threads.

I found that when array size equal to 2,500,000 and cutoff equal to 630,000, the time decreased a lot. so, I assume that when cutoff larger than 25% of array size, the cutoff is most efficient. 

so I set array size equal to 2,000,000 and cutoff start from 410,000. According third picture that the time decreased since cutoff larger than 510,000 which is 25% of array size, my assumption is proved.
<br> 

***
Evidence to support the conclusion:
<br>

ScreenShot of Excel file:

array size : 2000000 <br>

![sheet1](https://user-images.githubusercontent.com/50298195/140683439-853ec915-5feb-4d93-a013-6d9c86586f27.PNG)
array size : 2500000 <br>

![sheet2](https://user-images.githubusercontent.com/50298195/140683444-d1abd25e-bb35-4a43-8f40-dcd3dbcc4220.PNG)

array size : 2000000 cutoff: start from 410,000 <br>

![sheet3](https://user-images.githubusercontent.com/50298195/141047096-1b5c0903-ed4d-47e9-bcb9-c489077ac511.PNG)
