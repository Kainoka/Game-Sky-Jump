import greenfoot.*;

public class Character extends Actor {
    private GreenfootImage characterImage; // Atribut untuk gambar karakter

    public Character() {
        characterImage = new GreenfootImage("character.png"); // Menggunakan file karakter.png sebagai gambar karakter
        setImage(characterImage); // Menetapkan gambar karakter ke objek karakter
    }

    // ...
}
