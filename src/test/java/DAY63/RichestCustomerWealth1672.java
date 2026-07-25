package DAY63;

public class RichestCustomerWealth1672 {
    /*
     * A customer has multiple bank accounts.
     * Each row represents one customer.
     * Each column represents money in one bank account.
     * Return the maximum wealth among all customers.
     */
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 },
                { 4, 2, 1 }
        };
        int maxWealth = 0;
        /*
         * Each row represents a different customer. I reset sum to 0 for every customer
         * so I can calculate that customer's total wealth independently.
         */
        for (int[] account : accounts) {
            int sum = 0; // sum will 0 at start
            for (int money : account) {
                sum += money; // Additon of all money in account
            }
            maxWealth = Math.max(maxWealth, sum); // Save highest wealth
        }

        System.out.println(maxWealth);
    }

}
