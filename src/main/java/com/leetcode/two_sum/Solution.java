package com.leetcode.two_sum;

//problem :: https://leetcode.com/problems/two-sum/
//blog post ::
//youtube tutorial ::

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
    }
}
