package ru.bvt.notesengine.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotePagesController {

    @GetMapping("/")
    public String listPage(Model model) {
        model.addAttribute("keywords", "list notes");
        return "list";
    }
}
