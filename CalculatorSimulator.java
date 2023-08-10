package taxcalculator;

//CalculatorSimulator class
public class CalculatorSimulator {
 public static void main(String[] args) {
     try {
         // Test the TaxCalculator class
         double taxAmount = TaxCalculator.calculateTax("John Doe", true, 75000);
         System.out.println("Tax amount is " + taxAmount);
     } catch (CountryNotValidException e) {
         System.out.println("Country not valid: " + e.getMessage());
         e.printStackTrace();
     } catch (EmployeeNameInvalidException e) {
         System.out.println("Employee name not valid: " + e.getMessage());
         e.printStackTrace();
     } catch (TaxNotEligibleException e) {
         System.out.println("Not eligible for Tax calculation: " + e.getMessage());
         e.printStackTrace();
     }
 }
}






