public static IntList[] partition(IntList lst, int k) {
    IntList[] array = new IntList[k];
    int index = 0;
    IntList L = reverse(lst)
    while (L != null) {
        IntList prev = array[index];
        Int curr = L.rest;
        L.rest = prev;
        array[index] = L;
        L = curr;
        index = (index + 1) % k;
    }
    return array;
}