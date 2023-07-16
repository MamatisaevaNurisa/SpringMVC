package peaksoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import peaksoft.User;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping()
    public String getHello() {
        return "hello";
    }

    @GetMapping("salam")
    public String getSalam(@RequestParam("name") String name, Model model) {
        String word = "Salam" + name;
        model.addAttribute("word", word);
        return "salam";
    }
    @GetMapping("addUser")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "saveUser";
    }
public void saveUser(@ModelAttribute("user") User user ){
    System.out.println(user);
}

}
