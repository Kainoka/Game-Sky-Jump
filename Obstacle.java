import greenfoot.*; // Impor semua kelas dan paket Greenfoot

public class Obstacle extends Actor {
    public Obstacle() {
        GreenfootImage image = new GreenfootImage(30, 30); // Ukuran rintangan
        image.setColor(Color.RED); // Warna rintangan
        image.fill(); // Mengisi rintangan dengan warna
        setImage(image);
    }

    public void act() {
        // Logika rintangan
        if (isTouching(Character.class)) {
            // Karakter menyentuh rintangan, beri reaksi sesuai
            Greenfoot.stop(); // Menghentikan permainan saat karakter menyentuh rintangan
            showGameOver(); // Menampilkan pesan game over
        }
        
        // Tambahkan logika lain sesuai kebutuhan
    }

    public void showGameOver() {
        GreenfootImage gameOverText = new GreenfootImage("Game Over", 36, Color.RED, Color.BLACK);
        getWorld().getBackground().drawImage(gameOverText, getWorld().getWidth() / 2 - 100, getWorld().getHeight() / 2 - 20);
    }
}
