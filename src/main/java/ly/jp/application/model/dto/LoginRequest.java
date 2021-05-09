package ly.jp.application.model.dto;

import javax.validation.constraints.NotBlank;

public class LoginRequest {

  @NotBlank private String userID;
  @NotBlank private String password;

  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
