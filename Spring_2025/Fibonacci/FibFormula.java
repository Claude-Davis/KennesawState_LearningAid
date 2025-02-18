

class FibFormula implements FindFib {
    int calculateFib(int n) {
        double GoldenRatio = (1 + Math.sqrt(5)) / 2;
        double GoldenRatioConjugate = (1 - Math.sqrt(5)) / 2;

        double binet =  ((Math.pow(GoldenRatio, n)) - (Math.pow(GoldenRatioConjugate, n))) / Math.sqrt(5);
    }
}
