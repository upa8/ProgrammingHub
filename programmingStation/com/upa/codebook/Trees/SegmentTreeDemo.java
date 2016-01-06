package com.upa.codebook.Trees;

public class SegmentTreeDemo { // the segment tree is stored like a heap array
	private final int[] st, A;
	private final int n;

	// left child node
	private int left(int p) {
		// here we are multiplying p by 2^1 to get it's left
		// child node
		return p << 1;
	} // same as binary heap operations
		// right child node

	private int right(int p) {
		// here we are muliplying p by 2^1 to get it's right
		// child node and adding 1 to it
		return (p << 1) + 1;
	}

	// pre-processing function to build the segment tree
	private void build(int p, int L, int R) {
		// here p is index of temp segment tree array
		if (L == R) {
			this.st[p] = L; // store the index
		} else {
			// recursively compute the values
			// go to left node
			this.build(this.left(p), L, (L + R) / 2);
			// go to right node
			this.build(this.right(p), ((L + R) / 2) + 1, R);
			// p1 is index of left node
			int p1 = this.st[this.left(p)];
			// p2 is index of right node
			int p2 = this.st[this.right(p)];
			// This is main logic
			// now we have to find the minimum value present
			// at this node , and put that minimum value into the
			// parent node p
			if (this.A[p1] <= this.A[p2]) {
				this.st[p] = p1;
			} else {
				this.st[p] = p2;
			}
			// this.st[p] = (this.A[p1] <= this.A[p2]) ? p1 : p2;

			// another varient
			// 1) If we have to find maximum then
			// we would have used following code

			// if (this.A[p1] >= this.A[p2]) {
			// this.st[p] = p1;
			// } else {
			// this.st[p] = p2;
			// }

		}
	}

	private int rmq(int p, int L, int R, int i, int j) { // O(log n)

		// check whether current query is outside of segment tree or not
		// no overlap
		if ((i > R) || (j < L)) {
			return -1;
		}
		// this is complete overlap
		if ((L >= i) && (R <= j)) {
			return this.st[p]; // inside query range
		}

		// compute the min position in the left and right part of the interval
		int p1 = this.rmq(this.left(p), L, (L + R) / 2, i, j);

		int p2 = this.rmq(this.right(p), ((L + R) / 2) + 1, R, i, j);

		// if we try to access segment outside query
		if (p1 == -1) {
			return p2;
		}
		if (p2 == -1) {
			return p1;
		}
		// again change logic here to get the solution
		return (this.A[p1] <= this.A[p2]) ? p1 : p2;
	} // as as in build routine

	private int update_point(int p, int L, int R, int idx, int new_value) {
		// this update code is still preliminary, i == j
		// must be able to update range in the future!
		int i = idx, j = idx;

		// if the current interval does not intersect
		// the update interval, return this st node value!
		if ((i > R) || (j < L)) {
			return this.st[p];
		}

		// if the current interval is included in the update range,
		// update that st[node]
		if ((L == i) && (R == j)) {
			this.A[i] = new_value; // update the underlying array
			return this.st[p] = L; // this index
		}

		// compute the minimum position in the
		// left and right part of the interval
		int p1, p2;
		p1 = this.update_point(this.left(p), L, (L + R) / 2, idx, new_value);
		p2 = this.update_point(this.right(p), ((L + R) / 2) + 1, R, idx,
				new_value);

		// return the position where the overall minimum is
		// here is again we have to change the logic
		return this.st[p] = (this.A[p1] <= this.A[p2]) ? p1 : p2;
	}

	public SegmentTreeDemo(int[] _A) {
		this.A = _A;
		this.n = this.A.length; // copy content for local usage
		// Create an another array with 4*size of given array
		this.st = new int[4 * this.n];
		// fill this array with 0 value
		for (int i = 0; i < (4 * this.n); i++) {
			this.st[i] = 0; // create vector with length `len' and fill it with
							// zeroes
		}
		// now build the segment tree
		// p , l - left , r - right
		this.build(1, 0, this.n - 1); // recursive build
	}

	public int rmq(int i, int j) {
		// this is methode overloading
		// here we want to find answer of query between i , j
		// so we are calling rmq(p,l,r,i,j)
		// where p is root node of segement tree
		// l is left and r is right (0 to n-1)
		return this.rmq(1, 0, this.n - 1, i, j);
	}

	public int update_point(int idx, int new_value) {
		return this.update_point(1, 0, this.n - 1, idx, new_value);
	}

	public static void main(String[] args) {
		// the original array
		int[] A = new int[] { 18, 17, 13, 19, 15, 11, 20 };
		SegmentTreeDemo st = new SegmentTreeDemo(A);
		System.out.printf("              idx    0, 1, 2, 3, 4,  5, 6\n");
		System.out.printf("              A is {18,17,13,19,15, 11,20}\n");
		System.out.printf("RMQ(1, 3) = %d\n", st.rmq(1, 3)); // answer = index 2
		System.out.printf("RMQ(4, 6) = %d\n", st.rmq(4, 6)); // answer = index 5
		System.out.printf("RMQ(3, 4) = %d\n", st.rmq(3, 4)); // answer = index 4
		System.out.printf("RMQ(0, 0) = %d\n", st.rmq(0, 0)); // answer = index 0
		System.out.printf("RMQ(0, 1) = %d\n", st.rmq(0, 1)); // answer = index 1
		System.out.printf("RMQ(0, 6) = %d\n", st.rmq(0, 6)); // answer = index 5
		System.out.printf("              idx    0, 1, 2, 3, 4,  5, 6\n");
		System.out.printf("Now, modify A into {18,17,13,19,15,100,20}\n");
		// update the 5th index (starting from 0 that's why )
		// update function is much similar to rmq function
		st.update_point(5, 100); // update A[5] from 11 to 100
		System.out.printf("These values do not change\n");
		System.out.printf("RMQ(1, 3) = %d\n", st.rmq(1, 3)); // 2
		System.out.printf("RMQ(3, 4) = %d\n", st.rmq(3, 4)); // 4
		System.out.printf("RMQ(0, 0) = %d\n", st.rmq(0, 0)); // 0
		System.out.printf("RMQ(0, 1) = %d\n", st.rmq(0, 1)); // 1
		System.out.printf("These values change\n");
		System.out.printf("RMQ(0, 6) = %d\n", st.rmq(0, 6)); // 5->2
		System.out.printf("RMQ(4, 6) = %d\n", st.rmq(4, 6)); // 5->4
		System.out.printf("RMQ(4, 5) = %d\n", st.rmq(4, 5)); // 5->4
	}
}
