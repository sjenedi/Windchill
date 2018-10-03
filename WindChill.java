/**
 * @author Sami Jenedi
 * This program will compute a temperature including the wind chill factor.
 */
import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
      final int LOWER_BOUND_TEMPERATURE = -1;
      final  int UPPER_BOUND_TEMPERATURE = 50; 
      
      final int LOWER_BOUND_WINDSPEED = 3;
      final int UPPER_BOUND_WINDSPEED = 30;
      
      int windSpeed = (int) (Math.random() * (UPPER_BOUND_WINDSPEED  - LOWER_BOUND_WINDSPEED) + LOWER_BOUND_WINDSPEED  + 1 );
      int temperature  = (int) (Math.random() * (UPPER_BOUND_TEMPERATURE - LOWER_BOUND_TEMPERATURE) + LOWER_BOUND_TEMPERATURE  + 1);
      
      computeWindChill(temperature,windSpeed);    
  }
    /** 
     * Calculate and display the wind chill
     * 
     * This method takes temperature and wind speed from the main method as random numbers. 
     * @param temperature less than and equal to 50, and greater than and equal 0.
     * @param wind speed less than and equal to 30, and greater than and equal 4
     */
    public static double computeWindChill (int temperature, int windSpeed) {
  	 
    	//Calculate the wind chill temperature
        double windChill = 35.74 + ( 0.6215 * temperature ) - ( 35.75 * Math.pow( windSpeed , 0.16 ) ) + ( 0.4275 * temperature * Math.pow(windSpeed , 0.16) );
        
    	System.out.println( "Temperature: " + temperature + " degrees Fahrenheit" );
    	System.out.println( "Wind speed: " + windSpeed + " MPH" );
    	System.out.println( "Temperature (including wind chill): " + windChill + " degrees Fahrenheit" );

  	   return windChill; 
  	} 
}