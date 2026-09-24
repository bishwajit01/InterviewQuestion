Number of steps = n
m = [ max number of steps at a time ]

output number of ways
-------------------------
n = 3, m = [1, 2]
ways[0] = 0-1-2-3
ways[1] = 0-1-3, 0-2-3

n = 4, m = [1, 2, 3]
ways[0] = 0-1-2-3-4
ways[1] = 0-1-3-4, 0-2-4, 0-1-3-1, 0-2-3-4
ways[2] = 0-1-4, 0-3-1




1. What the problem is asking
------------------------------------

n steps in a staircase (from step 0 to step n)
A list M that tells you how many steps you are allowed to jump at a time

Example:
n = 4
M = [1, 2, 3]

This means:
You can move 1 step, or 2 steps, or 3 steps in one move
You must count all possible ways to reach exactly step 4

2. Meaning of “number of ways”
------------------------------------
A way is a sequence of jumps whose total equals n.

For n = 4, some valid ways are:

1 → 1 → 1 → 1
1 → 3
2 → 2
3 → 1

Order matters:
1 → 3 and 3 → 1 are different ways


3. Key idea (Dynamic Programming)
------------------------------------
Instead of solving the whole problem at once, we solve smaller steps first.

Define:
dp[i] = number of ways to reach step i


4. Base case
------------------------------------
Step 0
You are already at the start
There is exactly 1 way to be at step 0 (do nothing)

dp[0] = 1


5. Transition logic (most important part)
----------------------------------------------------
To reach step i, you could have come from:

i - 1 (if step size 1 is allowed)
i - 2 (if step size 2 is allowed)
i - 3 (if step size 3 is allowed)

So:
dp[i] = dp[i-1] + dp[i-2] + dp[i-3]


6. Walkthrough for n = 4, M = [1,2,3]
----------------------------------------------------
Step-by-step DP table

i(step)			Calculation							dp[i]
  0				base case							1
  1			dp[1] = dp[0]							1
  2			dp[2] = dp[1] + dp[0]					2
  3			dp[3] = dp[2] + dp[1] + dp[0]			4
  4			dp[4] = dp[3] + dp[2] + dp[1]			7


8. Code explained in plain English
----------------------------------------------------
dp = [0] * (n + 1)   # dp array
dp[0] = 1            # base case

for i in range(1, n + 1):
    for step in M:
        if i - step >= 0:
            dp[i] += dp[i - step]

return dp[n]


Outer loop → current step we want to reach
Inner loop → try each allowed jump

Add ways from previous reachable steps

9. Important note
----------------------------------------------------
This problem is a generalized Fibonacci problem

