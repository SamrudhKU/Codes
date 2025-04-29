// This program will change the time format from 12 hours to 24 hours

public class TimeFormatChanger {

    public static String timeConversion(String time){
        String meridium = time.substring( time.length()-2);
        int hour = Integer.parseInt(time.substring( 0, 2));
        
        if (meridium.equals("AM") && hour<12) {
            return time.substring(0, time.length()-2);
        } else if (meridium.equals("AM") && hour==12){
            return "00" + time.substring( 2, time.length()-2);
        } else if (meridium.equals("PM") &&hour<12){
            String pmHour = Integer.toString(12+hour);
            return  pmHour+ time.substring( 2, time.length()-2);
        } 
        return "12"+ time.substring( 2, time.length()-2);
    }
    public static void main(String[] args) {

      String time = "06:05:45PM";

      System.out.println(timeConversion(time));

    }
}