import javax.swing.*;
import java.awt.*;

/**
 * Pomocnicza klasa odpowiadająca za działanie panelu, który wyświetala informacje o aktualnie modyfikowanej figurze.
 */

public class InformationPanel extends JPanel {
    Frame f;
    Label myshape, xposition, yposition, height, width;
    Label myshape2, xposition2, yposition2, height2, width2;
    Double my_x, my_y, my_h, my_w;
    String shapename;

    /**
     * Konstruktor klasy
     * @param f - Okno głowne
     */
    InformationPanel(Frame f){
        this.f = f;
        setLayout(new GridLayout(1,10));
        myshape = new Label("Shape: ");
        add(myshape);
        myshape2 = new Label();
        add(myshape2);
        xposition = new Label("x: ");
        add(xposition);
        xposition2 = new Label();
        add(xposition2);
        yposition = new Label("y: ");
        add(yposition);
        yposition2 = new Label();
        add(yposition2);
        height = new Label("height: ");
        add(height);
        height2 = new Label();
        add(height2);
        width = new Label("width: ");
        add(width);
        width2 = new Label();
        add(width2);

    }

    /**
     * Zapisywanie położenia figury podczas ruchu
     * @param x współrzędna x wierzchołka głównego
     */
    public void setx(double x){
        my_x = x;
        xposition2.setText(my_x.toString());
    }

    /**
     * Zapisywanie położenia figury podczas ruchu
     * @param y wspolrzedna y wierzchołka głównego
     */
    public void sety(double y){
        my_y = y;
        yposition2.setText(my_y.toString());
    }

    /**
     * Zapisywanie położenia figury podczas ruchu
     * @param h wysokość figury
     */
    public void seth(double h){
        my_h = h;
        height2.setText(my_h.toString());
    }

    /**
     * Zapisywanie położenia figury podczas ruchu
     * @param w szerokość figury
     */
    public void setw(double w){
        my_w = w;
        width2.setText(my_w.toString());
    }

    /**
     * ZApiswanie nazwy aktualnie poruszanej figury
     * @param s nazwa figury
     */
    public void setshape(String s){
        shapename = s;
        myshape2.setText(shapename);
    }

}
