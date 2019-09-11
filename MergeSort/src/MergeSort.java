public class MergeSort {
    private static void merge (Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];                  // copy
        }

        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)                       a[k] = aux[j++];
            else if (j > hi)                        a[k] = aux[i++];
            else if (aux[j].compareTo(aux[i]) < 0)  a[k] = aux[j++];
            else                                    a[k] = aux[i++];
        }

        assert isSorted(a, lo, hi);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }

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