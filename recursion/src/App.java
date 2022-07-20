
public class App {
    public static void main(String[] args) throws Exception {
        App recursion = new App();

        int solveProblem = recursion.solveRecursionWithIteration(5);
        System.out.println(solveProblem);
    }

    public int solveRecursionWithIteration(int n) {
        int nums = 0;
        int realNums = n;

        if (n < 1)
            return 0;

        for (int i = n; i > 1; i--) {
            if (nums == 0)
                nums = realNums;

            nums *= (realNums - 1);
            realNums--;
        }
        return nums;
    }

    public int solveRecursion(int n) {
        // Integer number must be positive
        if (n < 1)
            return 0;
        // If integer number reach zero value, stop this recursion
        if (n == 1)
            return 1;

        return n * solveRecursion(n - 1);
    }
}
