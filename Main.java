public class starpattern {
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
      
    }
}

public class swapnumber{
    public static void main(String args[]){
        int a=10, b=20;
        a= a+b;
        b= a-b;
        a= a-b;
        b= a-b;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}

public class evenodd{
    public static void main(String args[]){
        int number = 51;
        if(number%2==0){
            System.out.println(" even");
        }
        else{
            System.out.println("odd");
        }
    }
}

public class factorial{
    public static void main(String args[]){
        int number = 12;  
        int factorial=1;
        for(int i=1; i<=number; i++){
            factorial = factorial*i;
            System.out.println(factorial);
        }
    }
}

public class greaternumber{
    public static void main(String args[]){
        int a = 105, b= 20, c=30;
        if(a>b && a>c){
            System.out.println(" a is greater number");
        }
        else if(b>a && b>c){
            System.out.println(" b is greater number");
        }
        else{
            System.out.println(" c is greater number");
        }
    }
}


public class main{
    public static void main(String args[]){
        int [] arr = {12,5,7,9,345,45};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max= arr[i];
            }
        }
        System.out.println(" maximume element is: "+max);
    }
}

public class main{
    public static void main(String args[]){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
}

public class multiplication{
    public static void main(String args[]){
        int b= 9;
        for(int i=1; i<=10; i++ ){
            System.out.println(b*i);   
            }
    }
}
