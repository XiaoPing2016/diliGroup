package cn.webservice.impl;

import javax.jws.WebService;

import cn.bean.ResultMessage;
import cn.webservice.CheckStatusService;
@WebService(endpointInterface = "cn.webservice.CheckStatusService", serviceName = "checkStatusWs")
public class CheckStatusServiceImpl implements CheckStatusService{

	@Override
	public ResultMessage checkStatus() {
		// TODO Auto-generated method stub
		ResultMessage bean =new ResultMessage();
		bean.setCode("0000");
		bean.setMes("success");
		return bean;
	}

}
