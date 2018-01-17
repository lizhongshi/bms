package com.dly.util;

import java.io.PrintStream;
import java.util.UUID;
import org.apache.commons.codec.digest.DigestUtils;

public class Util
{
  public static synchronized String getUUID()
  {
    String uuid = UUID.randomUUID().toString().replaceAll("-", "");
    return uuid;
  }

  public static String Md5(String pwd, String salt)
  {
    return DigestUtils.md5Hex(pwd + salt);
  }

  public static void main(String[] args)
  {
    String id = getUUID();

    String idd = Md5("123456", "3749faf3b6954babaa2322124525c80b");
    System.out.println(idd);
  }
}