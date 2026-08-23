package lesson_7;

    public class FactorialCalculator {

        public FactorialCalculator() {}

        public long calculate(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Число должно быть неотрицательным");
            }
            if (n == 0 || n == 1) {
                return 1;
            }

            if (n <= 1) {
                return 1;
            }
            return n * calculate(n-1);
        }
}