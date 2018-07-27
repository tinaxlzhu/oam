package test;

import java.rmi.RemoteException;

import org.tempuri.ns1_xsd.RouteDataSyncReq_Body;
import org.tempuri.ns1_xsd.RouteDataSync_Head;
import org.tempuri.ns_xsd.RouteDataSyn;
import org.tempuri.ns_xsd.RouteDataSyncRequest;
import org.tempuri.ns_xsd.RouteDataSyncResponse;
import org.tempuri.ns_xsd.service_wsdl.ServiceStub;

public class test {
	public static void main(String[] args) throws RemoteException {
		/***调用网络服务axis调用webservice**/
		ServiceStub iWebServiceStub = new ServiceStub("http://192.168.0.102:8899/WebServiceServer/services/UnicomCustomServicesInterface");
	  
		//传递参数
		RouteDataSyn routeDataSyn = new RouteDataSyn();
		RouteDataSyncRequest param = new RouteDataSyncRequest();
		RouteDataSyncReq_Body body = new RouteDataSyncReq_Body();
		body.setSESSIONID("20170522084213690811");
		body.setSERIAL_NUM("7617042652711041");
		body.setROUTE_TYPE("00");
		body.setROUTE_VALUE("17630198495");
		body.setBROADBAND_ACCOUNT_ID("");
		body.setACTIVE_TIME("20180426184722");
		body.setINACTIVE_TIME("20371231235959");
		body.setMODIFIED_TIME("20180426184722");
		body.setSTATUS("01");
		body.setSYSTEM_CODE("00");
		body.setPROV_CODE("76");
		body.setEPARCHY_CODE("0371");
		body.setUSER_TYPE("8");

		param.setMSGBODY(body);
		RouteDataSync_Head head = new RouteDataSync_Head();
		head.setMSGTYPE("01");
		head.setRECORDTYPE("401");
		head.setVERSION("01");
		param.setMSGHEADER(head);
				
		routeDataSyn.setRequest(param);
	    
	    ////传递参数返回结果
		RouteDataSyncResponse response = iWebServiceStub.routeDataSyn(routeDataSyn);
		
		if (response != null) {
			System.out.println(response);
		}
	    
	
	}


}
