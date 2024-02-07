public class Fibonacci {
   

        public static void fibonacci(int n) {
            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int temp = a;
                a = b;
                b = temp + a;
            }
        }
    
        public static void main(String[] args) {
            int n = 10;
            System.out.print("First " + n + "  Fibonacci series: ");
            fibonacci(n);
        }
    }
     

