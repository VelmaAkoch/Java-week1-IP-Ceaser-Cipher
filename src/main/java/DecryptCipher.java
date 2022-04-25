import java.util.Arrays;

public class DecryptCipher {

    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',};
    public Character decryptCharacter(char Character){
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

//    public StringBuffer decrypt(){
//        StringBuffer r=new StringBuffer();
//
//        for (int i=0; i<this.text.length(); i++)
//        {
//            if (Character.isLetter(this.text.charAt(i))){
//                if (Character.isUpperCase(this.text.charAt(i)))
//                {
//                    if (this.text.charAt(i) == ' '){
//                        r.append(' ');
//                    }
//                    else{
//                        char ch = (char)(((int)this.text.charAt(i) +
//                                this.key - 65) % 26 + 65);
//                        r.append(ch);
//                    }
//                }
//                else
//                {
//                    if(this.text.charAt(i) == ' '){
//                        r.append(' ');
//                    }
//                    else {
//                        char ch = (char) (((int) this.text.charAt(i) +
//                                this.key -97) % 26 + 97);
//                        r.append(ch);
//                    }
//                }
//            }
//        }
//
//       return  r;
//    }
}
