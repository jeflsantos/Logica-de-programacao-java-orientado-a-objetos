package aluraplataforma.LjavaModernoJava8.AdefaultMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//FAZENDO DA MANEIRA ANTIGA:

public class OrdenaStringsAntigo {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("Editora Casa do codigo");
        palavras.add("Caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();
        Collections.sort(palavras, comparador);
        System.out.println(palavras);

        for (String p:palavras) {
            System.out.println(p);
        }
    }
}

class ComparadorPorTamanho implements Comparator<String> {


    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}
