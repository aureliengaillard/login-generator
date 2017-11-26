package geco;

import java.util.Random;

public class PasswordGeneration {
    public String getRandomPassword() {
        String caracteres = "1234567890_-azertyuiopqsdfghjklmwxcvbnAZERTYUIOPQSDFGHJKLMWXCVBN?./+=:;,$*ù%€£";
        Random rand = new Random();
        String pass = "";
        for (int i = 0; i < 8; i++) {
            pass += caracteres.charAt(rand.nextInt(caracteres.length()));
        }
        return pass;
    }
}
