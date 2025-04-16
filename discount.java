// creation of the class to calculate the discount 
public class discount{

  

  // creation of a variable which is the purcentage of the discount
  float number= 0.1F;

  // creation of the function that will make the calculation 
  float calc( float sum){
    if (sum > 50){          //creation of the condition to apply the discount
      sum = sum - (sum*number);        // calcualtion of the discount
    }
    else{          // alternate condition
      sum = 0;      // discount without application 
    }

    return sum;      //return either the value with or without discount 
  }
}