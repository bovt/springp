package ru.bvt.tgnotesagent.service;

import feign.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.bvt.tgnotesagent.feign.NoteControllerBotEdition;
import ru.bvt.tgnotesagent.model.NoteVO;
import org.springframework.context.annotation.Bean;

@Service
public class TgNotesBotAgentServiceSimple extends TelegramLongPollingBot implements TgNotesBotAgentService {
    // Аннотация @Value позволяет задавать значение полю путем считывания из application.yaml
    @Value("${bot.name}")
    private String botUsername;

    @Value("${bot.token}")
    private String botToken;

    @Autowired
    private NoteControllerBotEdition noteControllerBotEdition;

    @Override
    public void onUpdateReceived(Update update) {
        //      try {
        System.out.println(update.getMessage().getText());
        noteControllerBotEdition.createOrSaveNote(new NoteVO(update.getMessage().getText()));
//  TODO: добавить команды телеграм, сделать хэндлеры к ним
//
        //           } catch (TelegramApiException e) {
        //           e.printStackTrace();
        //       }
    }

    // Геттеры, которые необходимы для наследования от TelegramLongPollingBot
    public String getBotUsername() {
        return botUsername;
    }

    public String getBotToken() {
        return botToken;
    }
}
