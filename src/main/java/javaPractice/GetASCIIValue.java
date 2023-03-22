package javaPractice;

public class GetASCIIValue {

    public static void main(String[] args){
        char c = 'z';
        int ascii = c;
        System.out.println(ascii);

        int unicode = 65;
        char character = (char) unicode;
        String text = Character.toString(character);
        System.out.println(text);

    }
}
