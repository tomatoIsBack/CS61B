public static int[] rotate(int[] A, int k) {
    int rightShift = k % A.length;
    if (rightShift < 0) {
        rightShift += A.length;
    }
    int[] newArr = new int[A.length];
    for (int i = 0; i < A.length; i++) {
    int newIndex = (i + rightShift) % A.length;
    newArr[newIndex] = A[i];
    }
    return newArr;
}