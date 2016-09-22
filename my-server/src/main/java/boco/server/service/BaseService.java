package boco.server.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boco.server.dao.IBaseDao;
import boco.server.service.BaseService;

@Service("baseService")
public class BaseService {

	@Autowired
	private IBaseDao baseDao = null;

	public List<Map<String, Object>> queryBusi() {
		return baseDao.queryBusi();
	}

	public List<Map<String, Object>> queryBts() {
		return baseDao.queryBts();
	}

}
