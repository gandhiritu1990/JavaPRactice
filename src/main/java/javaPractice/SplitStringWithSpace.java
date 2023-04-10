package javaPractice;

public class SplitStringWithSpace {

    public static void main(String[] args){
        String s = "Welcome to \"India is\" \"India a\"";
        String[] ss = s.split("\\s+(?=(?:[^\"]*\"[^\"]*\")*$)");
        for(String sss: ss){
            System.out.println(sss);

        }
    }
}
