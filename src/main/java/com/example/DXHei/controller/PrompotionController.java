package com.example.DXHei.controller;

import com.example.DXHei.common.RespondModel;
import com.example.DXHei.entity.DO.Prompotion;
import com.example.DXHei.service.PrompotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author XPR
 * @since 2023/10/6 17:28
 */
@RestController
@RequestMapping("/prompotion")
public class PrompotionController {

    @Autowired
    PrompotionService prompotionService;
    @GetMapping("/list")
    public List<Prompotion> listAll() {
        List<Prompotion> prompotions = prompotionService.listPrompotions();
        return prompotions;

    }

    @PostMapping("/create/{inviteKey}")
    public Prompotion create(@RequestParam("pName") String pName,
                             @RequestParam("startDate") Date startDate,
                             @RequestParam("endDate") Date endDate,
                             @RequestParam("itemId") long itemId,
                             @PathVariable String inviteKey) {


        // 调用service创建prompotion
        Prompotion prompotion = new Prompotion();
        prompotion.setName(pName);
        prompotion.setStartDate(startDate);
        prompotion.setEndDate(endDate);
        prompotion.setItemId(itemId);

        Prompotion ret = prompotionService.createPrompotion(prompotion, inviteKey);

        return ret;
    }
}
