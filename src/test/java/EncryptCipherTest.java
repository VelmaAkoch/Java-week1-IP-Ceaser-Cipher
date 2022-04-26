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






}
