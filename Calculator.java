public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public int complexOperation(int a, int b) {
        int result = 0;
        if (a > b) {
            result = add(a, b) * multiply(a, b);
        } else if (a < b) {
            result = subtract(a, b) + divide(a, b);
        } else {
            result = multiply(a, b);
        }
        return result;
    }
}

