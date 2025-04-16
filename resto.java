import java.util.Scanner;

public class resto extends discount{
  //this part before the main the class in destinate to the creation of the class 

  //creation of the function header that group a pa part of the receipt essentially the header
  static void header(){
    System.out.println("\t\t\t\tWelcome to Simply Pizza!");
    System.out.println("\t\t\t\t\t123 Gotham st");
    System.out.println("\t\t\t\t\tNJ, Go 53540");
    System.out.println("\t\t\t\t\t410-568-3680\n");
    
  }

  static void discount(){
    System.out.print("\n\n10% discount for all purchases over $50\n\n");
  }
  

  //creation of the function footer that group essentially all the payment information change and total 
  static void footer(float subTotal,float subT,  float calTax, float total, float payment, float change){
    System.out.println("\nSubtotal\t\t\t\t\t\t\t\t\t\t$"+subTotal);
    System.out.println("The discount order\t\t\t\t\t\t\t\t$"+subT);
    System.out.println("Sale Tax\t\t\t\t\t\t\t\t\t\t$"+calTax);
    System.out.println("Total\t\t\t\t\t\t\t\t\t\t\t$"+total);
    System.out.println("Payment\t\t\t\t\t\t\t\t\t\t\t$"+ payment);
    System.out.println("Change\t\t\t\t\t\t\t\t\t\t\t$"+ change);
    System.out.print("\t\t\tBatman and Gotham thank you!!!\n");
  }
  
  // start of the main function  
  public static void  main(String [] args){
    //creation of the new object
    discount obj = new discount();

    // declaration of the variable 
    float grant_total_owned = 0;
    int customer_served = 0;
    int choice; 
    
    
    //define constant
    final float SMALLPIZZAS = 8.99F;
    final float SMALLPIZZASTOPPINGS = 1.5F;
    final float LARGEPIZZAS = 12.99F;
    final float LARGEPIZZASTOPPINGS = 2.5F;
    final float SOFTDRINK = 1.5F;
    final float TAX = 0.06F;

    Scanner input = new Scanner(System.in);

    // this will ask the question to the user if he/she wants to order and will repeat until the enter 0
    System.out.println("\nDo you want to order (1 for Yes or 0 for No)");
    choice = input.nextInt();
    System.out.println();

    //this is will allow the program to repeat itself
    while(choice == 1){
      //input from customer
      System.out.println("Enter numbers of small pizzas please!");
      System.out.println("\tprice for a small pizza at $8.9900:");
      int smallPizza = input.nextInt();
      System.out.println("Enter numbers of pizzas toppings please");
      System.out.println("\tprice for a topping at $1.500:");
      int smallTopping = input.nextInt();
      System.out.println("Enter numbers of large pizzas please");
      System.out.println("\tprice for a large pizza at $12.9900:");
      int largePizza = input.nextInt();
      System.out.println("Enter numbers of large pizza toppings please!");
      System.out.println("\tprice for a toppping at $2.500:");
      int largeTopping = input.nextInt();
      System.out.println("Enter the number for a soft drink please!");
      System.out.println("\tprice for a soft drink at $1.500");
      int softDrink = input.nextInt();
  
      //Price calculation of food 
      float priceSmallPizza = smallPizza * SMALLPIZZAS;
      float priceSmallTopping = smallTopping * SMALLPIZZASTOPPINGS;
      float priceLargePizza =  largePizza * LARGEPIZZAS;
      float priceLargeTopping = largeTopping * LARGEPIZZASTOPPINGS;
      float priceSoftDrink = softDrink * SOFTDRINK;
  
      //creation of the list that will be use count in the receipt
      float list[] = {SMALLPIZZAS, SMALLPIZZASTOPPINGS, LARGEPIZZAS, LARGEPIZZASTOPPINGS, SOFTDRINK};
      float calc[] = {priceSmallPizza,priceSmallTopping, priceLargePizza, priceLargeTopping, priceSoftDrink};
    
  
      //total calculation 
      float subTotal = priceSmallPizza+priceSmallTopping+priceLargePizza+priceLargeTopping+priceSoftDrink;
      
      // insertion of the the class
      obj.calc(subTotal);
      float subT = obj.calc(subTotal);
      
      // this condition will run the code with a subtotal above 50
      if (subTotal > 50){
  
        
        float calTax = subT * TAX;  // calculation of the tax
        float total = subT + calTax; // calculation of the new total with the discount
  
        //total display and customer payment
        System.out.println("The amount total purchase is: $" + total);
        System.out.println("\n");
        System.out.println("how much will you pay?");
        float payment = input.nextFloat();
      
         // creation of the condition  that also to the user to enter more when the payment  is below the total he/she has to paid. 
        if(payment < total ){
          //using of the the do while loop to ask the user to enter more payment unil it is equal or more. 
          do{
          System.out.println("The amount entered is insufficient please enter more: ");
          // creation of the new payment that is equal to the sum of the payment entered 
          float newpayment = input.nextFloat();
          payment = payment + newpayment;
          }while(payment <= total);
        
        
          float change = payment-total;
         // recall of the function created before 
          header();
          
          // recall of the function discount created before
          discount();
  
          //creationof the single arrays to count the to display different choice made by the user 
          System.out.println(smallPizza + " Small Pizzas each:\t\t\t$"+ list[0] + "\t\t\t$" + calc[0]);
          System.out.println(smallTopping+ " Small Pizzas Toppings each:\t$"+ list[1] + "\t\t\t$" + calc[1]);
          System.out.println(largePizza + " Large pizza each:\t\t\t\t$"+ list[2] + "\t\t\t$" + calc[2]);
          System.out.println(largeTopping + " Large Pizzas Toppings each:\t$"+ list[3] + "\t\t\t$" + calc[3]);  
          System.out.println(softDrink  + " Soft Drinks each:\t\t\t\t$"+ list[4] + "\t\t\t$" + calc[4]);
  
          // recall of the function footer created before 
          footer(subTotal, subT, calTax, total, payment, change);

          // this will ask the question to the user if he/she wants to order and will repeat until the enter 0
          System.out.println("\nDo you want to order (1 for Yes or 0 for No)");
          choice = input.nextInt();
          System.out.println();

          //Those lines make the calculation of the number of customer and the grant totatl of the restaurant 
          grant_total_owned = grant_total_owned + total ;
          customer_served++;
        }
          
        else{
        
          float change = payment-total;
  
          // recall of the function created before 
          header();
          
          // recall of the function discount created before
          discount();
      
          //creationof the single arrays to count the to display different choice made by the user
          System.out.println(smallPizza + " Small Pizzas each:\t\t\t$"+ list[0] + "\t\t\t$" + calc[0]);
          System.out.println(smallTopping+ " Small Pizzas Toppings each:\t$"+ list[1] + "\t\t\t$" + calc[1]);
          System.out.println(largePizza + " Large pizza each:\t\t\t\t$"+ list[2] + "\t\t\t$" + calc[2]);
          System.out.println(largeTopping + " Large Pizzas Toppings each:\t$"+ list[3] + "\t\t\t$" + calc[3]);  
          System.out.println(softDrink  + " Soft Drinks each:\t\t\t\t$"+ list[4] + "\t\t\t$" + calc[4]);
  
          // recall of the function footer created before 
          footer(subTotal, subT, calTax, total, payment, change);

          // this will ask the question to the user if he/she wants to order and will repeat until the enter 0
          System.out.println("\nDo you want to order (1 for Yes or 0 for No)");
          choice = input.nextInt();
          System.out.println();

          //Those lines make the calculation of the number of customer and the grant totatl of the restaurant 
          grant_total_owned = grant_total_owned + total ;
          customer_served++;
        }
      }
  
        
      // this condition will run the code without the condition 
      else {
        
        float calTax = subTotal * TAX;  // calculation of the tax
        float total = subTotal+ calTax; // calculation of the new total with the discount
  
        //total display and customer payment
        System.out.println("The amount total purchase is: $" + total);
        System.out.println("\n");
        System.out.println("how much will you pay?");
        float payment = input.nextFloat();
      
         // creation of the condition  that also to the user to enter more when the payment  is below the total he/she has to paid. 
        if(payment < total ){
          //using of the the do while loop to ask the user to enter more payment unil it is equal or more. 
          do{
          System.out.println("The amount entered is insufficient please enter more: ");
          // creation of the new payment that is equal to the sum of the payment entered 
          float newpayment = input.nextFloat();
          payment = payment + newpayment;
          }while(payment <= total);
        
        
          float change = payment-total;
         // recall of the function created before 
          header();
  
          // recall of the function discount created before
          discount();
  
          //creationof the single arrays to count the to display different choice made by the user 
          System.out.println(smallPizza + " Small Pizzas each:\t\t\t$"+ list[0] + "\t\t\t$" + calc[0]);
          System.out.println(smallTopping+ " Small Pizzas Toppings each:\t$"+ list[1] + "\t\t\t$" + calc[1]);
          System.out.println(largePizza + " Large pizza each:\t\t\t\t$"+ list[2] + "\t\t\t$" + calc[2]);
          System.out.println(largeTopping + " Large Pizzas Toppings each:\t$"+ list[3] + "\t\t\t$" + calc[3]);  
          System.out.println(softDrink  + " Soft Drinks each:\t\t\t\t$"+ list[4] + "\t\t\t$" + calc[4]);
  
          // recall of the function footer created before 
          footer(subTotal, subT, calTax, total, payment, change);

          // this will ask the question to the user if he/she wants to order and will repeat until the enter 0
          System.out.println("\nDo you want to order (1 for Yes or 0 for No)");
          choice = input.nextInt();
          System.out.println();

          //Those lines make the calculation of the number of customer and the grant totatl of the restaurant 
          grant_total_owned = grant_total_owned + total ;
          customer_served++;
        }
  
        
        else{
        // change without any changement 
          float change = payment-total;
  
          // recall of the function created before 
          header();
  
          
          // recall of the function discount created before
          discount();
  
          //creationof the single arrays to count the to display different choice made by the user
          System.out.println(smallPizza + " Small Pizzas each:\t\t\t$"+ list[0] + "\t\t\t$" + calc[0]);
          System.out.println(smallTopping+ " Small Pizzas Toppings each:\t$"+ list[1] + "\t\t\t$" + calc[1]);
          System.out.println(largePizza + " Large pizza each:\t\t\t\t$"+ list[2] + "\t\t\t$" + calc[2]);
          System.out.println(largeTopping + " Large Pizzas Toppings each:\t$"+ list[3] + "\t\t\t$" + calc[3]);  
          System.out.println(softDrink  + " Soft Drinks each:\t\t\t\t$"+ list[4] + "\t\t\t$" + calc[4]);
  
          // recall of the function footer created before 
          footer(subTotal, subT, calTax, total, payment, change);

         // this will ask the question to the user if he/she wants to order and will repeat until the enter 0
          System.out.println("\nDo you want to order (1 for Yes or 0 for No)");
          choice = input.nextInt();
          System.out.println();

          //Those lines make the calculation of the number of customer and the grant totatl of the restaurant 
          grant_total_owned = grant_total_owned + total ;
          customer_served++;
        }
      }
    }

    
    System.out.println("\nthe grant total is:  " + grant_total_owned );
    System.out.println("the number of customer is: " + customer_served);            
   
  }
}
