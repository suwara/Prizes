package ku.cs.prize.controller;

import ku.cs.prize.entity.Prize;
import ku.cs.prize.model.PrizeRequest;
import ku.cs.prize.service.PrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/prizes")
public class PrizeController {
    @Autowired
    private PrizeService prizeService;

    @GetMapping
    public String getAllPrize(Model model) {
        return "menu-all";
    }

    @GetMapping("/{id}")
    public String getOnePrize(@PathVariable UUID id, Model model) {
        Prize prize = prizeService.getOneById(id);
        model.addAttribute("prize", prize);
        return "prize-view";
    }

    @GetMapping("add")
    public String getPrizeForm(Model model) {
        return  "prize-add";
    }

    @PostMapping("/add")
    public String createPrize(@ModelAttribute PrizeRequest prize, Model model) {
        prizeService.createNewPrize(prize);
        model.addAttribute("prizes", prizeService.getAllPrizes());
        return "redirect:/prizes";
    }
}
