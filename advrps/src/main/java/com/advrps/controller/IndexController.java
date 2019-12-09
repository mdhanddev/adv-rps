package com.advrps.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.advrps.AdvRpsConstants;
import com.advrps.gameplay.Player;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model, HttpSession session) {
        Player player = (Player)session.getAttribute(AdvRpsConstants.PLAYER_KEY);
        
        model.addAttribute(AdvRpsConstants.PLAYER_KEY, player); //blind set ok, null check on other end

        return "index";
    }

}