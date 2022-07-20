class FindBiggestNumber {
    public static void main(String args[]) throws Exception {
        FindBiggestNumber fbn = new FindBiggestNumber();

        int[] numbers = { 13, 4, 1, 15, 15, 15, 17 };

        System.out.println(fbn.solutionUseRecursion(numbers, numbers.length));
    }

    // Recursion
    public int solutionUseRecursion(int numbers[], int size) {
        if (size == 1) // o(1)
            return 0; // o(1)

        return Math.max(numbers[size - 1], solutionUseRecursion(numbers, size - 1)); // m
    }

    // Iterative
    public int solutionUseIterative(int number[]) {
        // Take The First Element Of Array
        int theBiggestNumber = number[0]; // o(1)

        // Looping through the array to find the biggest number and return itself
        for (int i = 1; i < number.length; i++) { // o(n)
            if (theBiggestNumber <= number[i] && theBiggestNumber != number[i]) // o(1)
                theBiggestNumber = number[i]; // o(1)
        }

        return theBiggestNumber; // o(1)
    }
}