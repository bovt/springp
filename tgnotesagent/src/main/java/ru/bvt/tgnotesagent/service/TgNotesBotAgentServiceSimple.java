package ru.bvt.tgnotesagent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.bvt.tgnotesagent.feign.NoteControllerProxy;
import ru.bvt.tgnotesagent.model.NoteVO;

//@Component
@Service
public class TgNotesBotAgentServiceSimple extends TelegramLongPollingBot implements TgNotesBotAgentService {
    // Аннотация @Value позволяет задавать значение полю путем считывания из application.yaml
    @Value("${bot.name}")
    private String botUsername;

    @Value("${bot.token}")
    private String botToken;

    @Autowired
    private NoteControllerProxy feignProxy;

    @Override
    public void onUpdateReceived(Update update) {
        //      try {
        System.out.println(update.getMessage().getText());
        feignProxy.createOrSaveNote(new NoteVO(14, "1", update.getMessage().getText(), "2"));
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
