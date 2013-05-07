package com.beardnote.jwriter.service;

import java.util.List;

import org.nutz.dao.Cnd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beardnote.jwriter.dao.NoteDao;
import com.beardnote.jwriter.model.Note;

@Service
public class NoteService {
    @Autowired
    private NoteDao noteDao;

    public Note get() {
        List<Note> notes = noteDao.search(Note.class, Cnd.where("id", ">", 0));
        if (notes != null && notes.size() > 0) {
            return notes.get(0);
        } else {
            return new Note();
        }
    }

    public void update(Note note) {
        noteDao.update(note);
    }
}
