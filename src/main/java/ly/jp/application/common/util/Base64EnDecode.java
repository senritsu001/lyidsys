package ly.jp.application.common.util;

import java.util.Base64;

public class Base64EnDecode {

  public static String encodePassword(String inputPassword) {
    return Base64.getEncoder().encodeToString(inputPassword.getBytes());
  }

  public static String decodePassword(String inputPassword) {
    return new String(Base64.getDecoder().decode(inputPassword));
  }

}
