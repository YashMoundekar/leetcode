class Solution {
    public double angleClock(int hour, int minutes) {
        double m=minutes*6;
        double hr= (hour%12)*30+minutes*0.5;
        double dif=Math.abs(hr-m);
        return Math.min(dif,360-dif);
    }
}