package Placement.Day18;

public class p1 { // heap implementation

    static class MinHeap {
        private int[] heap;
        private int size;
        private int capacity;

        public MinHeap(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.heap = new int[capacity];
        }

        private int parent(int index) {
            return (index - 1) / 2;
        }

        private int leftChild(int index) {
            return 2 * index + 1;
        }

        private int rightChild(int index) {
            return 2 * index + 2;
        }

        private void swap(int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

        public void insert(int key) {
            if (size == capacity) {
                throw new IllegalStateException("Heap is full");
            }
            heap[size] = key;
            size++;
            heapifyUp(size - 1);
        }

        private void heapifyUp(int index) {
            if (index > 0 && heap[parent(index)] > heap[index]) {
                swap(index, parent(index));
                heapifyUp(parent(index));
            }
        }

        // 🔴 idhu munnaadi class-kku veliya irundhuchu – ippo ullae kondu vandhom
        public int extractMin() {
            if (size == 0) {
                throw new IllegalStateException("Heap is empty");
            }
            int min = heap[0];
            heap[0] = heap[size - 1];
            size--;
            heapifyDown(0);
            return min;
        }

        private void heapifyDown(int index) {
            int smallest = index;
            int left = leftChild(index);
            int right = rightChild(index);

            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }
            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }
            if (smallest != index) {
                swap(index, smallest);
                heapifyDown(smallest);
            }
        }
    }

    // ✅ main method correct place-la
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);

        System.out.println("Extracted Min: " + minHeap.extractMin()); // 1
        System.out.println("Extracted Min: " + minHeap.extractMin()); // 3
    }

    // ✅ BST part separate-aa irukkalaam
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode insertBST(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }
        if (key < root.data) {
            root.left = insertBST(root.left, key);
        } else if (key > root.data) {
            root.right = insertBST(root.right, key);
        }
        return root;
    }
}
