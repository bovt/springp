package ru.bvt.tgnotesagent.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import ru.bvt.tgnotesagent.model.NoteVO;


@FeignClient(name = "note-controller", url = "localhost:8080")

public interface NoteControllerProxy {

    @PostMapping("/notes")
    public void createOrSaveNote(@PathVariable NoteVO note);

}