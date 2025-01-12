public class Program {
    public static void main(String[] args) {
        // revenue array values
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};

        // Declare a variable 'sum' to store the total revenue
        double sum = 0;
        
        // Declare a variable 'avg' to store the calculated average revenue
        double avg = 0;

        // Loop through each value in the 'revenue' array to calculate the total (sum)
        for (double x: revenue) {
            sum += x;  // Then add each revenue value to the sum
        } 

        // Calculate the average revenue by dividing the sum by the length of the array
        avg = sum / revenue.length;

        // Output the calculated average revenue to the console
        System.out.println(avg);
    }
}
