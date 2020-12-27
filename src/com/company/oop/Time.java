package com.company.oop;

public class Time {
    private final int[] hourRange={0,23};
    private final int[] minuteRange={0,59};
    private final int[] secondRange={0,59};

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
      setTime(hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour>=hourRange[0] && hour<=hourRange[1])
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute>=minuteRange[0] && minute<=minuteRange[1])
            this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second>=secondRange[0] && second<=secondRange[1])
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public Time nextSecond(){
        return new Time(this.hour,this.minute,this.second+1);
    }
    public Time previousSecond(){
        return new Time(this.hour,this.minute,this.second-1);
    }
    public String withLeadingZero(int time){
        return time>9? String.valueOf(time) :"0"+time;
    }

    @Override
    public String toString() {
        return withLeadingZero(hour)+":"+withLeadingZero(minute)+":"+withLeadingZero(second);
    }
}
