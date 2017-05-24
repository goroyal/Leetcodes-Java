package com.muguan.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dgq on 2017/5/24.
 */
public class SolutionTest {
	private Solution solution;

	@Before
	public void setUp() {
		solution = new Solution();
	}

	@Test
	public void testMatrixExchangeRowColumn() {
		int[][] nums = {
				{1, 2}, {3, 4}, {5, 6}, {7, 8}
		};
		int row = 2;
		int column = 4;
		solution.matrixReshape(nums, row, column);
		int[][] result = {
				{1, 2, 3, 4},
				{5, 6, 7, 8}
		};
		Assert.assertEquals(2, nums.length);
		Assert.assertEquals(4, nums[0].length);
		Assert.assertArrayEquals(result, nums);
	}

	@Test
	public void testMatrixReshapeToOneRow() {
		int[][] nums = {
				{1, 2}, {3, 4}, {5, 6}, {7, 8}
		};
		int row = 1;
		int column = 8;
		solution.matrixReshape(nums, row, column);
		Assert.assertEquals(1, nums.length);
		Assert.assertEquals(8, nums[0].length);
		int[][] result = {{1, 2, 3, 4, 5, 6, 7, 8}};
		Assert.assertArrayEquals(result, nums);
	}

	@Test
	public void testMatrixReshapeToOneColumn() {
		int[][] nums = {
				{1, 2}, {3, 4}, {5, 6}, {7, 8}
		};
		int row = 8;
		int column = 1;
		solution.matrixReshape(nums, row, column);
		Assert.assertEquals(8, nums.length);
		Assert.assertEquals(1, nums[0].length);
		int[][] result = {
				{1},
				{2},
				{3},
				{4},
				{5},
				{6},
				{7},
				{8}
		};
		Assert.assertArrayEquals(result, nums);
	}

	@Test
	public void testReshapeFromOneRowMatrix() {
		int[][] nums = {{1, 2, 3, 4, 5, 6, 7, 8}};
		int row = 2;
		int column = 4;
		solution.matrixReshape(nums, row, column);
		Assert.assertEquals(2, nums.length);
		Assert.assertEquals(4, nums[0].length);
		int[][] result = {
				{1, 2, 3, 4},
				{5, 6, 7, 8}
		};
		Assert.assertArrayEquals(result, nums);
	}

	@Test
	public void testReshapeFromOneColumnMatrix() {
		int[][] nums = {
				{1},
				{2},
				{3},
				{4},
				{5},
				{6},
				{7},
				{8}
		};
		int row = 2;
		int column = 4;
		solution.matrixReshape(nums, row, column);
		Assert.assertEquals(2, nums.length);
		Assert.assertEquals(4, nums[0].length);
		int[][] result = {
				{1, 2, 3, 4},
				{5, 6, 7, 8}
		};
		Assert.assertArrayEquals(result, nums);
	}

	@Test
	public void testMatrixInValidReshape() {
		int[][] nums = {
				{1, 2}, {3, 4}, {5, 6}, {7, 8}
		};
		int row = 3;
		int column = 3;
		solution.matrixReshape(nums, row, column);
		Assert.assertEquals(4, nums.length);
		Assert.assertEquals(2, nums[0].length);
		int[][] result = {
				{1, 2}, {3, 4}, {5, 6}, {7, 8}
		};
		Assert.assertArrayEquals(result, nums);
	}
}
