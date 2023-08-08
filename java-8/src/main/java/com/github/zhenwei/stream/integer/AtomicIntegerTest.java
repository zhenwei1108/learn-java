package com.github.zhenwei.stream.integer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: zhangzhenwei
 * @description:
 * @date: 2023/8/8  16:52
 * @since: 1.0.0
 */
public class AtomicIntegerTest {

  public static void main(String[] args) {
    AtomicInteger integer = new AtomicInteger(0);
    //先计算后获取
    int i = integer.addAndGet(1);


  }

}
