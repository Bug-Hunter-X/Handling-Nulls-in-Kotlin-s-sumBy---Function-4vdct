# Kotlin Nullable SumBug

This repository demonstrates a common issue encountered when using Kotlin's `sumBy()` function with nullable collections. The `sumBy()` function throws a `NullPointerException` if it encounters a null value. This example showcases the problem and provides a solution using the Elvis operator.  The solution ensures that the code handles null values safely without crashing.

## Problem
The `sumBy()` function isn't designed to directly handle null values. If a collection contains nullable elements, calling `sumBy()` on it will lead to a runtime error when a null element is processed.

## Solution
To address this issue, the solution employs the Elvis operator (`?:`) to provide a default value of 0 for null elements, allowing the summation to proceed without errors. This approach safely handles nulls, preventing crashes and ensuring correct results.