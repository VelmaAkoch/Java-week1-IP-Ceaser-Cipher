public class DecryptCipher {
    private String text;
    private int key;

    public DecryptCipher(String text, int key){
        this.text = text;
        this.key = 26 - key;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public StringBuffer decrypt(){
        StringBuffer r=new StringBuffer();

        for (int i=0; i<this.text.length(); i++)
        {
            if (Character.isLetter(this.text.charAt(i)))
        }


    }
}
