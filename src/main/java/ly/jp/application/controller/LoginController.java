package ly.jp.application.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ly.jp.application.model.dto.LoginRequest;
import ly.jp.application.model.dto.LoginResponse;
import ly.jp.application.model.entity.Usermst;
import ly.jp.application.service.UserService;

@Controller
public class LoginController {

  @Autowired private UserService userService;
  @Autowired protected MessageSource messageSource;

  @GetMapping("/login")
  public String init(Model model) {
    model.addAttribute("loginRequest", new LoginRequest()); // TODO
    return "login";
  }

  @PostMapping("/doLogin")
  public String doLogin(
      Model model, @ModelAttribute @Valid LoginRequest loginRequest, BindingResult result) {
    LoginResponse loginResponse = new LoginResponse();
    List<String> msgList = new ArrayList<String>();
    if (result.hasErrors()) {
      List<ObjectError> list = result.getAllErrors();
      String sum = "";
      for (ObjectError i : list) {
        sum = sum + i.getCode() + ":" + i.getDefaultMessage() + "<br>";
        msgList.add(sum);
      }
      loginResponse.setMsg(msgList);
      model.addAttribute("msg", sum);
      model.addAttribute("loginResponse", loginResponse); // TODO
      return "login";
    }

    Usermst um = new Usermst();
    um.setUserid(loginRequest.getUserID());
    um.setPassword(loginRequest.getPassword());
    List<Usermst> lu = userService.login(um);
    if (lu.size() == 0) {
      msgList.add(messageSource.getMessage("ECV002", null, Locale.JAPAN));
      loginResponse.setMsg(msgList);
      model.addAttribute("loginResponse", loginResponse);
      model.addAttribute("msg", messageSource.getMessage("ECV002", null, Locale.JAPAN)); // TODO
      return "login";
    }

    return "redirect:/userList";
  }
}
