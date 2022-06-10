public class Main {
    public static void main(String[] args) {
        double[] numbers = {
                1.0, -2.0, 1.3, 0.8, -8.1, 1.5, 1.6, 8.2, -0.4, 1.9, 3.1, 3.4, -3.5, 10.0, 0.1};
        double java = 0;
        int java2 = 0;
        boolean javaBol = false;
        for (double java3 : numbers) {
            if (java3 < 0) {
                javaBol = true;
            } else if (javaBol) {
                java2++;
                java += java3;

            }
        }
        System.out.println(java / java2);
    }
}

