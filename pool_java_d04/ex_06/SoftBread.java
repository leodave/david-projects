public class SoftBread extends Bread implements Food{
    private double price = 1.20;
    private int calories = 500;
    private int bakingTime = 30;
 
  
    public  SoftBread(){
        super( 1.20, 500  );
    }
    @Override
    public double getPrice(){
        return this.price;
    }
     public int getCalories(){
        return this.calories;
    }
     public int getBakingTime(){
        return this.bakingTime;
    }
    
}


