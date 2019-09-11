public class MergeSort {
    /**
     * Merge sort with and auxiliary array for the sorting operation
     * @param a     - array with Comparable
     * @param aux   - auxiliary array used while sorting
     * @param lo    - lowest index of the subarray
     * @param mid   - midpoint index of the subarray
     * @param hi    - highest index of subarray
     */
    private static void merge (Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
        /**
         * Assertions to make sure the array is sorted before the merging operation
         */
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];                  // copy array to the auxiliary array
        }

        /**
         * merging of the two subarrays from auxiliary array to the array
         * i going from lo to mid indices of the subarray
         * j going from (mid+1) to hi indices of the subarray
         * k iterates through the whole array a
         */
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            // i > mid, then all indices of the "left" subarray has been iterated through
            if      (i > mid)                       a[k] = aux[j++];
            // j > hi, j has iterated through all indices of the "right" subarray
            else if (j > hi)                        a[k] = aux[i++];
            // aux[j] < aux[i] the value of the right subarray is less and will be placed in array a
            else if (aux[j].compareTo(aux[i]) < 0)  a[k] = aux[j++];
            // aux[i] <= aux[j] is the other case where the value in the left subarray is less and will be placed in a
            else                                    a[k] = aux[i++];
        }
        /**
         * Asserting that the array is sorted after the merge
         */
        assert isSorted(a, lo, hi);
    }

    /**
     * The method private to the class where a recursive call to sort is made to divide the array and sort it.
     * @param a     - array to be sorted
     * @param aux   - auxiliary subarray for reordering and dividing
     * @param lo    - lowest index of the subarray
     * @param hi    - highest index of the subarray
     */
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }

    /**
     * the public method to sort array a
     * @param a - the array to be sorted
     */
    public static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux,  0, a.length - 1);
    }

    public static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo; i < hi-1; i++) {
            if (a[i].compareTo(a[i+1]) > 0)
                return false;
        }
        return true;
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i].compareTo(a[i+1]) > 0)
                return false;
        }
        return true;
    }
}
