import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();
//         System.out.println("1. addition 2. Subtraction 3. Multiplication 4. division");
//         System.out.print("Enter your choice: ");
//         int choice = sc.nextInt();

//     switch(choice){
//         case 1 :
//             System.out.println("Addition is " + (num1 + num2));
//             break;
//         case 2 :            
//             System.out.println("Subtraction is " + (num1 - num2));
//             break;
//         case 3 :        
//             System.out.println("Multiplication is " + (num1 * num2));
//             break;                      
//         case 4 :            
//             if(num2 != 0){
//                 System.out.println("Division is " + (num1 / num2));
//             }else{
//                 System.out.println("Division by zero is not allowed");
//             }
//             break;
//         default :
//             System.out.println("Invalid choice. Please select a valid operator.");
//             break;
//         }
//     }  
//  }
// Alternate way to bult a calculator
int num1 = sc.nextInt();
    char op = sc.next().charAt(0);
    int num2 = sc.nextInt();

    if(op == '+'){
        System.out.println(num1 + num2);    
        }
        else if(op == '-'){
            System.out.println(num1 - num2);    
        }
        else if(op == '*'){
            System.out.println(num1 * num2);    
        }
        else if(op == '/'){
            if(num2 != 0){
                System.out.println(num1 / num2);    
            }else{
                System.out.println("Division by zero is not allowed");
            }
        }
        else{
            System.out.println("Invalid operator. Please select a valid operator.");
        }
    }
}