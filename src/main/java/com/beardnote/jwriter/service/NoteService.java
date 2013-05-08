package com.beardnote.jwriter.service;

import org.nutz.dao.Cnd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beardnote.core.dao.BasicDao;
import com.beardnote.jwriter.model.Note;

@Service
public class NoteService {
    @Autowired
    private BasicDao basicDao;

    public Note getLastNote() {
        return basicDao.getDao().fetch(Note.class, Cnd.orderBy().desc("id"));
    }

    public void update(Note note) {
        basicDao.update(note);
    }
}
