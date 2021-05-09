package ly.jp.application.model.dto;

import java.util.List;

import ly.jp.application.model.entity.Userdetail;

public class UserListResponse {
  private List<Userdetail> userList;

  public List<Userdetail> getUserList() {
    return userList;
  }

  public void setUserList(List<Userdetail> userList) {
    this.userList = userList;
  }
}
