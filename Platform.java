import greenfoot.*; // Impor semua kelas dan paket Greenfoot

public class Platform extends Actor {
    public Platform() {
        GreenfootImage image = new GreenfootImage(100, 20); // Ukuran platform
        image.setColor(Color.GREEN); // Warna platform
        image.fill(); // Mengisi platform dengan warna
        setImage(image);
    }

    public void act() {
        // Logika platform
        if (isTouching(Character.class)) {
            // Karakter menyentuh platform, beri reaksi sesuai
            Character character = (Character) getOneIntersectingObject(Character.class);
            character.jump(); // Misalnya, karakter melompat saat menyentuh platform
        }
        
        // Tambahkan logika lain sesuai kebutuhan
    }
}
