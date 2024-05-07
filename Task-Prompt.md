# Coding Task: Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit

## Problem Statement
Given an array of integers `nums` and an integer `limit`, return the size of the longest non-empty subarray such that the absolute difference between any two elements of this subarray is less than or equal to the limit.

## Example
**Input:** `nums = [8, 2, 4, 7]`, `limit = 4`  
**Output:** 2  
**Explanation:** All subarrays are:  
- `[8]` with maximum absolute diff `|8-8| = 0 <= 4`.
- `[8,2]` with maximum absolute diff `|8-2| = 6 > 4`.
- `[8,2,4]` with maximum absolute diff `|8-2| = 6 > 4`.
- `[8,2,4,7]` with maximum absolute diff `|8-2| = 6 > 4`.
- `[2]` with maximum absolute diff `|2-2| = 0 <= 4`.
- `[2,4]` with maximum absolute diff `|2-4| = 2 <= 4`.
- `[2,4,7]` with maximum absolute diff `|2-7| = 5 > 4`.
- `[4]` with maximum absolute diff `|4-4| = 0 <= 4`.
- `[4,7]` with maximum absolute diff `|4-7| = 3 <= 4`.
- `[7]` with maximum absolute diff `|7-7| = 0 <= 4`.

Therefore, the size of the longest subarray is 2.


## Task
Write a function `longestContinousSubarray(nums, limit)` that returns the size of the longest subarray.

