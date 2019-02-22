import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class SampleCipher {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
        String check = "MD5";
        Cipher a = Cipher.getInstance(check);
        //int a = 0;
    }

}