class Solution {
    public double angleClock(int hour, int minutes) {
        double hourDegree = (hour%12)*30 + (0.5)*minutes;
        double minuteDegree = minutes*6;
        double diff = Math.abs(hourDegree - minuteDegree);
        return Math.min(diff,360-diff);
    }
}