class DifferenceOfSquaresCalculator {
    public int factorial (int value){
        if(value <= 1){
            return value;
        }
        return value + factorial(value-1);
    }

    public double sumOfSquares (int value){
        if(value <= 1){
            return value;
        }
        return Math.pow(value, 2) + sumOfSquares(value-1);
    }
    int computeSquareOfSumTo(int input) {
        int resultSum = (int) Math.pow(factorial(input),2);
        return resultSum;
    }

    int computeSumOfSquaresTo(int input) {
        int resultSum = (int) sumOfSquares(input);
        return resultSum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    public static void main(String[] args) {
        DifferenceOfSquaresCalculator calculator = new DifferenceOfSquaresCalculator();
        calculator.computeSquareOfSumTo(5);
        calculator.computeSumOfSquaresTo(5);
    }

}
