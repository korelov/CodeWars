//https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
public class AllStarCodeChallenge18 {

    public static int strCount(String str, char letter) {
        if (str.length() == 0) {
            return 0;
        }
        int count = 0;
        char x = letter;
        for (int i = 0; i < str.length(); i++) {
            if (x == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(strCount("hello",'l'));
    }
}
