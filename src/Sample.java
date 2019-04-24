public class Sample {
    public static void loopmain(int i) {
        if (i == 5) {
            System.out.println("okay");
        } else {
            System.out.println("nope");
            loopmain(i-1);
        };
    }

    static int fibo(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        int b = 15;
        int n = 9;

        loopmain(b);
        int fib = fibo(n);
        System.out.println(fib);
    }
}
