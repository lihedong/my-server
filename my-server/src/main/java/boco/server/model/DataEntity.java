package boco.server.model;

/**
 * 返回数据库查询结果实例类
 * 
 * 返回码分配规则 
 * 成功：0 
 * 错误：100-199
 */
public class DataEntity {

	/** 正确码 */
	public static final int CODE_SUCCESS = 0;

	/** 错误码：数据库SQL异常 */
	public static final int CODE_DB_SQL_ERROR = 101;

	/** 结果编码 */
	private Integer code;

	/** 结果描述 */
	private String message;

	/** 结果数据ID */
	private String dataId;

	/** 结果数据 */
	private Object data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDataId() {
		return dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static DataEntity success() {
		DataEntity result = new DataEntity();
		result.code = CODE_SUCCESS;
		result.message = "success";
		return result;
	}
}
