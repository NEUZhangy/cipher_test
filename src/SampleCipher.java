import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class SampleCipher {

    private String changeString(String check) {
        check = "AES";
        return check;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
        String check = "MD5";
        Cipher a = Cipher.getInstance(new SampleCipher().changeString(check));
        //int a = 0;
    }

}