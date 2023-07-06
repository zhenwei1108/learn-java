package com.github.zhenwei.stream.security;

import java.io.IOException;
import sun.security.x509.X500Name;

/**
 * @author: zhangzhenwei
 * @description:
 * @date: 2023/7/3  14:43
 * @since: 1.0.0
 */
public class X500NameString {


  public static void main(String[] args) throws IOException {
    String dn = "C=CN,CN=this,is=test,OU=test";
    X500Name name = new X500Name(dn);
    System.out.println(name);

  }

}
