package youtube.devdojo.maratonajava.javacore.Dconstrutores.teste;


import youtube.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "TV", 12);
        anime.init("Naruto", "TV", 12, "Ação");


        anime.imprime();
    }
}
