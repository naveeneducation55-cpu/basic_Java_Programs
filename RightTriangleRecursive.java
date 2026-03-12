public class RightTriangleRecursive {

    // Prints stars in a single row
    public static void printStars(int stars) {
        if (stars == 0) return;
        System.out.print("* ");
        printStars(stars - 1);
    }

    // Prints rows recursively
    public static void printTriangle(int currentRow, int totalRows) {
        if (currentRow > totalRows) return;
        printStars(currentRow);
        System.out.println();
        printTriangle(currentRow + 1, totalRows);
    }

    public static void main(String[] args) {
        int n = 5;
        printTriangle(1, n);
    }
}