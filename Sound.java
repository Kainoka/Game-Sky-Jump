import greenfoot.*; // Impor semua kelas dan paket Greenfoot

public class Sound {
    private GreenfootSound jumpSound;
    private GreenfootSound gameOverSound;

    public Sound() {
        jumpSound = new GreenfootSound("jump.wav"); // Menggunakan file jump.wav sebagai suara lompat
        gameOverSound = new GreenfootSound("game_over.wav"); // Menggunakan file game_over.wav sebagai suara game over
    }

    public void playJumpSound() {
        jumpSound.play();
    }

    public void playGameOverSound() {
        gameOverSound.play();
    }
}
