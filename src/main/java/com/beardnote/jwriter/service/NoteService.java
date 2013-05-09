package com.beardnote.jwriter.service;

import org.nutz.dao.Cnd;
import org.springframework.stereotype.Service;

import com.beardnote.common.service.BaseService;
import com.beardnote.jwriter.model.Note;

@Service
public class NoteService extends BaseService {
	
	/**
	 * 获取最新的一条
	 * @return
	 */
	public Note getLastNote(){
		return dao.fetch(Note.class, Cnd.orderBy().desc("id"));
	}
	

}
