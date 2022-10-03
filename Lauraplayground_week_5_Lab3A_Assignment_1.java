public class Lauraplayground_week_5_Lab3A_Assignment_1 {
    public static void main(String[] args) {
        Calendar(6, 32);
    }

    public static void Calendar(int sunday, int days) {
        // printing out the items that only appear
        // once or twice and are not affected by the variables
        System.out.println("  Sun   Mon   Tue   Wed   Thu   Fri   Sat   ");
        System.out.println("+-----+-----+-----+-----+-----+-----+-----+");
// using a for loop to print out the blank days
        for (int row = 1; row <= 5; row++) {
            for (int sunday = 1; sunday <= 6; sunday++) {
                for (int days = 1; days < 31; days++) {

                }
                System.out.println("|     |     |     |     |     |     |     |");

            }
            System.out.println("+-----+-----+-----+-----+-----+-----+-----+");
        }
    }
}