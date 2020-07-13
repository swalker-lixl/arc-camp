package com.week005;

import java.util.Arrays;


@SuppressWarnings("ALL")
public class DhtTest {

  private static int[] data = new int[1000000];

  public static void setUp() {
    for (int i = 0; i < data.length; i++) {
      data[i] = i;
    }
  }


  public static void testDht() {
    Dht dht = new Dht(10, 100);
    dht.distribute(data);
    int[] count = dht.getDistribution();
//    LOGGER.info("result :{}", Arrays.toString(count));
    System.out.println(Arrays.toString(count));

  }

  public static void main(String[] args) {
    testDht();
  }


}