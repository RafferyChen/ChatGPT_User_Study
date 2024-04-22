# Coding Task: Find the K-Beauty of a Number

## Problem Statement
The **k-beauty** of an integer `num` is defined as the number of substrings of `num` (when it is read as a string) that meet the following conditions:

- The substring has a length of `k`.
- The substring, when converted back to an integer, is a divisor of `num`.

**Constraints**:
- Leading zeros are allowed.
- Note that `0` is not a divisor of any value.

## Requirements
Given integers `num` and `k`, return the k-beauty of `num`. A substring is a contiguous sequence of characters within a string.

## Examples

### Example 1:
**Input:** `num = 240, k = 2`  
**Output:** `2`  
**Explanation:**
The following are the substrings of `num` of length `k`:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
  Therefore, the k-beauty is 2.

### Example 2:
**Input:** `num = 430043, k = 2`  
**Output:** `2`  
**Explanation:**
The following are the substrings of `num` of length `k`:
- "43" from "430043": 43 is a divisor of 430043.
- "30" from "430043": 30 is not a divisor of 430043 (ignored).
- "00" from "430043": 0 is not a divisor of 430043 (ignored).
- "04" from "430043": 4 is not a divisor of 430043.
- "43" from "430043": 43 is a divisor of 430043.
  Hence, the total is 2.

## Task
Write a function `divisorSubstrings(num, k)` that returns the k-beauty of the given number `num`.

