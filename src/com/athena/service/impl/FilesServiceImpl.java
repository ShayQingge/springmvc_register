/**
 * 
 */
package com.athena.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.athena.mapper.FilesMapper;
import com.athena.pojo.Files;
import com.athena.pojo.Users;
import com.athena.service.FilesService;

/**
 * @author Administrator
 *
 */
@Service
public class FilesServiceImpl implements FilesService {
	@Resource
	private FilesMapper filesMapper;
	
	@Override
	public List<Files> show() {
		System.out.println(filesMapper.selAll());
		return filesMapper.selAll();
	}

	@Override
	public int updCount(int id,Users user,String name) {
		Logger logger = Logger.getLogger(FilesServiceImpl.class);
		logger.info(user.getUsername()+"œ¬‘ÿ¡À"+name);
		return filesMapper.updCountById(id);
	}

}
