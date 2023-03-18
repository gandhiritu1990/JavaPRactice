package javaPractice;

public class RemoveSpecialCharacters {

    public static void main(String[] args){
        String s = "R#$%^it*&^%u";
        s = s.replaceAll("[!@#$%^&*()]","");
        System.out.println(s);

    }
}
