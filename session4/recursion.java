//package session4;

public class recursion {
    // function calling itself is recursion
    static int factorial_recursion(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial_recursion(n-1);
        }
    }

    static int factorial_with_loops(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            int product = 1;
            for(int i = 1; i <= n ; i++){
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial_recursion(5));
        System.out.println(factorial_with_loops(5));
    }
}


// factorial(1)  = 1
// factorial(0) = 1
// factorial(5) = 5 * 4 * 3 * 2 * 1
// factorial(n) = n * n-1  * ...... 1 