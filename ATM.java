import java.util.Scanner;

public class ATM {
    static int ian;                   //static globle variables to use in every methods
    static int iap;
    static int amount=0;
                                 //showinputs method for show options and check that which option is choosed by user
    public static void showInputs(){                               
        System.out.println( "1.   Account details ");
        System.out.println( "2.   Amount deposite ");
        System.out.println( "3.   Widharol amount ");
        System.out.println( "4.   Exit ");
        Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();    
         if(a==1){
             accountDetails();
         }
        else if(a==2){
             amountDeposite();
         }
         else if(a==3){
             whidrolAmount();
         }
         else if(a==4){
             return;
         }
         else{
             System.out.println("Please choose creact ");
         }
        
    }
      private static void whidrolAmount() {
        Scanner sc=new Scanner(System.in);                                                       //try catch here
        System.out.println("Current Amount : "+amount);
        System.out.print("Whidrol Amount : ");
           int b=sc.nextInt();
           if(b<amount && b>0){
           amount-=b;
           System.out.println("you whidrol "+b+" rupees only ");
        System.out.println("Amount : "+amount);
        backOrExit();
           }
           else{
               System.out.println("amount is not available");
        backOrExit();

           }
        
    }

                      // how much amount is deposite in account and the amount variable is globle that's why it not come on zero
    private static void amountDeposite() {                    
        Scanner sc=new Scanner(System.in);
        System.out.println("Current Amount : "+amount);
        System.out.print("Deposite Amount : ");
           int b=sc.nextInt();
           amount+=b;
        System.out.println("you deposite "+b+" rupees only ");
        System.out.println("Amount : "+amount);
        backOrExit();
         
    } 

     // check acount details 
    private static void accountDetails() {                    
        System.out.println("Account Number : "+ian);
        System.out.println("Name : Manish Dadhich");
        System.out.println("DOB : 16/12/2002");
         
         System.out.println("Current Amount : "+amount);
      backOrExit();
       

    }

                        // back or exit method for reduce time and code
    private static void backOrExit() {
        System.out.println("1. Back");
        System.out.println("2. exit");
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       if(a==1){
           showInputs();
       }
       else if(a==2){
           System.out.println("you logged out ");
           return;
       }
       else{
           System.out.println("please choose correct");
       }
        
    }
    public static void main(String[] args) {
        checkAccountNumber();
        
            
      }              

                    // check account  number method is use for check a.n and password and sent a showinputsmethods
    private static void checkAccountNumber() {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Account Number : ");           //n.-987
           ian=sc.nextInt();
          System.out.print("password : ");               //p.-12345
           iap=sc.nextInt();
          if(ian==987 && iap==12345){
              showInputs();
          }
          else{
              System.out.println("Account Number or Password is wrong ");
          }
    }
}