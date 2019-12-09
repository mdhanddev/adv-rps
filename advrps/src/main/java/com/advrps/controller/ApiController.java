package com.advrps.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.advrps.AdvRpsConstants;
import com.advrps.gameplay.HumanPlayer;
import com.advrps.gameplay.Player;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PutMapping(value = "/setPlayerName/{name}")
    public Map<String, Object> setPlayerName(@PathVariable("name") String name, HttpSession session) {
        Map<String, Object> data = new HashMap<>();
        Player player = null;

        if(name != null){
            player = new HumanPlayer(name);
            session.setAttribute(AdvRpsConstants.PLAYER_KEY, player);
        } else {
            //TODO ?? figure something out
        }

        data.put("player", player);

        return data;
    }
}