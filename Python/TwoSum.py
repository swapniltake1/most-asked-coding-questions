
#Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
#You may assume that each input would have exactly one solution, and you may not use the same element twice.
#You can return the answer in any order.

 

#Example 1:

#Input: nums = [2,7,11,15], target = 9
#Output: [0,1]
#Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
#Example 2:

#Input: nums = [3,2,4], target = 6
#Output: [1,2]
#Example 3:





def two_sum(nums, target):
    # Create a dictionary to store the complement of each number along with its index
    num_map = {}
    
    # Iterate through the array
    for i, num in enumerate(nums):
        # Check if the complement exists in the dictionary
        complement = target - num
        if complement in num_map:
            # If found, return the indices of the current number and its complement
            return [num_map[complement], i]
        # If not found, add the current number and its index to the dictionary
        num_map[num] = i
    
    # If no solution is found
    return None

# Example usage:
nums1 = [2, 7, 11, 15]
target1 = 9
print(two_sum(nums1, target1))  # Output: [0, 1]

nums2 = [3, 2, 4]
target2 = 6
print(two_sum(nums2, target2))  # Output: [1, 2]

nums3 = [3, 3]
target3 = 6
print(two_sum(nums3, target3))  # Output: [0, 1]
 