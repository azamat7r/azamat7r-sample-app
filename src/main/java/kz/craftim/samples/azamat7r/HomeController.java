package kz.craftim.samples.azamat7r;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String homePage(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        LOGGER.info("Calling home page: name='{}'", name);
        if (!(name == null || name.trim().isEmpty())) {
            model.addAttribute("name", name);
        }
        return "home";
    }

}
