package com.messenger.message_service.model;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.Instant;

@Data
public class Message {
    @NotBlank(message = "{message.id.notblank}")
    private String id;

    @NotBlank(message = "{message.chatId.notblank}")
    private String chatId;

    @NotBlank(message = "{message.senderId.notblank}")
    private String senderId;

    @NotBlank(message = "{message.receiverId.notblank}")
    private String receiverId;

    @NotBlank(message = "{message.content.notblank}")
    @Size(max = 4096, message = "{message.content.size}")
    private String content;

    private Instant timestamp;

    private String type = "text";

    private String mediaUrl;

    private String status = "sent";

    private String replyToMessageId;

    private boolean isEdited = false;

    private String metadata;

    public Message() {
        this.id = java.util.UUID.randomUUID().toString();
        this.timestamp = Instant.now();
    }
}