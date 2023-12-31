public class Recursion {
    public static void main(String [] args){
        int n = 7;
        System.out.println("Factorial for "+n+": "+nFactorial(n));
        System.out.println("The "+(n+1)+"th Fibonacci number is: "+fibonacci(n));
        int [] a = {7,12,5,1,9};
        int x = a.length;
        System.out.print("The array is: ");
        arrayPrint(a,x);
        System.out.println();
        System.out.println("The sum of all integers in the array is: "+arraySum(a,a.length-1));
        int m = 11;
        System.out.println("The "+n+"th exponent of "+m+" is: "+exponent(m,n));
        System.out.println("The binary of "+m+" is: "+dec2bin(m));
        LinkedList list = new LinkedList(a);
        System.out.println("The sum of all elements of a list: "+list.addList(list.head));
        System.out.print("All the elements of a list printed in reverse order: ");
        list.printListReverse(list.head);
        String[] name = {"Iyer", "Venugopal", "Mutthuswami", "Chinnaswami", "Perumbator", "Yekyaparampeel", "Tiruchipalli", "Srinivasana", "Rajashekhara", "Shivavenkata", "Shivaramakrishna", "Laxmana", "Jayasuriya", "Atapattu", "Sripalawardana", "Prabhakarana"};
        iyer(name, name.length);
        System.out.println();
    }

    //Implementing n-factorial method using recursion
    private static int nFactorial(int n){
        if(n==0 || n==1) return n;
        else return n*nFactorial(n-1);
    }

    //Implementing Fibonacci series using recursion
    private static int fibonacci(int n){
        if(n==0 || n==1) return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }

    //Printing an array of integers using recursion
    private static void arrayPrint(int[] array, int n){
        if(n>0){
            arrayPrint(array, n-1);
            if(n-1==array.length-1) System.out.print(array[n-1]+".");
            else System.out.print(array[n-1]+", ");
        }
    }

    //Summation of all integers in an array using recursion
    private static int arraySum(int[] array, int n){
        if(n==0) return array[n];
        else return array[n] + arraySum(array,n-1);
    }

    //Finding exponents using recursion
    private static int exponent(int m, int n){
        if(n==0) return 1;
        else return m*exponent(m,n-1);
    }

    /*
    Implementing a method where a decimal number is converted
    to binary with the help of recursion
    */
    private static String dec2bin(int n){
        int rem;
        if(n==1) return "1";
        else{
            rem = n%2;
            return dec2bin(n/2)+rem;
        }
    }

    /*
    The following method will print the name of a person named IYER
    Ref: Dhamaal(2007 film)
    */
    private static void iyer(String[] name, int n){
        if(n<0) return;
        else{
            iyer(name, n-1);
            for(int i = n-1; i>=0; i--){
                System.out.print(name[i]+" ");
            }
            System.out.println();
        }
    }
}
