import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList maListe1 = new ArrayList();
        List maListe2 = new ArrayList();
        var maListe3 = new ArrayList();
        Object maListe4 = new ArrayList();

        List maListe5 = (List) maListe4; // je viens de cast
        maListe5.add("un mot ");

        // Ctrl + B permet de aller au code source ...
    }
}