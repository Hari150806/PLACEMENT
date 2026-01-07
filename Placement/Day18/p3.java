package Placement.Day18;

public class p3 { // min heap extract min
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
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);

        System.out.println("Extracted Min: " + minHeap.extractMin()); // 1
        System.out.println("Extracted Min: " + minHeap.extractMin()); // 3
    }
    
}
