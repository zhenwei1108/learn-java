package com.github.zhenwei.stream.object;

import java.nio.ByteOrder;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

/**
 * @author: zhangzhenwei
 * @description: 对象内存分析
 * TODO 依赖包： jol-core
 * @date: 2023/7/25  15:30
 * @since: 1.0.0
 */
public class ObjectTest {


  public static void main(String[] args) {
    //小端序
    System.out.println(ByteOrder.nativeOrder());
    //System.out.println(VM.current().details());
    //打印String的内存分配
    //System.out.println(ClassLayout.parseClass(String.class).toPrintable());

    /**
     * OFF  SZ     TYPE DESCRIPTION               VALUE
     *   0   8          (object header: mark)     0x0000000000000001 (non-biasable; age: 0)
     *   8   4          (object header: class)    0xf80002da
     *  12   4   char[] String.value              [1, 2, 3]
     *  16   4      int String.hash               0
     *  20   4          (object alignment gap)
     * Instance size: 24 bytes
     * 1. markword： 8字节（64位系统），
     *
     *
     */

    String data = "123";
    System.out.println(ClassLayout.parseInstance(data).toPrintable());

  }

}
