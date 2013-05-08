package com.beardnote.jwriter.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.beardnote.jwriter.model.Note;
import com.beardnote.jwriter.service.NoteService;

@Controller
@RequestMapping("/note")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "/detail")
    public @ResponseBody
    String detail() {
        Note note = noteService.getLastNote();
        String json = JSON.toJSONString(note);
        return json;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String updateForm(Note note) {
        return "{'result':'ok'}";
    }
}
