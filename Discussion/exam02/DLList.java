public class DLList {
    Node sentinel;
    
    public DLList() {
        //...
    }

    public class Node {
        int item;
        Node prev;
        Node next;
    }

    public void removeDuplicates() {

        Node ref = sentinel.next;
        Node checker;

        while (ref != sentinel) {
            checker = ref.next;
            while (checker != sentinel) {
                if (checker.item = ref.item) {
                    Node checkerPrev = checker.prev;
                    Node checkerNext = checker.next;
                    checkerPrev.next = checkerNext;
                    checkerNext.prev = checkerPrev;
                    checker = checkerNext;
                } else {
                    checker = checker.next;
                }
            }
            ref = ref.next;
        }
    }
}