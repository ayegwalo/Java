public class fahrenheitToCelcius {
    public static void main(String[] args){
        int saturdayFahrenheit;
        int sundayFahrenheit;
        saturdayFahrenheit = 85;
        sundayFahrenheit = 92;
        double saturdayCelcius = (5.0/9.0) * (saturdayFahrenheit - 32);
        double sundayCelcius = (5.0/9.0) * (sundayFahrenheit - 32);
        System.out.println("Weekend Averages");
        System.out.println("Saturday: " + saturdayCelcius);
        System.out.println("Sunday: " + sundayCelcius);
    }    
}
