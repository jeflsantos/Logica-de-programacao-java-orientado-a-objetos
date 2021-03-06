package aluraplataforma.LjavaModernoJava8.AdefaultMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//APLICANDO O JAVA 8:

public class OrdenaStringNovo {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("Editora Casa do codigo");
        palavras.add("Caelum");

        Comparator<String> comparador = new ComparadorPorTamanho1();
        palavras.sort(comparador);
        System.out.println(palavras);

        //Classe Anonimas: Usamos quando a implementa interfaces curtas e quando nao vamos reaproveitar o código.

        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


    }
}

class ComparadorPorTamanho1 implements Comparator<String> {


    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}