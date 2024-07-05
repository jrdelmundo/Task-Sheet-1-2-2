public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1, 1, 1978);
        DateTask date2 = new DateTask(21, 9, 1984);

        System.out.println("Date 1: " + date1); // Should display 01/01/1978
        System.out.println("Date 2: " + date2); // Should display 21/09/1984

        System.out.println("Leap Year (date1): " + date1.isLeapYear()); // Should display false
        System.out.println("Leap Year (date2): " + date2.isLeapYear()); // Should display true
    }
}
