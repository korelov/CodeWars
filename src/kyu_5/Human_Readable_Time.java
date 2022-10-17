package kyu_5;

//https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

public class Human_Readable_Time {
    public static String makeReadable(int seconds) {

        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);

//        int hour = 0;
//        String hourS = "";
//        int minute = 0;
//        String minuteS = "";
//        String secondS = "";
//
//        if (seconds >= 3600) {
//            hour = seconds / 3600;
//            seconds = seconds - hour * 3600;
//        }
//        if (seconds < 3600) {
//            minute = seconds / 60;
//            seconds = seconds - minute * 60;
//        }
//        if (hour == 0) {
//            hourS = "00";
//        } else if (hour > 9) {
//            hourS = Integer.toString(hour);
//        } else {
//            hourS = "0" + Integer.toString(hour);
//        }
//
//        if (minute == 0) {
//            minuteS = "00";
//        } else if (minute > 9) {
//            minuteS = Integer.toString(minute);
//        } else {
//            minuteS = "0" + Integer.toString(minute);
//        }
//
//        if (seconds == 0) {
//            secondS = "00";
//        } else if (seconds > 9) {
//            secondS = Integer.toString(seconds);
//        } else {
//            secondS = "0" + Integer.toString(seconds);
//        }
//        return hourS + ":" + minuteS + ":" + secondS;
    }


    public static void main(String[] args) {
        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));
        System.out.println(makeReadable(3600));
    }
}
