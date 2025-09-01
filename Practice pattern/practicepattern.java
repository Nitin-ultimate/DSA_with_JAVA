import java.util.*;
public class practicepattern{
    //print even number till n.
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
        int s = sum + i;
        if(s % 2 == 0){
            System.out.println(s);
        }
        }

    }

    
}

//public class practisepattern{
//   public static void main(String args[]) {
//       for(; ;){
//           System.out.println("Apna colleges");
//       }
//   }
//

/*public class practisepattern{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    do {
        if(a==0){
            break;
        }
        int marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("This is good");
        }else if(marks>=60 && marks<=89){
            System.out.println("THis is also good");
        }else{
            System.out.println("This is also good");
        }
        }
    while(a == 1);
    
    } 
}*/

/*public class practisepattern{
    //Solid rectangle
    //*****
    //*****
    //*****
    //***** 
 public static void main(String args[]) {
    int r = 4;
    int c = 5;
    for(int i=1; i<=r; i++) {
        for(int j=1; j<=c; j++){
            System.out.print("*");
        }System.out.println("*");
    }
 }
}*/

/*public class practisepattern{
 //Hollow rectangle
    //***** 
    //*   *
    //*   *
    //***** 
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
       int r = 4;
       int c = 5;
       for(int i=1; i<=r; i++){
           for(int j=1; j<=c; j++){
            if(i==1 || j==1 || i==r || j==c){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           }System.out.println();
       }
    }
}*/

/*public class practisepattern{
    //**** 
    //*** 
    //** 
    //* 
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = 4;
    for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println("");
        }
    }
    }*/

/*public class practisepattern{
    //   *
    //  **
    // ***
    //**** 
    public static void main(String args[]) {
        int n = 4;
        for(int i=1; i<=n; i++) {
           for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
           }
           for(int j=1; j<=i; j++) {
            System.out.print("*");
           }
        System.out.println();
        }
    }
}*/

/*public class practisepattern{
    //1
    //1 2
    //1 2 3 
    //1 2 3 4 
    //1 2 3 4 5
    public static void main (String args[]) {
        int n= 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);  //for space b/w numbers (j+" ")
            }
            System.out.println();
        }
    }
}*/

/*public class practisepattern{
    //1 2 3 4 5
    //1 2 3 4 
    //1 2 3 
    //1 2 
    //1
    public static void main(String arg[]) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/

/*public class practisepattern{
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14 15
    public static void main(String arg[]) {
        int n = 5;
        int number = 1;
        for(int i=1; i<=n; i++){
             for(int j=1; j<=i; j++) {
                System.out.print(number+" ");
                number++;
             }
             System.out.println();
        }
    }
}*/

/*public class practisepattern {
    //1
    //0 1
    //1 0 1
    //0 1 0 1
    //1 0 1 0 1
    public static void main(String arg[]) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
             int sum = i + j;
             if(sum % 2 == 0){
                System.out.print("1");
             }else{
                System.out.print("0");
             }
            }
            System.out.println();
        }
    }
}*/