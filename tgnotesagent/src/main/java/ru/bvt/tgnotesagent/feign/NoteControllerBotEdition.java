package ru.bvt.tgnotesagent.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import ru.bvt.tgnotesagent.model.NoteVO;


@FeignClient(name = "note-client", url = "localhost:8080")

public interface NoteControllerBotEdition {

    @PostMapping("/notes")
    void createOrSaveNote(NoteVO note);


}