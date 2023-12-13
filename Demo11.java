import java.util.Scanner;
class Demo11{
  public static void main(String[] args) {

     
        Time start = new Time(12, 9, 96);
        Time stop = new Time(6, 5, 96);
        Time diff;

        
        diff = Time.difference(start, stop);

        System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
        System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
        System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
    }
}

class Time {

    int seconds;
    int minutes;
    int hours;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

 public static Time difference(Time start, Time stop)
    {
        Time diff = new Time(0, 0, 0);

        
        if(start.seconds > stop.seconds){
            --stop.minutes;
            stop.seconds += 60;
        }

        diff.seconds = stop.seconds - start.seconds;

        
        if(start.minutes > stop.minutes){
            --stop.hours;
            stop.minutes += 60;
        }

        diff.minutes = stop.minutes - start.minutes;
        diff.hours = stop.hours - start.hours;

       
        return(diff);
    }
}