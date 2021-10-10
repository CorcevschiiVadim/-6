import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.text.*;
import java.lang.Math;
import java.text.DecimalFormat;
public class Number16 {
    public static double height;
    public static double base;
    public static double hypotenuse;

    public static void main(String[] args){
        double base;
        double height;
        height = Double.parseDouble(JOptionPane.showInputDialog("Введите 1 размер треугольника: "));
        base = Double.parseDouble(JOptionPane.showInputDialog("Введите 2 размер треугольника: "));

        hypotenuse = Hypo(height, base);
    }

    public static double Hypo(double heightInp, double baseInp)
    {
        double hypo;
        DecimalFormat round = new DecimalFormat("0.00");
        hypo = Math.sqrt((Math.pow(baseInp, 2)) + (Math.pow(heightInp, 2)));
        JOptionPane.showMessageDialog(null, "Hypotenuse is: " + round.format(hypo));
        return Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
    }
}
