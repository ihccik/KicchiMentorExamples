package interview_tasks.number_tasks;

public class S68_Number_CombinationOfUSCoins {

    /*
        return the number of different combinations of US coins
        (penny: 1c, nickel: 5c, dime: 10c, quarter: 25c, half-dollar: 50c)
        which may be used to produce a given amount of money.
        Assume that the 'cents' parameter is always positive.

        EXAMPLE:
        input: 11
        output: 4
        explanation:
            11 cents can be produced with:
            one 10-cent coin and one 1-cent coin,
            two 5-cent coins and one 1-cent coin,
            one 5-cent coin and six 1-cent coins,
            or eleven 1 cent coins.
            So there are four unique ways to produce 11 cents, therefore output should be 4
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(11));
    }

    public static int defaultSolution(int cents) {
        int count = 0;
        int[] coins = {1, 5, 10, 25, 50};
        int[][] s = new int[coins.length + 1][cents + 1];

        // if amount=0 then just return empty set to make the change
        for (int i = 0; i <= coins.length; i++) {
            s[i][0] = 1;
        }

        // now fill rest of the matrix.
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= cents; j++) {
                    // check if the coin value is less than the amount needed
                if (coins[i - 1] <= j) {
                    // reduce the amount by coin value and
                    // use the subproblem solution (amount-v[i]) and
                    // add the solution from the top to it
                    s[i][j] = s[i - 1][j] + s[i][j - coins[i - 1]];
                } else {
                    // just copy the value from the top
                    s[i][j] = s[i - 1][j];
                }
            }
        }
        return s[coins.length][cents];
    }
}
