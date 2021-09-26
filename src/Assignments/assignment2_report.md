###     YU An (1523003)
#Program Structures & Algorithms Fall 2021 Assignment No. 2
###Task:<br> 
####part1:<br>
You are to implement three methods of a class called Timer. Please see the skeleton class that I created in the repository. Timer is invoked from a class called Benchmark_Timer which implements the Benchmark interface. The APIs of these class are as follows<br>
####part2:<br>
Implement InsertionSort (in the InsertionSort class) by simply looking up the insertion code used by Arrays.sort. If you have the instrument = true setting in test/resources/config.ini, then you will need to use the helper methods for comparing and swapping (so that they properly count the number of swaps/compares). The easiest is to use the helper.swapStableConditional method, continuing if it returns true, otherwise breaking the loop. Alternatively, if you are not using instrumenting, then you can write (or copy) your own compare/swap code. Either way, you must run the unit tests in InsertionSortTest.<br>
####part3:<br>
Implement a main program (or you could do it via your own unit tests) to actually run the following benchmarks: measure the running times of this sort, using four different initial array ordering situations: random, ordered, partially-ordered and reverse-ordered. I suggest that your arrays to be sorted are of type Integer. Use the doubling method for choosing n and test for at least five values of n. Draw any conclusions from your observations regarding the order of growth.
***
Relationship Conclusion:<br>
Conclusion regarding the order of growth:<br>**_reverse-ordered array > random array ~ partially random array > ordered array<br>_**<br>
Reversed-Array required maximum time since we need to compare and swap every element. The Sort time which random array and partially-random array required are roughly equal. the ordered array required minimum time since each element was sorted.

<br> 

***
Evidence to support the conclusion:  
1.Output (Snapshot of Code output in the termi-
nal)

<br>
1.Graphical Representation:<br>
Random array:

![random](https://user-images.githubusercontent.com/50298195/134817982-7c4e344a-c76c-46cb-a576-32e67d849c74.PNG)

Ordered array:
![ordered](https://user-images.githubusercontent.com/50298195/134817954-c1d869b9-47e0-459f-8764-16e655d06ab7.PNG)
Partially-ordered array:
![partially ordered](https://user-images.githubusercontent.com/50298195/134817998-88c0c51b-1e25-434a-a96d-8da9ea01787b.PNG)
Reverse-ordered array:
![reverse ordered](https://user-images.githubusercontent.com/50298195/134818010-b0ee9abc-ab0c-4d4b-8eb8-983a95d86140.PNG)
<br>

***
Unit tests result:(Snapshot of successful unit)
TimerTest:
![timerTest shot](https://user-images.githubusercontent.com/50298195/134817814-4cb1027b-7bd1-4b05-abaa-1bd181b1b7a7.PNG)
BenchMarkTest:
![benchMarkTest shot](https://user-images.githubusercontent.com/50298195/134817782-77121f70-a067-4323-bfc6-41978e291a07.PNG)

InsertionSortTest:
![shotscreen InsertionSortTest](https://user-images.githubusercontent.com/50298195/134817800-b297707c-bbeb-427f-bfe4-bc796b631825.PNG)