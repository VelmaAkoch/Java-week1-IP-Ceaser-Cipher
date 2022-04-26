import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecryptCipherTest {

    @Test
    public void decryptedCharacter_returnsCharPMinusTwoPosition() {
        DecryptCipher encoding= new DecryptCipher();
        encoding.setC('E');
        encoding.setKey(2);
        Character expected = 'C';
        assertEquals(expected, encoding.decrypt());
    }


}
