class Solution {
    public int[] sortArray(int[] nums) {
       int[] temp = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length);
        return nums;
    }

    private void mergeSort(int[] arr, int[] temp, int start, int end) {
        if (end - start <= 1) return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, temp, start, mid);
        mergeSort(arr, temp, mid, end);
        merge(arr, temp, start, mid, end);
    }

    private void merge(int[] arr, int[] temp, int start, int mid, int end) {
        int i = start, j = mid, k = start;

        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }

        while (j < end) {
            temp[k++] = arr[j++];
        }

        for (int p = start; p < end; p++) {
            arr[p] = temp[p];
        }
    }  
    }