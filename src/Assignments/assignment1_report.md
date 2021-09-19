###     YU An (1523003)
#Program Structures & Algorithms Fall 2021 Assignment No. 1
Task:<br> Imagine a drunken man who, starting out leaning against a lamp post in the middle of an open space, takes a series of steps of the same length: 1 meter. The direction of these steps is randomly chosen from North, South, East or West. After n steps, how far (d), generally speaking, is the man from the lamp post? Note that d is the Euclidean distance of the man from the lamp-post.<br>
***
Relationship Conclusion:

d=Math.pow(nd,0.5d)<br> 
***
Evidence to support the conclusion:  
1.Output (Snapshot of Code output in the termi-
nal)
![6test](https://user-images.githubusercontent.com/50298195/133913280-f63c7721-e922-4870-a1d6-22f9d4d80a91.PNG)
<br>
2.Graphical Representation
![conclusion](https://user-images.githubusercontent.com/50298195/133913269-86858ad7-11e1-4c4b-8453-c249a965bb38.PNG)<br>
In order to known the relationship between d and n. I output the meandirection that range of n is from 0 to 1000 and run the experiments 30 times.
From the graph, we known that The relationship between d and n is an exponential growth with coefficient less than 1. I assume that the relationship between d and n is d=n0.5, because when n equal to 100, d value is about 10. <br>
***
Unit tests result:(Snapshot of successful unit
test run)![unite test](https://user-images.githubusercontent.com/50298195/133913250-fe430a65-6d92-4fbe-804f-0c6c7ab287e0.PNG)
