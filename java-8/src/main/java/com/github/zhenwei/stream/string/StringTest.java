package com.github.zhenwei.stream.string;

/**
 * @author: zhangzhenwei
 * @description:
 * @date: 2023/7/24  14:05
 * @since: 1.0.0
 */
public class StringTest {


  public static void main(String[] args) {
    testStringBuffer();
    //testStringBuilder();
  }

  public static void testStringBuffer(){
    //线程安全
    StringBuffer buffer = new StringBuffer();
    //返回 实际值长度
    int count = buffer.length();
    System.out.println("empty count " + count);
    int valueLength = buffer.capacity();
    System.out.println("value length " + valueLength);
    //append 方法，设置count长度，并扩容指定长度
    //扩容规则： 当前容量的 2 倍 + 2。 如当前16， 则扩容为34 = 16 * 2 + 2
    buffer.append("1234567890");
    buffer.append("12345678901234567890123451234567890");

    count = buffer.length();
    System.out.println("append count " + count);
    valueLength = buffer.capacity();
    System.out.println("append value length " + valueLength);
    //在tostring时，置入：toStringCache 参数，用于缓存
    String string = buffer.toString();
  }

  public static void testStringBuilder(){
    StringBuilder builder = new StringBuilder();
    //返回 实际值长度
    int count = builder.length();
    //同StringBuffer
    builder.append("123");
    //没有 toStringCache 参数
    String string = builder.toString();
  }

}
