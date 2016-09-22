package boco.server.dao;

import java.util.List;
import java.util.Map;


public interface IBaseDao {
	List<Map<String, Object>> queryBusi();
	
	List<Map<String, Object>> queryBts();
}