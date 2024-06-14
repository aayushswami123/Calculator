    import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first Number ");
        int a = sc.nextInt();
        System.out.println("Input the second Number ");
        int b = sc.nextInt();
        System.out.println("Input the Operation ( +,-,*,%,/)");
        char operation = sc.next().charAt(0);
        int sum = a+b;
        int diffrence = a-b;
        int product = a*b;
        int modolus =a%b;
        int divibed=a/b;
        
        switch (operation) {
            case '+':System.out.println("The sum of Number "+ a +" and " +b +" is " + sum );
                break;
            case '-':System.out.println("The differnce of Number "+ a +" and " +b +" is " + diffrence);
                break;
            case '*':System.out.println("The product of "+a+" and "+b+ " is "+product);
                break;
            case '%':System.out.println("The modolus of "+ a+ " and "+b +" is "+modolus );
                break;
            case '/':System.out.println("When "+ a+ "is divibed by "+ b +" is "+ divibed);
                break;
        
            default:System.out.println("Not a Valid Input");
                break;
        }
       
     
      
    } 
}