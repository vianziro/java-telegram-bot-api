package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.response.BaseResponse;

/**
 * stas
 * 5/2/16.
 */
public class KickChatMember extends BaseRequest<KickChatMember> {

    public KickChatMember(Object chatId, int userId) {
        super(BaseResponse.class);
        add("chat_id", chatId).add("user_id", userId);
    }
}
