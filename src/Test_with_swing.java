
import javax.swing.*;
import java.util.Scanner;

public class Test_with_swing {
    public static void main(String[] args) {
        int n = 0;
        String menu []={"choose please the number operation","1.RectangularArea","2.SquareArea","3.SquarePerimeter","4.RectangularPerimeter"};
        String msg="";

        do {
            int x=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (x){
                case 1:
                    double l= getLength("enter length");
                    double w= getWidth("enter width");
                    double RectangularArea= getRectangularArea(w,l);
                    JOptionPane.showMessageDialog(null,RectangularArea);
                    break;
                case 2:
                    l= getLength("enter length");
                    double SquareArea=getSquareArea(l);
                    JOptionPane.showMessageDialog(null,SquareArea);
                    break;
                case 3:
                    l= getLength("enter length");
                    double SquarePerimeter= getSquarePerimeter(l);
                    JOptionPane.showMessageDialog(null,SquarePerimeter);
                    break;
                case 4:
                    l= getLength("enter length");
                    w= getWidth("enter width");
                    double RectangularPerimeter= getRectangularPerimeter(w,l);
                    JOptionPane.showMessageDialog(null,RectangularPerimeter);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"error");


            }
            n=JOptionPane.showConfirmDialog(null,"Again");


        } while (n == 0);
        JOptionPane.showMessageDialog(null, "bye");


    }

    public static double getLength(String msg) {

        double l = Double.parseDouble(JOptionPane.showInputDialog("enter length"));
        return l;
    }

    public static double getWidth(String msg) {
        double  w = Double.parseDouble(JOptionPane.showInputDialog("enter width"));
        return w;
    }

    public static double getRectangularArea(double l, double w) {
        double rectangularArea = l * w;
        return rectangularArea;
    }

    public static double getRectangularPerimeter(double l, double w) {
        double rectangularPerimeter = 2 * (l + w);
        return rectangularPerimeter;
    }

    public static double getSquareArea(double l) {
        double squareArea = l * l;
        return squareArea;
    }

    public static double getSquarePerimeter(double l) {
        double squareArea = 4 * l;
        return squareArea;
    }
}

