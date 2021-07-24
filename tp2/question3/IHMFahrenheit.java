package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae )
  {
    try{
      int fahrenheit =java.lang.Integer.parseInt(entree.getText()); // valeur est une String et doit être convertie en entier, voir java.lang.Integer méthode parseInt (--> try/catch)
      float celsius = fahrenheitEnCelsius(fahrenheit);; // à compléter, en appelant la méthode ad'hoc de la question2 
        getContentPane().setBackground( Color.pink );
      sortie.setText( Float.toString( celsius));
    }catch(NumberFormatException nfe)
    {
        getContentPane().setBackground( Color.red );
          sortie.setText("error ! ");
    }
  }
  
  public static float fahrenheitEnCelsius( int f)
     {
       float e = (float)5/9*(f-32);
       return e;    // à compléter    en remplaçant la valeur retournée par la fonction de conversion
       // ...
     }
     
  public static void main(String[] args)
  {
    
      new IHMFahrenheit();
    }
}
