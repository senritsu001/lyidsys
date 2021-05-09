package ly.jp.application.model.dto;

import javax.validation.constraints.NotEmpty;

import ly.jp.application.model.dto.base.BaseDTO;

public class LoginResponse extends BaseDTO {

  @NotEmpty private String userID;
  @NotEmpty private String password;

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
