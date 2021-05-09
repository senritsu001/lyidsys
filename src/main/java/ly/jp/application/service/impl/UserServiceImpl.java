package ly.jp.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ly.jp.application.service.UserService;
import ly.jp.application.common.util.Base64EnDecode;
import ly.jp.application.mapper.auto.UserdetailMapper;
import ly.jp.application.mapper.auto.UsermstMapper;
import ly.jp.application.model.entity.Userdetail;
import ly.jp.application.model.entity.UserdetailExample;
import ly.jp.application.model.entity.Usermst;
import ly.jp.application.model.entity.UsermstExample;
import ly.jp.application.model.entity.UsermstExample.Criteria;

@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired private UsermstMapper usermstMapper;
  @Autowired private UserdetailMapper userdetailMapper;

  @Override
  public Usermst findUser(Usermst user) {
    return null;
  }

  @Override
  public List<Usermst> login(Usermst user) {
    UsermstExample usermstExample = new UsermstExample();
    Criteria criteria = usermstExample.createCriteria();
    criteria.andUseridEqualTo(user.getUserid());
    criteria.andPasswordEqualTo(Base64EnDecode.encodePassword(user.getPassword()));
    return usermstMapper.selectByExample(usermstExample);
  }

  @Override
  public List<Userdetail> searchUser(String searchUserCondition) {
    UserdetailExample userdetailExample = new UserdetailExample();
    userdetailExample.createCriteria().andUseridLike(searchUserCondition);
    userdetailExample.or().andUsernameLike(searchUserCondition);
    return userdetailMapper.selectByExample(userdetailExample);
  }

  @Override
  public List<Userdetail> searchAllUser() {
    UserdetailExample userdetailExample = new UserdetailExample();
    return userdetailMapper.selectByExample(userdetailExample);
  }
}
