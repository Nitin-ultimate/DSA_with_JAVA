import java.util.Scanner;
public  class profitloss {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
//         System.out.print("ENTER COST PRICE: ");
//         int cp = sc.nextInt();
//         System.out.print("ENTER SELLING PRICE: ");
//         int sp = sc.nextInt();
//         if (cp > sp)
//             System.out.println("LOSS: " + (cp - sp));
//         else if (sp > cp)
//             System.out.println("PROFIT: " + (sp - cp));
//         else
//             System.out.println("NO PROFIT NO LOSS");
//     }
// }
System.out.print("ENTER LENGTH: ");
int l = sc.nextInt();
System.out.print("ENTER BREADTH: ");
int b = sc.nextInt();  
int parameter = 2*(l+b);
int area = l*b;
if (area > parameter)
System.out.println("Area is greater than parameter");
else 
System.out.println("Parameter is greater than area");
}
}