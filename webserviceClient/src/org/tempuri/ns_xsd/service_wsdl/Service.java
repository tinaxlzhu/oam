
/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */

package org.tempuri.ns_xsd.service_wsdl;

/*
 *  Service java interface
 */

public interface Service {

	/**
	 * Auto generated method signature Service definition of function
	 * NS__RouteDataSyn
	 * 
	 * @param routeDataSyn0
	 */

	public org.tempuri.ns_xsd.RouteDataSyncResponse routeDataSyn(

	org.tempuri.ns_xsd.RouteDataSyn routeDataSyn0)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations Service
	 * definition of function NS__RouteDataSyn
	 * 
	 * @param routeDataSyn0
	 */
	public void startrouteDataSyn(

	org.tempuri.ns_xsd.RouteDataSyn routeDataSyn0,

	final org.tempuri.ns_xsd.service_wsdl.ServiceCallbackHandler callback)

	throws java.rmi.RemoteException;

	//
}
