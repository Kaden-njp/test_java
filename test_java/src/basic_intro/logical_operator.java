package basic_intro;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class logical_operator {
    public static void main(String[] args){
        // logical operator
        // && and
        // || or
        // != not equal to
        // .equal() equal to
        // ! not (reverse the boolean)
		String ceo1 = "Junpeng";
		String ceo2 = "Kaden";
		String verify_name = JOptionPane.showInputDialog("Enter your name to verify if your are one of the ceo of the company");
		if (verify_name.equals(ceo1) || verify_name.equals(ceo2)){
			if (verify_name.equals(ceo1)){
				JOptionPane.showMessageDialog(null,"Welcome to the safe "+ceo1);
			}else if (verify_name.equals(ceo2)) {
				JOptionPane.showMessageDialog(null, "Welcome to the safe " + ceo2);
			}
		}
		else if (verify_name != ceo1 && verify_name != ceo2){
			JOptionPane.showMessageDialog(null,"Violated, bell rings in 3 sec");
		}
		else if(!verify_name.equals(ceo1) || !verify_name.equals(ceo2)){
			JOptionPane.showMessageDialog(null,"Violated, bell rings in 3 sec");
		} // chose one to use not euqal to
    }
}
