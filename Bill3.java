public class Bill3 {
    public static void main(String[] args) {
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];

        double total = Double.parseDouble(args[3]);
        double bill = total / 3.0;

        bill = Math.ceil(bill * 10.0) / 10.0;

        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 +
                           ": pay " + String.format("%.1f", bill) + " Shekels each");
    }
}
