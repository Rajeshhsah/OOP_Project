import javax.swing.*;

public class Dialogbox {
    public static void main(String[] args) {
        int num1,num2,ans;
        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Fisrt Number"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the 2nd Number"));
        ans=num1+num2;
        JOptionPane.showMessageDialog(null,"Total Sum is "+ans);

    }
}
class Simpleint{
    public static void main(String[] args) {
        Double p,r,t,si;
        p=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Principal"));
        r=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Rate"));
        t=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Time"));
        si=p*t*r/100;
        JOptionPane.showMessageDialog(null,"The Simple interest is "+(si));
    }
}