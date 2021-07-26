package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * @author (nardine fakhreddine)
 * @version (24/07/2021)
 * 
 * 
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
    // pour tous les param�tres de la ligne de commande
    int fahrenheit = 0;
    float celsius = 0;
    for(int i = 0; i<args.length; i++)
    {
    fahrenheit = java.lang.Integer.parseInt(args[i]);
    celsius = fahrenheitEnCelsius(fahrenheit);
    System.out.println(fahrenheit + "\u00B0F -> " +((int)(celsius*10)/10.0) +"\u00B0C"); // ligne,
        } 
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {

       float e = (float)5/9*(f-32);
        return e;
        
    }

}
