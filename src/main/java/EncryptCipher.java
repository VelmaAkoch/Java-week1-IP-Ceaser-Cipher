import java.util.Arrays;

public class EncryptCipher {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',};

    public Character encryptCharacter(char Character){
        int position = Arrays.asList(alphabet).indexOf(Character);
        if(position +2 >= alphabet.length) {
            position=Math.abs(alphabet.length -position-2);

        }else{
            position = position+2;
        }
        return alphabet[position];
    }
    private String text;
    private int key;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
