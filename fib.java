package GUI.GUI;

import javax.swing.JOptionPane;

public class fib {
 public static void main (String[] args)
 {
	int num1=0;
	int num2 =1;
	int num3=0;
	String x = JOptionPane.showInputDialog("enter a num and we will give all fib numbers under that");
	System.out.println(num1+" "+num2);
	int y = Integer.parseInt(x);
	 for(int i =0;i<20;i++)
	 {
		 num3 = num1+num2;
		 if(num3<y){
		 System.out.println(num3);
		 }
		 num1 = num3;
		 num3 = num1+num2;
		 num2 = num3;
		 if(num3<y){
			 System.out.println(num3);
			 }
	 }
 }
}
