package com.pursuit.noteblog.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pursuit.noteblog.dao.NoteBookMapper;
import com.pursuit.noteblog.po.NoteBook;
import com.pursuit.noteblog.service.NoteBookService;
import com.pursuit.noteblog.util.IdGenerator;
import com.pursuit.noteblog.vo.TreeNode;
import com.pursuit.noteblog.web.NBResult;

public class NotebookeServiceImpl implements NoteBookService {
	
	@Autowired
	NoteBookMapper noteBookMapper;

	@Override
	public NoteBook addNoteBook(NoteBook notebook) {
		noteBookMapper.insert(notebook);
		return notebook;
	}

	@Override
	public NoteBook renameNoteBook(NoteBook notebook) {
		noteBookMapper.updateByPrimaryKey(notebook);
		return notebook;
	}

	@Override
	public NBResult getLeftTree(String userId) {
		List<NoteBook> notebooks = findByUserid(userId);
		
		
		return NBResult.ok(notebooks);
	}
	@Override
	public List<NoteBook> findByUserid(String userId) {
		return noteBookMapper.selectByUid(userId);
	}

	@Override
	public void addUserDefaultBook(String uid) {
		String[] initTree = {"工作","生活","学习"}; 
		
		for (String str : initTree) {
			NoteBook noteBook = new NoteBook();
			noteBook.setId(IdGenerator.NOTEID.generateSessionId());
			noteBook.setName(str);
			noteBook.setUid(uid);
			noteBook.setPid("0");
			noteBook.setIsParent(1);
			noteBook.setStatus(1);
			noteBook.setCreateTime(new Date());
			noteBook.setLastUpdateTime(new Date());
			noteBookMapper.insert(noteBook);
		}
	}

	@Override
	public NBResult addNoteBook(String uid, TreeNode node) {
		NoteBook noteBook = new  NoteBook();
		noteBook.setId(null!=node.getId()?node.getId():IdGenerator.NOTEID.generateSessionId());
		noteBook.setPid(node.getPid());
		noteBook.setUid(uid);
		noteBook.setName(node.getName());
		noteBook.setCreateTime(new Date());
		noteBook.setLastUpdateTime(new Date());
		noteBook.setStatus(1);
		noteBook.setIsParent("true"==node.getIsParent()?1:0);
		noteBookMapper.insert(noteBook);
		
		node.setId(noteBook.getId());
		return NBResult.ok(node);
	}

}
