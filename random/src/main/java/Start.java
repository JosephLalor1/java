


import javax.swing.JFrame;


public class Start {
    public static void main(String[] args) 
        {
            Operations.Connect();
            ButtonFrame buttonFrame = new ButtonFrame();
            buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            buttonFrame.setSize( 400, 350 );
            buttonFrame. setVisible ( true );
            buttonFrame.setLocation( 500, 400 );
        }
}
