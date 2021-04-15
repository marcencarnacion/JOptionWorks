import javax.swing.JOptionPane;
//Ask the user for two numbers in dialogue boxes

//Output the result in another dialogue
class Main 
{
  public static void main(String[] args) 
  {
    String num1 = JOptionPane.showInputDialog("Enter first intger");

    String num2 = JOptionPane.showInputDialog("Enter second integer");

    int sum;

    //Need to convert strings into numbers
    int parsedNum1 = Integer.parseInt(num1);//these are static calls to the wrapper class
    int parsedNum2 = Integer.parseInt(num2);

    sum = parsedNum1 + parsedNum2;
    JOptionPane.showMessageDialog(null, "The sum is " + sum);
  }
}