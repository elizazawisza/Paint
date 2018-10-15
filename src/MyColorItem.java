import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Klasa pomocnicza odpowiadajaca za wybor koloru figury
 */
public class MyColorItem implements ActionListener {
    Frame f;
    JPanel DrawPanel;
    Color mycolor;

    /**
     * Konstruktor klasy
     * @param f - okno główne
     * @param DrawPanel - panel, służący do rysowania figur
     * @param mycolor - kolor wybrany przez użytkownika
     */
    public MyColorItem(Frame f, JPanel DrawPanel, Color mycolor){
        this.f = f;
        this.DrawPanel = DrawPanel;
        this.mycolor = mycolor;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand() == "Color"){
            Color one = Color.BLACK;
            mycolor = JColorChooser.showDialog(f,"Select a color", one);
        }
    }
}
