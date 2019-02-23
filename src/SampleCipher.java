import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class SampleCipher {

    public String changeString(String check) {
        return check;
    }

    public int f = 2;
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
        String check = "SHA256";
        SampleCipher obj = new SampleCipher();
        Cipher a = Cipher.getInstance(obj.changeString(check));
        //int a = 0;
        int g = obj.f;

    }

}
