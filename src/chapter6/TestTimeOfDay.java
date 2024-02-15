package chapter6;

public class TestTimeOfDay {

    public static void main(String[] args){

        //Instantiate (create) a TimeOfDay class object called mytime.
        //Set mytime to 11:58 (hour = 11, minute = 58).I
        TimeOfDay mytime = new TimeOfDay(11,58);

        //Display mytime: (Should display 11:58)
        System.out.println("Time: " + mytime.displayCurrentTime());

        //Increase mytime: By 2 mins
         mytime.addOneMinute();
         mytime.addOneMinute();

         //Display mytime: (Should display 12:00)
        System.out.println("Time: " + mytime.displayCurrentTime());

        //Set mytime to 22:59 and Increment by 1 hour
        mytime.setHour(22);
        mytime.setMinute(59);
        mytime.addOneHour();

        //Display mytime: (Should display 23:59)
        System.out.println("Time: " + mytime.displayCurrentTime());

        //Increment by 1 minute
        mytime.addOneMinute();

        //Display mytime: (Should display 00:00)
        System.out.println("Time: " + mytime.displayCurrentTime());

        //Set mytime hour  to 25: Should result in error message
        mytime.setHour(25);

        //Set mytime minute to 67: Should result in error message
        mytime.setMinute(67);

        //Display reset to 0
        System.out.println("Time: " + mytime.displayCurrentTime());




    }
}
