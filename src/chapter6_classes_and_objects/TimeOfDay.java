package chapter6_classes_and_objects;

import java.sql.Time;

public class TimeOfDay {

    // Instance variables:
    private int hour;
    private int minute;


    // Default Constructor:
    TimeOfDay(){
      hour = 0;
      minute = 0;
    }

    // Parameterized Constructor:
    TimeOfDay(int hour, int minute){
       setHour(hour);
       setMinute(minute);
    }

    // Setters methods:
   public void setHour(int hour){
       if(hour < 0 || hour > 23){
        this.hour = 0;
        System.out.println("Invalid hour. Setting the hour to " + this.hour);
    }else{
           this.hour = hour;
       }
    }

    public void setMinute(int minute){
           if (minute < 0 || minute > 60){
               this.minute = 0;
               System.out.println("Invalid minute. Setting minute to " + this.minute);
           }else{
               this.minute = minute;
           }
       }

    // Method to add one hour
    public void addOneHour()                                                                                                                                                                {
       hour = (hour + 1) % 24;
    }

    // Method to add one minute
    public void addOneMinute(){
        minute = (minute + 1) % 60;
        if (minute == 0) {
            addOneHour();// Increment the hour only
        }
    }

    /*** Method to compute the time difference between two TimeOfDay objects
     * @param time1
     * @param time2
     * @return new TimeOfDay object with differences
     */
    public TimeOfDay getTimeDiff(TimeOfDay time1, TimeOfDay time2){

        //Takes each time and converts hours into mins and adds the total mins
        int totalMin1 = time1.hour * 60 + time1.minute;
        int totalMin2 = time2.hour * 60 + time2.minute;

        //Takes the absolute value of the difference in minutes
        int diffMins = Math.abs(totalMin2 - totalMin1);

        //Converts the mins back into hours and the remaining is the mins.
        int diffHours = diffMins / 60;
        int remainMins = diffMins % 60;

        //Returns a new time of day Object with the differences.
        TimeOfDay difftime = new TimeOfDay(diffHours, remainMins);
        return difftime;
    }

    /**
     * Method to set the time difference between two TimeOfDay objects
     * @param time1
     * @param time2
     */
    public void setTimeDiff(TimeOfDay time1, TimeOfDay time2){
        TimeOfDay diff = getTimeDiff(time1,time2);
        this.hour = diff.hour;
        this.minute = diff.minute;
    }

    //Display method: Formatting was looked up via Google
    public String displayCurrentTime(){
        String formattedH = String.format("%02d",hour);
        String formattedM = String.format("%02d",minute);
        return formattedH + ":" + formattedM;
    }
}


