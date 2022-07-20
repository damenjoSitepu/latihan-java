public class SumOfDigits {
    public static void main(String args[]) throws Exception {
        SumOfDigits digits = new SumOfDigits();

        int getAnswer = digits.solveProblemWithIterative(678);
        System.out.print(getAnswer);
    }

    // Iterative
    public int solveProblemWithIterative(int n) {
        int answer = 0;

        if (n < 0 || n == 0)
            return 0;

        while (n != 0) {
            answer += (n % 10);
            n /= 10;
        }
        return answer;
    }

    // Recursion
    public int solveProblemWithRecursion(int n) {
        if (n == 0 || n < 0)
            return 0;
        return (n % 10) + solveProblemWithRecursion(n / 10);
    }
}
