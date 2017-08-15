package com.upa.codebook.Queue;

public class BinaryHeapDemo2<AnyType extends Comparable<? super AnyType>> {
	// Construct the binary heap.
	public BinaryHeapDemo2() {
		this(DEFAULT_CAPACITY);
	}

	// Construct the binary heap.
	@SuppressWarnings("unchecked")
	public BinaryHeapDemo2(int capacity) {
		this.currentSize = 0;
		this.A = (AnyType[]) new Comparable[capacity + 1];
	}

	// Construct the binary heap given an array of items.
	@SuppressWarnings("unchecked")
	public BinaryHeapDemo2(AnyType[] items) {
		this.currentSize = items.length;
		this.A = (AnyType[]) new Comparable[((this.currentSize + 2) * 11) / 10];

		int i = 1;
		for (AnyType item : items) {
			this.A[i++] = item;
		}
		this.buildHeap();
	}

	// Insert into the priority queue, maintaining heap order. Duplicates are
	// allowed.
	public void insert(AnyType x) {
		if (this.currentSize == (this.A.length - 1)) {
			this.enlargeArray((this.A.length * 2) + 1);
		}

		// Percolate up
		int hole = ++this.currentSize;
		for (; (hole > 1) && (x.compareTo(this.A[hole / 2]) < 0); hole /= 2) {
			this.A[hole] = this.A[hole / 2];
		}
		this.A[hole] = x;
	}

	@SuppressWarnings("unchecked")
	private void enlargeArray(int newSize) {
		AnyType[] old = this.A;
		this.A = (AnyType[]) new Comparable[newSize];
		for (int i = 0; i < old.length; i++) {
			this.A[i] = old[i];
		}
	}

	// Find the smallest item in the priority queue.
	public AnyType findMin() {
		if (this.isEmpty()) {
			return null;
		}
		// throw new UnderflowException( );
		return this.A[1];
	}

	// Remove the smallest item from the priority queue.
	public AnyType deleteMin() {
		if (this.isEmpty()) {
			return null;
			// throw new UnderflowException( );
		}

		AnyType minItem = this.findMin();
		this.A[1] = this.A[this.currentSize--];
		this.percolateDown(1);

		return minItem;
	}

	// Establish heap order property from an arbitrary arrangement of items.
	// Runs in linear time.
	private void buildHeap() {
		for (int i = this.currentSize / 2; i > 0; i--) {
			this.percolateDown(i);
		}
	}

	// Test if the priority queue is logically empty.
	public boolean isEmpty() {
		return this.currentSize == 0;
	}

	// Make the priority queue logically empty.
	public void makeEmpty() {
		this.currentSize = 0;
	}

	private static final int DEFAULT_CAPACITY = 10;

	private int currentSize; // Number of elements in heap
	private AnyType[] A; // The heap array

	// Internal method to percolate down in the heap.
	private void percolateDown(int hole) {
		int child;
		AnyType tmp = this.A[hole];

		for (; (hole * 2) <= this.currentSize; hole = child) {
			child = hole * 2;
			if ((child != this.currentSize)
					&& (this.A[child + 1].compareTo(this.A[child]) < 0)) {
				child++;
			}
			if (this.A[child].compareTo(tmp) < 0) {
				this.A[hole] = this.A[child];
			} else {
				break;
			}
		}
		this.A[hole] = tmp;
	}

	// Test program
	public static void main(String[] args) {
		int numItems = 10000;
		BinaryHeapDemo2<Integer> h = new BinaryHeapDemo2<Integer>();
		int i = 37;

		for (i = 37; i != 0; i = (i + 37) % numItems) {
			h.insert(i);
		}
		for (i = 1; i < numItems; i++) {
			if (h.deleteMin() != i) {
				System.out.println("Oops! " + i);
			}
		}
	}
}
