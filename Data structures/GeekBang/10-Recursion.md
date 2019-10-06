# Recursion
## What kind of questions can be solve by recursion?
3 conditions required:
- The origin question can be divided into several subquestions
- The only difference between the origin question and subquestions is the size of data. **The orign question and the subquestion have the same way to solve.**
- The recursion have termination conditions.
## How to write codes to solve recursion questions?
1. find the recursive formula
2. find the termination condition<br>
Understanding recusion: Assuming the subquestion is solved, how to solve the origin problem?
## Pros & Cons
1. Pros: shorter, simpler and easier to debug
2. Cons:
- use a lot of stack space -> might cause stack overflow error -> solve: limit the depth of recursion (not useful in the real world)/ use iteration
```
// 全局变量，表示递归的深度。(pseudocode)
int depth = 0;

int f(int n) {
  ++depth；
  if (depth > 1000) throw exception;
  
  if (n == 1) return 1;
  return f(n-1) + 1;
}
```
- calculation is done even more times -> slow -> solve: use hashmap to store the value that we calculated before
![too many calculations](https://static001.geekbang.org/resource/image/e7/bf/e7e778994e90265344f6ac9da39e01bf.jpg)
- the overhead of procedure calls -> slow
- high space complexity 
