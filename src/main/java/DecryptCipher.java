public class DecryptCipher {
    private String text;
    private int key;

    public DecryptCipher(String text, int key){
        this.text = text;
        this.key = 26 - key;
    }



}
