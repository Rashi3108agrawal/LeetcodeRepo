# 🚀 DSA Playbook

A comprehensive Java repository for structured practice of **Data Structures & Algorithms**, focused on improving problem-solving skills through pattern-based learning.

This repository is maintained as a **progress log of consistent practice, revision, and interview preparation**.

---

## 🎯 Purpose

- Build strong problem-solving intuition
- Identify and master DSA patterns
- Improve speed and accuracy in coding interviews
- Maintain consistency in practice
- Learn and apply optimization techniques

---

## 🧠 Learning Approach

Each problem is solved using a structured method:

1. **Identify the Pattern** - Recognize problem type and similar problems
2. **Brute Force Approach** - Understand the naive solution first
3. **Optimize Step-by-Step** - Apply patterns and techniques to improve
4. **Implement Clean Solution** - Write readable, maintainable code
5. **Analyze Complexity** - Measure time and space complexity
6. **Note Key Insights** - Document important learnings

---

## 📌 Core Topics Covered

### Fundamental Patterns
- **Arrays & Hashing** - Working with arrays and hash-based data structures
- **Two Pointers** - Efficient traversal with dual pointers
- **Sliding Window** - Optimal substring/subarray problems
- **Prefix Sum** - Efficient range queries

### Data Structures
- **Stack & Monotonic Stack** - LIFO operations and optimized problems
- **Linked List** - Node-based data structure manipulation
- **Trees & Graphs** - Hierarchical and network problems
- **Heap/Priority Queue** - Top-K and ordering problems

### Algorithms
- **Binary Search** - Logarithmic search techniques
- **Divide and Conquer** - Breaking problems into subproblems
- **Dynamic Programming** - Optimal substructure problems
- **Backtracking** - Combinatorial and constraint satisfaction problems
- **Greedy** - Local optimal choice strategy
- **Bit Manipulation** - Binary representation operations

---

## 📚 Solutions by Category

### Array Problems
- [0001 - Two Sum](./0001-two-sum/Solution.java)
- [0011 - Container With Most Water](./0011-container-with-most-water/Solution.java)
- [0015 - 3Sum](./0015-3sum/Solution.java)
- [0033 - Search in Rotated Sorted Array](./0033-search-in-rotated-sorted-array/Solution.java)
- [0053 - Maximum Subarray](./0053-maximum-subarray/Solution.java)
- [0121 - Best Time to Buy and Sell Stock](./0121-best-time-to-buy-and-sell-stock/Solution.java)
- [0152 - Maximum Product Subarray](./0152-maximum-product-subarray/Solution.java)
- [0153 - Find Minimum in Rotated Sorted Array](./0153-find-minimum-in-rotated-sorted-array/Solution.java)
- [0217 - Contains Duplicate](./0217-contains-duplicate/Solution.java)
- [0238 - Product of Array Except Self](./0238-product-of-array-except-self/Solution.java)
- [0268 - Missing Number](./0268-missing-number/Solution.java)

### Dynamic Programming Problems
- [0070 - Climbing Stairs](./0070-climbing-stairs/Solution.java)
- [0322 - Coin Change](./0322-coin-change/Solution.java)
- [0338 - Counting Bits](./0338-counting-bits/Solution.java)
- [0518 - Coin Change II](./0518-coin-change-ii/Solution.java)

### Advanced DP
- [Combination Sum IV](./Combination-Sum-IV.java) - Permutation counting
- [Decode Ways](./Decode-Ways.java) - String decoding
- [House Robber](./House-Robber.java) - Sequential selection
- [House Robber II](./House-Robber-II.java) - Circular constraint
- [Longest Common Subsequence](./Longest-Common-Subsequence.java) - String alignment
- [Longest Increasing Subsequence](./Longest-Increasing-Subsequence.java) - Optimal ordering
- [Word Break](./Word-Break.java) - String segmentation

### Other Problems
- [0190 - Reverse Bits](./0190-reverse-bits/Solution.java) - Bit manipulation
- [0191 - Number of 1 Bits](./0191-number-of-1-bits/Solution.java) - Bit manipulation
- [0371 - Sum of Two Integers](./0371-sum-of-two-integers/Solution.java) - Bit operations
- [Find Median from Data Stream](./Find-Median-from-Data-Stream.java) - Heap usage
- [Merge k Sorted Lists](./Merge-k-Sorted-Lists.java) - List merging
- [Rotate Image](./Rotate-Image.java) - Matrix transformation
- [Set Matrix Zeroes](./Set-Matrix-Zeroes.java) - In-place modification
- [Spiral Matrix](./Spiral-Matrix.java) - Matrix traversal
- [Top K Frequent Elements](./Top-K-Frequent-Elements.java) - Heap operations
- [Unique Paths](./Unique-Paths.java) - Combinatorics
- [Word Search](./Word-Search.java) - Backtracking

---

## 🏗️ Repository Structure

```
dsa-playbook/
├── README.md                          # This file
├── .gitignore                         # Java build artifacts
├── 0001-two-sum/
│   ├── Solution.java                 # Main solution
│   └── NOTES.md                       # Problem insights
├── 0011-container-with-most-water/
│   ├── Solution.java
│   └── NOTES.md
├── [More problem directories...]
└── [Additional solution files by topic]
```

---

## 🧩 Solution File Format

Each solution includes:

- **Problem Statement** - Clear description of what to solve
- **Approach Explanation** - How the pattern solves this problem
- **Code Implementation** - Clean, well-commented Java code
- **Complexity Analysis** - Time and space complexity
- **Key Insights** - Important takeaways and tips

Example structure in each Solution.java:
```java
/**
 * LeetCode Problem: XXXX
 * Pattern: [Array/DP/Binary Search/etc]
 * Difficulty: [Easy/Medium/Hard]
 * Time: O(?)  Space: O(?)
 */
public class Solution {
    public Object solve(Object[] input) {
        // Solution implementation
    }
}
```

---

## 📈 Focus Areas

- ✅ **Consistency over Quantity** - Regular practice with quality over volume
- ✅ **Pattern Recognition** - Focus on recognizing similar problem patterns
- ✅ **Revision** - Regularly revisit and optimize solved problems
- ✅ **Code Quality** - Write clean, readable, and maintainable code
- ✅ **Complexity Analysis** - Deep understanding of efficiency

---

## ⚙️ Philosophy

> "The goal is not to solve every problem, but to recognize patterns quickly and apply them correctly."

### Key Principles
1. **Master the Patterns** - Learn 5-10 core patterns deeply
2. **Practice Consistently** - Daily practice builds intuition
3. **Understand, Don't Memorize** - Know WHY solutions work
4. **Optimize Progressively** - Start with working solution, then optimize
5. **Learn from Others** - Study different approaches to same problem

---

## 🚀 Getting Started

1. Clone the repository
   ```bash
   git clone https://github.com/Rashi3108agrawal/dsa-playbook.git
   ```

2. Navigate to a problem directory
   ```bash
   cd 0001-two-sum
   ```

3. Review the problem and understand the pattern

4. Study the solution and complexity analysis

5. Try solving it yourself before looking at the solution

---

## 📊 Statistics

Track progress with the `stats.json` file that maintains:
- Problems solved by pattern
- Difficulty distribution
- Time and space complexity metrics
- Revision count

---

## 🤝 Contributing to Your Own Learning

This is a personal learning repository. Consider:
- Adding more problems and patterns
- Improving complexity analysis
- Adding alternative solutions
- Creating visual explanations
- Documenting common mistakes

---

## 📝 License

This repository is for personal learning and reference purposes.

---

## 📞 Let's Connect

Following consistent practice and mastering DSA patterns leads to:
- Better interview performance
- Stronger problem-solving skills
- Deeper understanding of computer science fundamentals

Happy coding! 🎯
