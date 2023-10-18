import greenfoot.*; // Impor semua kelas dan paket Greenfoot

public class GameWorld extends World {
    private Character character; // Objek karakter
    private Score score; // Objek skor

    public GameWorld() {
        super(800, 600, 1); // Membuat dunia permainan dengan ukuran 800x600 piksel
        character = new Character(); // Membuat karakter
        addObject(character, getWidth() / 2, getHeight() - 20); // Menempatkan karakter di tengah bawah layar
        score = new Score(); // Membuat objek skor
        addObject(score, 60, 30); // Menempatkan objek skor di sudut layar

        // Tambahkan platform dan rintangan ke dunia
        addObject(new Platform(), 400, 500);
        addObject(new Platform(), 200, 400);
        addObject(new Obstacle(), 600, 300);
    }

    public void act() {
        // Logika permainan berjalan di sini
        if (character.getY() > getHeight()) {
            // Karakter jatuh dari layar, permainan berakhir
            Greenfoot.stop(); // Menghentikan permainan
            showGameOver(); // Menampilkan pesan game over
        }
        
        // Tambahkan logika lain sesuai kebutuhan
    }

    public void increaseScore(int points) {
        score.addPoints(points);
    }

    public void showGameOver() {
        GreenfootImage gameOverText = new GreenfootImage("Game Over", 36, Color.RED, Color.BLACK);
        getBackground().drawImage(gameOverText, getWidth() / 2 - 100, getHeight() / 2 - 20);
    }
}
