public class Main {
    public static void main(String[] args) {
        int n = 12;
        int fibRec =0;
        int fibIte = 0;     // Adding the variables for the for loop and functions to run




        for (int i = 2; i <= n; i++) {                   // For loop to to keep running through the inputs till it ends
            long startTimeR = System.nanoTime();         // at 12. Changing the run time to nano seconds.
            fibRec = fibonacciRecursive(i);
            long totalTimeR = System.nanoTime() - startTimeR;    // Getting the time for Recursive
            long startTimeTwo = System.nanoTime();
            fibIte = fibonacciIterative(i);
            long totalTimeI = System.nanoTime() - startTimeTwo;    // getting the time for Iterative
            System.out.println("Recursive: " + totalTimeR +  " Iterative:  " + totalTimeI);
            // printing out the times for each function for the inputs going through.


        }


    }



    private static int fibonacciRecursive(int n){   // creating the method to run the function for recursive
        // base case
        if (n<=1){
            return n;
        }

        // recursive case
        return fibonacciRecursive(n-2) + fibonacciRecursive(n-1);


    }
    private static int fibonacciIterative(int n){    // creating the method to run the function for iterative
        int x = 0;

        int y = 1;
        System.out.println(x);
        System.out.println(y);

        for (int i = 2; i<=n; i++){
            int z = x + y;
            System.out.println(z);
            x = y;
            y = z;

        }
        return x;




    }

}
