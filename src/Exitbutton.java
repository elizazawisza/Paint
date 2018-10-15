import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Klasa odpowiadająca za zamykanie okna dialogowego poprzez przycisk Close.
 */
public class Exitbutton implements ActionListener {
    Dialog myDialog;

    /**
     * konstruktor klasy
     * @param myDialog - okienko dialogowe
     */
    public Exitbutton(Dialog myDialog){
        this.myDialog = myDialog;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Close"))
            myDialog.setVisible(false);
    }
}
