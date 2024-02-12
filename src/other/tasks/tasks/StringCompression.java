package other.tasks.tasks;

public class StringCompression {
    private static String stringCompression(String string) {
        StringBuilder output = new StringBuilder();
        char first = string.charAt(0);
        int count = 1;
        for (int i = 1; i < string.length(); i++) {
            if (first == string.charAt(i)) {
                count++;
            } else {
                output.append(first).append(count);
                first = string.charAt(i);
                count = 1;
            }
        }
        output.append(first).append(count);
        if (output.length() >= string.length()) {
            return string;
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));
        System.out.println(stringCompression("aaa"));
        System.out.println(stringCompression("abcda"));
    }
}
