package inProgress;

// https://www.codewars.com/kata/55c90cad4b0fe31a7200001f/train/java

public class String_Templates_Bug_Fixing {

    public static String buildString(String... args) {
        String res = "I like ";
        if (args == null) {
            return res;
        } else {
            for (int i = 0; i < args.length; i++) {
               if(args.length-1==i){
                   res+=args[i] +"!";
               }else {
                   res += args[i] + ", ";
               }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(buildString(null));
        System.out.println(buildString(""));
        System.out.println(buildString("Cheese", "Milk", "Chocolate"));
        System.out.println(buildString("Cheese", "Milk"));
        System.out.println(buildString("Chocolate"));
    }
}

//
//    StringBuilder stringBuilder = new StringBuilder("I like ");
//        if (args.length - 1 == 0) {
//                return stringBuilder.toString();
//                }
//
//                for (int i = 0; i < args.length; i++) {
//        if (i == args.length - 1) {
//        stringBuilder.append(args[i]).append("!");
//        } else {
//        stringBuilder.append(args[i]).append(", ");
//        }
//        }
//
//        return stringBuilder.toString();