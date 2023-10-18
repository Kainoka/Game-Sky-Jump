import greenfoot.*; // Impor semua kelas dan paket Greenfoot

public class Score extends Actor {
    private int score = 0;

    public Score() {
        setImage(new GreenfootImage("Score: 0", 24, Color.WHITE, Color.BLACK));
    }

    public void act() {
        // Perbarui teks skor di layar
        GreenfootImage image = getImage();
        image.clear();
        image.drawString("Score: " + score, 10, 24);

        // Tambahkan logika lain untuk perhitungan skor sesuai kebutuhan permainan
    }

    public void addPoints(int points) {
        score += points;
    }
}
