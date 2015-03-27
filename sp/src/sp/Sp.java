package sp;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Sp extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{ UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");}
        catch(Exception ex){
            ex.printStackTrace();
        }
       NewJFrame sp = new NewJFrame();
       sp.setVisible(true);
    }
    
}
