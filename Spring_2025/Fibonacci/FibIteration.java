class FibIteration implements FindFib {
    int calculateFib(int n){
        int a = 0;
        int b = 1;

        if (n < 1){
            return n;
        }

        for (int i=0; i<=n; i++){
            int fib = a+b;
            a = b;
            b = fib;
            return fib;
        }
    }
}