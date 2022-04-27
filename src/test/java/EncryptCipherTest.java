import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptCipherTest {
    @Test
    public void encryptedCharacter_returnsCharPlusTwoPosition() {
        EncryptCipher encoding= new EncryptCipher();
        encoding.setC('C');
        encoding.setKey(2);
        Character expected = 'E';
        assertEquals(expected, encoding.encrypt());
    }

    @Test
    public void  encryptText(){
        String message = "THE QUICK BROWN FOX";
        String encryptedText = "";

        for(int i = 0; i < message.length(); i++) {
            EncryptCipher encoding = new EncryptCipher();
            encoding.setC(message.charAt(i));
            encoding.setKey(2);
            encryptedText += encoding.encrypt();
        }
        assertEquals("VJG SWKEM DTQYP HQZ", encryptedText);
    }






}
