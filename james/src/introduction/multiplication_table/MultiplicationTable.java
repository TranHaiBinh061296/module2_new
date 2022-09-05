package introduction.multiplication_table;

public class MultiplicationTable {
    /**
     * Main method
     */
    public static void main(String[] args) {
        //Hiển thị tiêu đề bảng
        System.out.println(" Multiplication Table");

        //Hiển thị tiêu đề số
        System.out.print(" ");
        for (int j = 1; j <= 9; j++)
            System.out.print(" " + j);

        System.out.println("\n———————————————————————————————————————");

        //Hiển thị nội dung bảng
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                // Trình bày kết quả và căn chỉnh đúng cách
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
