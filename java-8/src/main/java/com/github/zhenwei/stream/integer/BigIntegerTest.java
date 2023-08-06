package com.github.zhenwei.stream.integer;

import java.math.BigInteger;

/**
 * @author: zhangzhenwei
 * @description:
 * @date: 2023/8/6  20:35
 * @since: 1.0.0
 */
public class BigIntegerTest {

  public static void main(String[] args) {
    //input string
    BigInteger bigInteger = new BigInteger("5");
    //
    System.out.println(bigInteger.toByteArray().length);
  }

}
