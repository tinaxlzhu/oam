/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:58 BST)
 */

package org.tempuri.ns1_xsd;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class ExtensionMapper {

	public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
			java.lang.String typeName, javax.xml.stream.XMLStreamReader reader)
			throws java.lang.Exception {

		if ("http://tempuri.org/NS.xsd".equals(namespaceURI)
				&& "RouteDataSyncRequest".equals(typeName)) {

			return org.tempuri.ns_xsd.RouteDataSyncRequest.Factory
					.parse(reader);

		}

		if ("http://tempuri.org/NS1.xsd".equals(namespaceURI)
				&& "RouteDataSync_Head".equals(typeName)) {

			return org.tempuri.ns1_xsd.RouteDataSync_Head.Factory.parse(reader);

		}

		if ("http://tempuri.org/NS1.xsd".equals(namespaceURI)
				&& "RouteDataSyncReq_Body".equals(typeName)) {

			return org.tempuri.ns1_xsd.RouteDataSyncReq_Body.Factory
					.parse(reader);

		}

		if ("http://tempuri.org/NS1.xsd".equals(namespaceURI)
				&& "RouteDataSyncRsp_Body".equals(typeName)) {

			return org.tempuri.ns1_xsd.RouteDataSyncRsp_Body.Factory
					.parse(reader);

		}

		throw new org.apache.axis2.databinding.ADBException("Unsupported type "
				+ namespaceURI + " " + typeName);
	}

}
