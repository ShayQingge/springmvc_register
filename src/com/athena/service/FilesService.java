package com.athena.service;

import java.util.List;

import com.athena.pojo.Files;
import com.athena.pojo.Users;

public interface FilesService {
	/**
	 * ��ʾȫ��
	 * @return
	 */
	List<Files> show();
	/**
	 * ����id�޸��������ش���
	 * @param id
	 * @return
	 */
	int updCount(int id,Users users,String name);
}
