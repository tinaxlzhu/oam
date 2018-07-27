/**
 * RouteDataSyncReq_Body.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:58 BST)
 */

package org.tempuri.ns1_xsd;

/**
 * RouteDataSyncReq_Body bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class RouteDataSyncReq_Body implements
		org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * RouteDataSyncReq_Body Namespace URI = http://tempuri.org/NS1.xsd
	 * Namespace Prefix = ns2
	 */

	/**
	 * field for SESSIONID
	 */

	protected java.lang.String localSESSIONID;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getSESSIONID() {
		return localSESSIONID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SESSIONID
	 */
	public void setSESSIONID(java.lang.String param) {

		this.localSESSIONID = param;

	}

	/**
	 * field for SERIAL_NUM
	 */

	protected java.lang.String localSERIAL_NUM;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getSERIAL_NUM() {
		return localSERIAL_NUM;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SERIAL_NUM
	 */
	public void setSERIAL_NUM(java.lang.String param) {

		this.localSERIAL_NUM = param;

	}

	/**
	 * field for ROUTE_TYPE
	 */

	protected java.lang.String localROUTE_TYPE;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getROUTE_TYPE() {
		return localROUTE_TYPE;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ROUTE_TYPE
	 */
	public void setROUTE_TYPE(java.lang.String param) {

		this.localROUTE_TYPE = param;

	}

	/**
	 * field for ROUTE_VALUE
	 */

	protected java.lang.String localROUTE_VALUE;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localROUTE_VALUETracker = false;

	public boolean isROUTE_VALUESpecified() {
		return localROUTE_VALUETracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getROUTE_VALUE() {
		return localROUTE_VALUE;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ROUTE_VALUE
	 */
	public void setROUTE_VALUE(java.lang.String param) {
		localROUTE_VALUETracker = true;

		this.localROUTE_VALUE = param;

	}

	/**
	 * field for BROADBAND_ACCOUNT_ID
	 */

	protected java.lang.String localBROADBAND_ACCOUNT_ID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localBROADBAND_ACCOUNT_IDTracker = false;

	public boolean isBROADBAND_ACCOUNT_IDSpecified() {
		return localBROADBAND_ACCOUNT_IDTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getBROADBAND_ACCOUNT_ID() {
		return localBROADBAND_ACCOUNT_ID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            BROADBAND_ACCOUNT_ID
	 */
	public void setBROADBAND_ACCOUNT_ID(java.lang.String param) {
		localBROADBAND_ACCOUNT_IDTracker = true;

		this.localBROADBAND_ACCOUNT_ID = param;

	}

	/**
	 * field for ACTIVE_TIME
	 */

	protected java.lang.String localACTIVE_TIME;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localACTIVE_TIMETracker = false;

	public boolean isACTIVE_TIMESpecified() {
		return localACTIVE_TIMETracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getACTIVE_TIME() {
		return localACTIVE_TIME;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ACTIVE_TIME
	 */
	public void setACTIVE_TIME(java.lang.String param) {
		localACTIVE_TIMETracker = true;

		this.localACTIVE_TIME = param;

	}

	/**
	 * field for INACTIVE_TIME
	 */

	protected java.lang.String localINACTIVE_TIME;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localINACTIVE_TIMETracker = false;

	public boolean isINACTIVE_TIMESpecified() {
		return localINACTIVE_TIMETracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getINACTIVE_TIME() {
		return localINACTIVE_TIME;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            INACTIVE_TIME
	 */
	public void setINACTIVE_TIME(java.lang.String param) {
		localINACTIVE_TIMETracker = true;

		this.localINACTIVE_TIME = param;

	}

	/**
	 * field for MODIFIED_TIME
	 */

	protected java.lang.String localMODIFIED_TIME;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localMODIFIED_TIMETracker = false;

	public boolean isMODIFIED_TIMESpecified() {
		return localMODIFIED_TIMETracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getMODIFIED_TIME() {
		return localMODIFIED_TIME;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MODIFIED_TIME
	 */
	public void setMODIFIED_TIME(java.lang.String param) {
		localMODIFIED_TIMETracker = true;

		this.localMODIFIED_TIME = param;

	}

	/**
	 * field for STATUS
	 */

	protected java.lang.String localSTATUS;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSTATUSTracker = false;

	public boolean isSTATUSSpecified() {
		return localSTATUSTracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getSTATUS() {
		return localSTATUS;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            STATUS
	 */
	public void setSTATUS(java.lang.String param) {
		localSTATUSTracker = true;

		this.localSTATUS = param;

	}

	/**
	 * field for SYSTEM_CODE
	 */

	protected java.lang.String localSYSTEM_CODE;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSYSTEM_CODETracker = false;

	public boolean isSYSTEM_CODESpecified() {
		return localSYSTEM_CODETracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getSYSTEM_CODE() {
		return localSYSTEM_CODE;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SYSTEM_CODE
	 */
	public void setSYSTEM_CODE(java.lang.String param) {
		localSYSTEM_CODETracker = true;

		this.localSYSTEM_CODE = param;

	}

	/**
	 * field for USER_TYPE
	 */

	protected java.lang.String localUSER_TYPE;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localUSER_TYPETracker = false;

	public boolean isUSER_TYPESpecified() {
		return localUSER_TYPETracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getUSER_TYPE() {
		return localUSER_TYPE;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            USER_TYPE
	 */
	public void setUSER_TYPE(java.lang.String param) {
		localUSER_TYPETracker = true;

		this.localUSER_TYPE = param;

	}

	/**
	 * field for PROV_CODE
	 */

	protected java.lang.String localPROV_CODE;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localPROV_CODETracker = false;

	public boolean isPROV_CODESpecified() {
		return localPROV_CODETracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPROV_CODE() {
		return localPROV_CODE;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PROV_CODE
	 */
	public void setPROV_CODE(java.lang.String param) {
		localPROV_CODETracker = true;

		this.localPROV_CODE = param;

	}

	/**
	 * field for EPARCHY_CODE
	 */

	protected java.lang.String localEPARCHY_CODE;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localEPARCHY_CODETracker = false;

	public boolean isEPARCHY_CODESpecified() {
		return localEPARCHY_CODETracker;
	}

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getEPARCHY_CODE() {
		return localEPARCHY_CODE;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EPARCHY_CODE
	 */
	public void setEPARCHY_CODE(java.lang.String param) {
		localEPARCHY_CODETracker = true;

		this.localEPARCHY_CODE = param;

	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {

		return factory
				.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
						this, parentQName));

	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName,
			javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://tempuri.org/NS1.xsd");
			if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":RouteDataSyncReq_Body", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"RouteDataSyncReq_Body", xmlWriter);
			}

		}

		namespace = "";
		writeStartElement(null, namespace, "SESSIONID", xmlWriter);

		if (localSESSIONID == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
					"nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localSESSIONID);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "SERIAL_NUM", xmlWriter);

		if (localSERIAL_NUM == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
					"nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localSERIAL_NUM);

		}

		xmlWriter.writeEndElement();

		namespace = "";
		writeStartElement(null, namespace, "ROUTE_TYPE", xmlWriter);

		if (localROUTE_TYPE == null) {
			// write the nil attribute

			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
					"nil", "1", xmlWriter);

		} else {

			xmlWriter.writeCharacters(localROUTE_TYPE);

		}

		xmlWriter.writeEndElement();
		if (localROUTE_VALUETracker) {
			namespace = "";
			writeStartElement(null, namespace, "ROUTE_VALUE", xmlWriter);

			if (localROUTE_VALUE == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localROUTE_VALUE);

			}

			xmlWriter.writeEndElement();
		}
		if (localBROADBAND_ACCOUNT_IDTracker) {
			namespace = "";
			writeStartElement(null, namespace, "BROADBAND_ACCOUNT_ID",
					xmlWriter);

			if (localBROADBAND_ACCOUNT_ID == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localBROADBAND_ACCOUNT_ID);

			}

			xmlWriter.writeEndElement();
		}
		if (localACTIVE_TIMETracker) {
			namespace = "";
			writeStartElement(null, namespace, "ACTIVE_TIME", xmlWriter);

			if (localACTIVE_TIME == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localACTIVE_TIME);

			}

			xmlWriter.writeEndElement();
		}
		if (localINACTIVE_TIMETracker) {
			namespace = "";
			writeStartElement(null, namespace, "INACTIVE_TIME", xmlWriter);

			if (localINACTIVE_TIME == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localINACTIVE_TIME);

			}

			xmlWriter.writeEndElement();
		}
		if (localMODIFIED_TIMETracker) {
			namespace = "";
			writeStartElement(null, namespace, "MODIFIED_TIME", xmlWriter);

			if (localMODIFIED_TIME == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localMODIFIED_TIME);

			}

			xmlWriter.writeEndElement();
		}
		if (localSTATUSTracker) {
			namespace = "";
			writeStartElement(null, namespace, "STATUS", xmlWriter);

			if (localSTATUS == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localSTATUS);

			}

			xmlWriter.writeEndElement();
		}
		if (localSYSTEM_CODETracker) {
			namespace = "";
			writeStartElement(null, namespace, "SYSTEM_CODE", xmlWriter);

			if (localSYSTEM_CODE == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localSYSTEM_CODE);

			}

			xmlWriter.writeEndElement();
		}
		if (localUSER_TYPETracker) {
			namespace = "";
			writeStartElement(null, namespace, "USER_TYPE", xmlWriter);

			if (localUSER_TYPE == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localUSER_TYPE);

			}

			xmlWriter.writeEndElement();
		}
		if (localPROV_CODETracker) {
			namespace = "";
			writeStartElement(null, namespace, "PROV_CODE", xmlWriter);

			if (localPROV_CODE == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localPROV_CODE);

			}

			xmlWriter.writeEndElement();
		}
		if (localEPARCHY_CODETracker) {
			namespace = "";
			writeStartElement(null, namespace, "EPARCHY_CODE", xmlWriter);

			if (localEPARCHY_CODE == null) {
				// write the nil attribute

				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil",
						"1", xmlWriter);

			} else {

				xmlWriter.writeCharacters(localEPARCHY_CODE);

			}

			xmlWriter.writeEndElement();
		}
		xmlWriter.writeEndElement();

	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://tempuri.org/NS1.xsd")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix,
			java.lang.String namespace, java.lang.String localPart,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
		if (writerPrefix != null) {
			xmlWriter
					.writeAttribute(writerPrefix, namespace, attName, attValue);
		} else {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
			xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
					namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter
				.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(attributePrefix, namespace, attName,
					attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(prefix
						+ ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			}

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite
								.append(prefix)
								.append(":")
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					}
				} else {
					stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);
		if (prefix == null) {
			prefix = generatePrefix(namespace);
			javax.xml.namespace.NamespaceContext nsContext = xmlWriter
					.getNamespaceContext();
			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);
				if (uri == null || uri.length() == 0) {
					break;
				}
				prefix = org.apache.axis2.databinding.utils.BeanUtil
						.getUniquePrefix();
			}
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
		return prefix;
	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {
		private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory
				.getLog(Factory.class);

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static RouteDataSyncReq_Body parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			RouteDataSyncReq_Body object = new RouteDataSyncReq_Body();

			int event;
			javax.xml.namespace.QName currentQName = null;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				currentQName = reader.getName();

				if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName
								.substring(fullTypeName.indexOf(":") + 1);

						if (!"RouteDataSyncReq_Body".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (RouteDataSyncReq_Body) org.tempuri.ns1_xsd.ExtensionMapper
									.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "SESSIONID")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "SESSIONID")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setSESSIONID(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// 1 - A start element we are not expecting indicates an
					// invalid parameter was passed
					throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "SERIAL_NUM")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "SERIAL_NUM")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setSERIAL_NUM(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// 1 - A start element we are not expecting indicates an
					// invalid parameter was passed
					throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "ROUTE_TYPE")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "ROUTE_TYPE")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setROUTE_TYPE(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {
					// 1 - A start element we are not expecting indicates an
					// invalid parameter was passed
					throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "ROUTE_VALUE")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "ROUTE_VALUE")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setROUTE_VALUE(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("",
								"BROADBAND_ACCOUNT_ID")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("",
								"BROADBAND_ACCOUNT_ID")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setBROADBAND_ACCOUNT_ID(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "ACTIVE_TIME")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "ACTIVE_TIME")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setACTIVE_TIME(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "INACTIVE_TIME")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "INACTIVE_TIME")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setINACTIVE_TIME(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "MODIFIED_TIME")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "MODIFIED_TIME")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setMODIFIED_TIME(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "STATUS")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "STATUS")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setSTATUS(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "SYSTEM_CODE")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "SYSTEM_CODE")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setSYSTEM_CODE(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "USER_TYPE")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "USER_TYPE")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setUSER_TYPE(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "PROV_CODE")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "PROV_CODE")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setPROV_CODE(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName("", "EPARCHY_CODE")
								.equals(reader.getName())
						|| new javax.xml.namespace.QName("", "EPARCHY_CODE")
								.equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if (!"true".equals(nillableValue)
							&& !"1".equals(nillableValue)) {

						java.lang.String content = reader.getElementText();

						object.setEPARCHY_CODE(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

					} else {

						reader.getElementText(); // throw away text nodes if
													// any.
					}

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// 2 - A start element we are not expecting indicates a
					// trailing invalid property

					throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
