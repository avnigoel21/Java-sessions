import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyJFrame {
    public static void main(String[] args){

        JFrame frame = new JFrame("My JFrame");

        frame.setSize(400, 300);

        JLabel label = new JLabel("hello Jframe!" , SwingConstants.CENTER);

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
}



// public shiftCipher(String phrase, int shift){
//     encoded = encodePhrase(phrase,  shift);
// }

// public String shift(int amount){
//     return encodePhrase(encoded, amount);
// }

// public String toString(){
//     return encoded;
// }



