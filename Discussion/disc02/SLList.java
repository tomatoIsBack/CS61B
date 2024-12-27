 public class SLList {
    Node sentinel;
    public SLList() {
    this.sentinel = new Node();
    }
    private static class Node {
    int item;
    Node next;
    }
    public int[][] gridify(int rows, int cols) {
        int[][] grid = new int[rows][cols];
        gridifyHelper(grid, this.sentinel.next, 0);
        return grid;
    }
    private void gridifyHelper(int[][] grid, Node curr, int numFilled) {
        if (curr == this.sentinel || numFilled == grid[0].length * grid.length) {
        return;
        }
    int row = numFilled / grid[0].length;
    int col = numFilled % grid[0].length;
    grid[row][col] = curr.item;
    gridifyHelper(grid, curr.next, numFilled + 1);
    }
 }