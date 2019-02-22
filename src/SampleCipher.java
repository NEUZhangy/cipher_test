import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class SampleCipher {

    private int changeString() {
        return 123;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
        int check = new SampleCipher().changeString();
        Cipher a = Cipher.getInstance(Integer.toString(check));
        //int a = 0;
    }

}