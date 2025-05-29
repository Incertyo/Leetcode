public class Q705 {
    class MyHashSet {
        int size;
        int[]arr;
        public MyHashSet() {
            arr = new int[10000];
            size = 0;
        }

        public void add(int key) {
            for(int i = 0; i < size; i++) {
                if(!contains(key)) {
                    arr[size++] = key;
                }
            }
        }

        public void remove(int key) {
            for(int i = 0; i < size; i++) {
                if(key == arr[i]) {
                    for(int j = i; j < size - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    size--;
                }
            }
        }

        public boolean contains(int key) {
            for(int i=0;i<size;i++) {
                if(arr[i]==key) {
                    return true;

                }
            }
            return false;
        }
    }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
}
