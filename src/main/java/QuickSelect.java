public class QuickSelect {
    /**
     * Incorrect implementation, debug to fix
     */

    public static void main(String[] args) {
        int rank = 6;
        int[] arr = {-5, -10, 4, 1, 10, 200, 56, 8};
        System.out.println("Element with rank : " + rank + " is: " + quickSelect(arr, rank));
    }

    private static int quickSelect(int[] arr, int rank) {
        return rank(arr, 0, arr.length - 1, rank);
    }

    private static int rank(int[] arr, int l, int r, int rank) {
        int pivot = (int)(Math.random() * (r-l+1) + l);
        int pos = partition(arr, l, r, arr[pivot]);
        int size = pos -l +1;
        if (size == rank+1) {
            return arr[size];
        } else if (rank < size) {
            return rank(arr, l, r, rank);
        } else {
            return rank(arr, pos+1, r, rank-size);
        }

    }

    private static int partition(int[] arr, int l, int r, int piv) {
        while (true) {
            while (l<=r && arr[l] <= piv) l++;
            while (l<=r && arr[r] > piv) r--;

            if(l>r)  return l-1;
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
    }

}
