package cn.webservice;

import javax.jws.WebService;

import cn.bean.ResultMessage;
@WebService
public interface CheckStatusService {

	public abstract ResultMessage checkStatus();
}
