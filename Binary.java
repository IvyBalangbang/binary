/******************************************************************
 * Program 1: Conversion from binary to decimal representation
 * Programmer: Ivy Balangbang, Era Manata, Catherine Granado, Britnie Balingit, Lyka Ocampo
 * 
 * Class: IT 121        Instructor: John Mark Gabrentina
 *        
 * Pledge: I have neither given nor received unauthorized aid
 * on this program.     (signature on file)
 *
 * Description: This program converts a binary number to decimal.
 *
 * Input: Binary number
 *
 * Output: Decimal number
 *
 ******************************************************************/

 import javax.swing.JOptionPane;
public class Binary {

    public static void main(String[] args) {
        // Request 6-bit binary number
        String binaryString=JOptionPane.showInputDialog("Enter a 6-bit binary number");

        // Convert from String to integer type
        int binary=Integer.parseInt(binaryString);

        // Declaration of output value
        int decimal=0;

        // Declaration of variable to hold the current bit
        int bit;

        System.out.println(Integer.parseInt("0101" ,2));

        System.out.println(Integer.parseInt("01011" ,2));

        System.out.println(Integer.parseInt("11111" ,2));


        

        int i=0;
        int power2=0;
        int len=binaryString.length();
        while (i<len) {
            bit=binary%10;//get the last bit (6th)
            decimal=decimal+bit*power2;//add it, multiplied by the corresponding power of 2
            binary=binary/10;//get rid of the 6th bit, now the 5th bit id the last
            power2*=2;
            i++;

            // Format output String
            String binaryOutput="Binary: " + binaryString;
            String decimalOutput="Decimal: " + decimal;

            // Output message
            JOptionPane.showMessageDialog(null, binaryOutput + "\n" + decimalOutput,
            "Binary to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);

            // Exit
            System.exit(0);
        }
        
    }
}