public class Character extends Actor {
    private int jumpStrength = 10; // Kekuatan lompatan
    private int jumpHeight = 0; // Ketinggian lompatan saat ini
    private boolean isJumping = false; // Menyatakan apakah karakter sedang melompat
    private int fallSpeed = 5; // Kecepatan jatuh

    public void act() {
        if (isJumping) {
            // Karakter sedang melompat
            setLocation(getX(), getY() - jumpStrength);
            jumpHeight += jumpStrength;
            
            if (jumpHeight == 100) {
                // Karakter mencapai ketinggian maksimum, mulai turun
                isJumping = false;
            }
        } else {
            // Karakter jatuh
            setLocation(getX(), getY() + fallSpeed);
            
            // Deteksi tabrakan dengan objek platform
            Actor platform = getOneObjectAtOffset(0, 20, Platform.class);
            if (platform != null) {
                // Karakter bersentuhan dengan platform, lakukan pemantulan
                jump();
            }
        }
        
        // Deteksi tabrakan dengan dasar layar
        if (getY() >= getWorld().getHeight() - 20) {
            // Karakter menyentuh dasar layar, berhenti jatuh
            jumpHeight = 0;
        }
        
        if (Greenfoot.isKeyDown("space") && !isJumping) {
            jump();
        }
    }

    public void jump() {
        isJumping = true;
    }
}
