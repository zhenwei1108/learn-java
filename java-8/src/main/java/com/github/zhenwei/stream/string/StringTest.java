package com.github.zhenwei.stream.string;

/**
 * @author: zhangzhenwei
 * @description:
 * @date: 2023/7/24  14:05
 * @since: 1.0.0
 */
public class StringTest {


  public static void main(String[] args) {

  }

  public void testStringBuffer(){
    //线程安全
    StringBuffer buffer = new StringBuffer();
    //返回 实际值长度
    int count = buffer.length();
    //append 方法，设置count长度，并扩容指定长度
    //扩容规则： 新填充数据长度 + 当前数据长度（如：容量长度 = 16，当前数据长度 = 12， 新填充数据长度 = 10， 则扩容后长度= 12 + 10）。
    buffer.append("123");
    //在tostring时，置入：toStringCache 参数，用于缓存
    String string = buffer.toString();
  }

  public void testStringBuilder(){
    StringBuilder builder = new StringBuilder();
    //返回 实际值长度
    int count = builder.length();
    //同StringBuffer
    builder.append("123");
    //没有 toStringCache 参数
    String string = builder.toString();
  }

}
