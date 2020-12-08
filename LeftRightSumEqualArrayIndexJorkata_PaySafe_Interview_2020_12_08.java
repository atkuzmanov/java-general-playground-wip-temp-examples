public static void main(String[] args) {
    int[] arr = new int[] {5, 3, 5, 8, 0, 8, 12, 1}; // print 4
    int[] arr1 = new int[] {1, 2, 3, 4, 5000, 10}; // print 4
    System.out.println(findIndex(arr));
  }

  private static int findIndex(final int[] arr) {
    if (arr == null) {
      return -1;
    }

    int leftSum = 0;
    int totalSum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (i + 1 < arr.length && arr[i + 1] > totalSum) {
        continue;
      }
      totalSum += arr[i];
    }

    System.out.println("totalSum: " + totalSum);

    int maxElIndex = findMaxElIndex(arr, totalSum);
    System.out.println("maxElIndex: " + maxElIndex);

    for (int j = 0; j < arr.length; j++) {
      if (maxElIndex != -1 && maxElIndex == j) {
        continue;
      }

      leftSum += arr[j];

      System.out.println("j: " + j + ", totalSum: " + totalSum + ", leftSum: " + leftSum);

      if (leftSum == totalSum) {
        return j + 1;
      }
    }
    return -1;
  }

  private static int findMaxElIndex(final int[] arr, final int maxSum) {
    int maxElIndex = -1;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] >= maxSum) {
        maxElIndex = i;
      }
    }

    return maxElIndex;
  }