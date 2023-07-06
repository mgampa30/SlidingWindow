# SlidingWindow

# Algorithm

Start with an array arr of size n and a window size k.

Iterate through the array from index 0 to n - k (exclusive).

For each iteration, set max to the first element of the current window (arr[i]).

Nested within the outer loop, iterate from 1 to k - 1 (exclusive) to traverse the elements within the current window.

Compare each element in the current window (arr[i+j]) with max. If it is greater, update max to the new maximum value.

After the nested loop, print max, which represents the maximum value within the current window.

Repeat steps 3-6 for each window in the array.
