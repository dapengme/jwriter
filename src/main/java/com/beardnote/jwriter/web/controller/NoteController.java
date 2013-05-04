package com.beardnote.jwriter.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.nutz.dao.Cnd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.beardnote.jwriter.dao.NoteDao;
import com.beardnote.jwriter.model.Note;

@Controller
@RequestMapping("/note")
public class NoteController {
	@Autowired
	private NoteDao noteDao;

	@RequestMapping(value = "/detail")
	public @ResponseBody
	String detail() {
		List<Note> notes = noteDao.search(Note.class, Cnd.where("id", ">", 0));
		if (notes != null && notes.size() > 0) {
			Note note = notes.get(0);
			try {
				String content = new String(note.getContent().getBytes(
						"ISO-8859-1"), "UTF-8");
				String title = new String(note.getTitle()
						.getBytes("ISO-8859-1"), "UTF-8");
				note.setContent(content);
				note.setTitle(title);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String json = JSON.toJSONString(note);
			return json;
		} else {
			return "{'result':0}";
		}
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody
	String updateForm(Note note) {
		noteDao.update(note);
		return "{'result':'ok'}";
	}
}
