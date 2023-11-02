package com.example.DXHei.service;

import com.example.DXHei.entity.DO.Prompotion;

import java.util.List;

/**
 * @author XPR
 * @since 2023/10/6 14:53
 */

public interface PrompotionService {

    List<Prompotion> listPrompotions();

    List<Prompotion> listMyParticipate(long userId);
    Prompotion createPrompotion(Prompotion record, String inviteKey);

    long joinPrompotion(long userId, String inviteKey);

}
