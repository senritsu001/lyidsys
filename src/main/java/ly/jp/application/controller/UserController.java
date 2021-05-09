package ly.jp.application.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ly.jp.application.model.dto.UserListRequest;
import ly.jp.application.model.dto.UserListResponse;
import ly.jp.application.model.entity.Userdetail;
import ly.jp.application.service.UserService;

@Controller
public class UserController {
  @Autowired private UserService userService;
  @Autowired protected MessageSource messageSource;

  @GetMapping("/userList")
  public String init(Model model) {
    List<Userdetail> userdetails = userService.searchAllUser();
    UserListResponse userListResponse = new UserListResponse();
    userListResponse.setUserList(userdetails);
    model.addAttribute("userListResponse", userListResponse);
    if (userdetails.size() == 0) {
      model.addAttribute("msg", messageSource.getMessage("ECG001", null, Locale.JAPAN));
    }
    model.addAttribute("userListRequest", new UserListRequest()); // TODO
    return "user/userlist";
  }

  @PostMapping("/searchUser")
  public String doSearchUser(
      @ModelAttribute @Valid UserListRequest userAddRequest, BindingResult result, Model model) {
    String inputSearchUser = userAddRequest.getSearchUser();
    List<Userdetail> userdetails;
    if ("".equals(inputSearchUser) || inputSearchUser == null) {
      userdetails = userService.searchAllUser();
    } else {
      userdetails = userService.searchUser(inputSearchUser);
    }
    UserListResponse userListResponse = new UserListResponse();
    userListResponse.setUserList(userdetails);
    model.addAttribute("userListResponse", userListResponse);
    if (userdetails.size() == 0) {
      model.addAttribute("msg", messageSource.getMessage("ECG001", null, Locale.JAPAN));
    }
    return "user/userList";
  }
}
