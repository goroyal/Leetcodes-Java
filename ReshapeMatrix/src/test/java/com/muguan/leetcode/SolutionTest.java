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

		int[][] result = solution.matrixReshape(nums, row, column);

		int[][] expect = {
				{1, 2, 3, 4},
				{5, 6, 7, 8}
		};
		Assert.assertEquals(2, result.length);
		Assert.assertEquals(4, result[0].length);
		Assert.assertArrayEquals(expect, result);
	}

	@Test
	public void testMatrixReshapeToOneRow() {
		int[][] nums = {
				{1, 2}, {3, 4}, {5, 6}, {7, 8}
		};
		int row = 1;
		int column = 8;

		int[][] result = solution.matrixReshape(nums, row, column);

		Assert.assertEquals(1, result.length);
		Assert.assertEquals(8, result[0].length);
		int[][] expect = {{1, 2, 3, 4, 5, 6, 7, 8}};
		Assert.assertArrayEquals(expect, result);
	}

	@Test
	public void testMatrixReshapeToOneColumn() {
		int[][] nums = {
				{1, 2}, {3, 4}, {5, 6}, {7, 8}
		};
		int row = 8;
		int column = 1;

		int[][] result = solution.matrixReshape(nums, row, column);

		Assert.assertEquals(8, result.length);
		Assert.assertEquals(1, result[0].length);
		int[][] expect = {
				{1},
				{2},
				{3},
				{4},
				{5},
				{6},
				{7},
				{8}
		};
		Assert.assertArrayEquals(expect, result);
	}

	@Test
	public void testReshapeFromOneRowMatrix() {
		int[][] nums = {{1, 2, 3, 4, 5, 6, 7, 8}};
		int row = 2;
		int column = 4;

		int[][] result = solution.matrixReshape(nums, row, column);

		Assert.assertEquals(2, result.length);
		Assert.assertEquals(4, result[0].length);
		int[][] expect = {
				{1, 2, 3, 4},
				{5, 6, 7, 8}
		};
		Assert.assertArrayEquals(expect, result);
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

		int[][] result = solution.matrixReshape(nums, row, column);

		Assert.assertEquals(2, result.length);
		Assert.assertEquals(4, result[0].length);
		int[][] expect = {
				{1, 2, 3, 4},
				{5, 6, 7, 8}
		};
		Assert.assertArrayEquals(expect, result);
	}

	@Test
	public void testMatrixInValidReshape() {
		int[][] nums = {
				{1, 2}, {3, 4}, {5, 6}, {7, 8}
		};
		int row = 3;
		int column = 3;

		int[][] result = solution.matrixReshape(nums, row, column);

		Assert.assertEquals(4, nums.length);
		Assert.assertEquals(2, nums[0].length);
		int[][] expect = {
				{1, 2}, {3, 4}, {5, 6}, {7, 8}
		};
		Assert.assertArrayEquals(expect, result);
	}
}
