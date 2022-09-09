package net.skhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("third")
public class ThirdController {

    @GetMapping("test2")
    public String test2(Model model) {
        model.addAttribute("student", new Student());
        return "third/test2";
    }

    @PostMapping("test2")
    public String test2(Model model, Student student) {
        // TODO: 저장하는 코드를 구현해야 함.
        model.addAttribute("message", "저장되었습니다");
        return "third/test2";
    }
}
