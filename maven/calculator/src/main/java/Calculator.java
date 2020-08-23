public class Calculator implements BasicCalculator {

    @Override
    public void add(int x, int y) {

        System.out.println(x + y);
    }


    public void sub(int x, int y) {

        System.out.println(x - y);
    }

    @Override
    public void divide(int x, int y) {

        try {
            System.out.println((double) x / y );
        } catch (ArithmeticException e) {
            System.out.println ("Division by zero "+e);
        }
    }

    @Override
    public void multiply(int x, int y) {

        System.out.println(x * y);
    }
}

