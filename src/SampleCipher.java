import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class SampleCipher {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
        String algo = "AES/CBC/PKCS5Padding";
        Cipher a = Cipher.getInstance(algo);
        //int a = 0;
    }

}