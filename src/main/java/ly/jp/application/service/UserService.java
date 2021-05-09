package ly.jp.application.service;

import java.util.List;

import ly.jp.application.model.entity.Userdetail;
import ly.jp.application.model.entity.Usermst;

public interface UserService {
  Usermst findUser(Usermst user);

  List<Userdetail> searchUser(String searchUserCondition);

  List<Userdetail> searchAllUser();

  List<Usermst> login(Usermst user);
}
