/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 8/4/15
 * Time: 11:54 AM
 * To change this template use File | Settings | File Templates.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
//        input: [15,18], [16,17], [1,5],[7,9], [0,2]
//        return [0,5],[7,9],[15,18].

        List<Interval> intervals = Arrays.asList(new Interval(15, 18), new Interval(16, 17), new Interval(1,5), new Interval(7,9), new Interval(0,2));
        System.out.println("Input intervals are: ");
        for (Interval interval : intervals) {
            System.out.print(" [" + interval.start + ", " + interval.end + "] ");
        }
        List<Interval> output = mergeInterval(intervals);
        System.out.println("Output intervals are: ");
        for (Interval interval : output) {
            System.out.print(" " + interval.start + ", " + interval.end + " ");
        }

    }

    private static List<Interval> mergeInterval(List<Interval> intervals) {
        if (intervals == null || intervals.size() < 2) {
            return intervals;
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        System.out.println("sorted intput intervals are: ");
        for (Interval interval : intervals) {
            System.out.print(" " + interval.start + ", " + interval.end + " ");
        }

        List<Interval> outputList = new ArrayList<Interval>();

        Interval prev = intervals.get(0);
        for (int i = 1; i<intervals.size() ; i++ ) {
            Interval current = intervals.get(i);
            if (prev.end > current.start) {
                Interval merged = new Interval(prev.start, Math.max(prev.end, current.end));
                prev = merged;
            } else {
                outputList.add(prev);
                prev = current;
            }
        }

        outputList.add(prev);
        return outputList;
    }

    static class Interval {
        int start;
        int end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
