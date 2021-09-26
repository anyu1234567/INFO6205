package edu.neu.coe.info6205.sort;

import edu.neu.coe.info6205.sort.elementary.InsertionSort;
import edu.neu.coe.info6205.sort.linearithmic.MergeSortTest;
import edu.neu.coe.info6205.util.Config;
import edu.neu.coe.info6205.util.Timer;
import io.cucumber.java.bs.A;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class SortTimerTest {

    static class TestSorter extends SortWithHelper<Integer> {
        public TestSorter(String description, int N, Config config) {
            super(description, N, config);
        }

        /**
         * Generic, mutating sort method which operates on a sub-array
         *
         * @param xs   sort the array xs from "from" to "to".
         * @param from the index of the first element to sort
         * @param to   the index of the first element not to sort
         */
        @Override
        public void sort(Integer[] xs, int from, int to) {
            Arrays.sort(xs, from, to);
        }
    }


    @Test
    public void testSort1() {
        final TestSorter sorter = new TestSorter("test", 100, config);
        final Helper<Integer> helper = sorter.getHelper();
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(1000000));
        final Integer[] ys = sorter.sort(xs);
        assertTrue(ys[0] < ys[1]);
        helper.postProcess(ys); // test that ys is properly sorted.
    }

    @Test
    public void testSortTimer01() {
        //random arrays
        Timer timer = new Timer();
        //final  int lengths = 500;
        Integer[] lengths = new Integer[]{1000,2000,4000,8000,16000};

        Random random = new Random();
        double meantime = timer.repeat(10, () -> {
            Integer[] integers = new Integer[lengths[4]];
            for (int i = 0; i < integers.length; i++) {
                integers[i] = random.nextInt(100);
            }
            return integers;
        }, integers -> {
            InsertionSort.sort(integers);
            return null;
        });
        System.out.println("meantime:"+meantime);

    }

    @Test
    public void testSortTimer02() {
        //ordered arrays
        Timer timer = new Timer();
        //final  int lengths = 500;
        Integer[] lengths = new Integer[]{1000,2000,4000,8000,16000};

        Random random = new Random();
        double meantime = timer.repeat(10, () -> {
            Integer[] integers = new Integer[lengths[4]];
            for (int i = 0; i < integers.length; i++) {
                integers[i] = i;
            }
            return integers;
        }, integers -> {
            InsertionSort.sort(integers);
            return null;
        });
        System.out.println("meantime:"+meantime);

    }

    @Test
    public void testSortTimer03() {
        //partially-ordered arrays
        Timer timer = new Timer();
        //final  int lengths = 500;
        Integer[] lengths = new Integer[]{1000,2000,4000,8000,16000};

        Random random = new Random();
        double meantime = timer.repeat(10, () -> {
            Integer[] integers = new Integer[lengths[4]];
            for (int i = 0; i < integers.length/2; i++) {
                integers[i] = i;
            }
            for (int i = integers.length/2; i <integers.length ; i++) {
                integers[i] = random.nextInt(100);
            }
            return integers;
        }, integers -> {
            InsertionSort.sort(integers);
            return null;
        });
        System.out.println("meantime:"+meantime);

    }

    @Test
    public void testSortTimer04() {
        //ordered arrays
        Timer timer = new Timer();
        //final  int lengths = 500;
        Integer[] lengths = new Integer[]{1000,2000,4000,8000,16000};

        Random random = new Random();
        double meantime = timer.repeat(10, () -> {
            Integer[] integers = new Integer[lengths[4]];
            int j=0;
            for (int i = integers.length-1; i >=0; i--) {
                integers[i] = j;
                j++;
            }
            return integers;
        }, integers -> {
            InsertionSort.sort(integers);
            return null;
        });
        System.out.println("meantime:"+meantime);

    }


    private static Config config;

    @BeforeClass
    public static void beforeClass() throws IOException {
        config = Config.load(MergeSortTest.class);
    }


}