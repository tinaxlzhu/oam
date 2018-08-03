package com.dyj.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Servlet Util HTTP处理
 * @author viscar
 *
 */
public class SU {
	private static final Log log =LogFactory.getLog(SU.class);
		
	public static void main(String[] args){
//		String key="TEST_yKssfffDDD_dS_s";
//		String[] f=key.split("_");
//		String field="";
//		for(int k=0;k<f.length;k++){
//			if(k==0){
//				field+=f[k].toLowerCase();
//			}else{
//				if(f[k]!=null){//处理FI_情况
//					String first=""+f[k].charAt(0);
//					if(f[k].length()<2){
//						field+=first.toUpperCase();
//					}else{
//						field+=first.toUpperCase()+(f[k].substring(1)).toLowerCase();
//					}
//				}
//			}			
//		}
//		System.out.println(field);
//		Long l = new Long("");
	}
	
	/**
	 * 从Request中读出XML
	 * @param req
	 * @return
	 */
	public static String reqXml(HttpServletRequest req){
		String xml="";
		StringBuffer data = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = req.getReader();
			while((line = reader.readLine()) != null) {
				data.append(line);
			}
			xml=data.toString();
			if(log.isDebugEnabled()){
				log.debug("reqXml write XML="+xml);
			}
		}catch(Exception e) {
			log.error(" ***读取HttpRequest中的数据中时出错!**");
			log.error(" ***错误码:\n"+e.getMessage());
		}
		return xml;
	}
	
	/**
	 * 把XML数据放入HttpResponse中
	 * @param rep
	 * @param xml
	 */
	public static void repXml(HttpServletResponse rep,String xml){
		try {
			rep.setContentType("text/xml; charset=UTF-8");	
			rep.getWriter().print(xml);
			if(log.isDebugEnabled()){
				log.debug("repXml write XML="+xml);
			}
		} catch (IOException e) {
			log.error(" ***把XML数据放入HttpResponse中时出错!**");
			log.error(" ***错误码:\n"+e.getMessage());
		}
	}
	
	/**
	 * 把数据转成JSON
	 * @param rep
	 * @param o
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static void repJson(HttpServletResponse rep, Object o) throws IOException{
        Map map = new HashMap();
        map.put("data", o);	
		JSONArray jsonArray = JSONArray.fromObject(map);
		String str = jsonArray.toString();
		String modifyed_str = str.substring(1,str.length()-1);
		if(log.isDebugEnabled()){
			log.debug("repJson write JSON="+modifyed_str);
		}
		rep.setContentType("text/json;charset=UTF-8");
		PrintWriter out = rep.getWriter();
		out.print(modifyed_str);
	}
	
	/**
	 * 把数据转成JSON contentType 为 text/html 
	 * @param rep
	 * @param o
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static void repJsonHtml(HttpServletResponse rep, Object o) throws IOException{
        Map map = new HashMap();
        map.put("data", o);	
		JSONArray jsonArray = JSONArray.fromObject(map);
		String str = jsonArray.toString();
		String modifyed_str = str.substring(1,str.length()-1);
		if(log.isDebugEnabled()){
			log.debug("repJson write JSON="+modifyed_str);
		}
		rep.setContentType("text/html;charset=UTF-8");
		PrintWriter out = rep.getWriter();
		out.print(modifyed_str);
	}

	/**
	 * 将list里map里面的null值专为“”
	 * @param list
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static List listMapNullToList(List list) throws Exception{
		List maps = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			Map map = (Map) list.get(i);
			Iterator iter = map.entrySet().iterator();
			while (iter.hasNext()) {
				Entry entry = (Entry)iter.next();
				if(entry.getValue() == null) {
					map.put(entry.getKey(), "");
				}
			}
			maps.add(map);
		}
		return maps;
	}
	
	public static String toJson(Object o){
		Map map = new HashMap();
        map.put("datas", o);
		JSONArray jsonArray = JSONArray.fromObject(map);
		String str = jsonArray.toString();
		String modifyed_str = str.substring(1,str.length()-1);
		if(log.isDebugEnabled()){
			log.debug("toJson write JSON="+modifyed_str);
		}
		return modifyed_str;
	}
	
	/**
	 * 把JS数据放入HttpResponse中
	 * @param rep
	 * @param js
	 */
	public static void repJs(HttpServletResponse rep,String js){
		try {
			rep.setContentType("text/html; charset=UTF-8");	
			rep.getWriter().print("<script>"+js+"</script>");
			if(log.isDebugEnabled()){
				log.debug("repJs write js="+js);
			}
		} catch (IOException e) {
			log.error(" ***把js数据放入HttpResponse中时出错!**");
			log.error(" ***错误码:\n"+e.getMessage());
		}
	}
	
	/**
	 * 把HTML数据放入HttpResponse中
	 * @param rep
	 * @param js
	 */
	public static void repHtml(HttpServletResponse rep,String html){
		try {
			rep.setContentType("text/html; charset=UTF-8");	
			rep.getWriter().print(html);
			if(log.isDebugEnabled()){
				//log.debug("Html write html="+html);
			}
		} catch (IOException e) {
			log.error(" ***把html数据放入HttpResponse中时出错!**");
			log.error(" ***错误码:\n"+e.getMessage());
		}
	}
	
	/**
	 * 按行读取数据
	 * @param req
	 * @return
	 */
	public static String reqText(HttpServletRequest req){
		StringBuffer str = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader =req.getReader();
			while((line = reader.readLine()) != null) {
				str.append(line);
			}
		}catch(Exception e) {
			//System.out.println("Error reading JSON string: " + e.toString());
		}	
		return str.toString();
	}
	
	
	/**
	 * 把LIST数据转成JSON
	 * @param rep
	 * @param o
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static void repJsonList(HttpServletResponse rep,List list) throws IOException{
		rep.setHeader("Pragma", "no-cache");
		rep.setHeader("Cache-Control", "no-cache, must-revalidate");
		rep.setHeader("Pragma", "no-cache");
        Map map = new HashMap();
        map.put("rows", list);
        map.put("total",list.size()); 
		JSONArray jsonArray = JSONArray.fromObject(map);
		String str = jsonArray.toString();
		String modifyed_str = str.substring(1,str.length()-1);
		if(log.isDebugEnabled()){
			log.debug("repJson write JSON="+modifyed_str);
		}
		rep.setContentType("text/json;charset=UTF-8");
		PrintWriter out = rep.getWriter();
		//System.out.println(modifyed_str);
		out.print(modifyed_str);
		rep.getWriter().flush();
		rep.getWriter().close();
	}
	/**
	 * 把MAP数据转成JSON
	 * @param rep
	 * @param o
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static void repJsonMap(HttpServletResponse rep,Map map) throws IOException{
		rep.setHeader("Pragma", "no-cache");
		rep.setHeader("Cache-Control", "no-cache, must-revalidate");
		rep.setHeader("Pragma", "no-cache");
		JSONArray jsonArray = JSONArray.fromObject(map);
		String str = jsonArray.toString();
		String modifyed_str = str.substring(1,str.length()-1);
		if(log.isDebugEnabled()){
			log.debug("repJson write JSON="+modifyed_str);
		}
		rep.setContentType("text/json;charset=UTF-8");
		PrintWriter out = rep.getWriter();
		//System.out.println(modifyed_str);
		out.print(modifyed_str);
		rep.getWriter().flush();
		rep.getWriter().close();
	}
	
	/**
	 * AjaxResult
	 * @param rep
	 * @param o
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static void AjaxResult(HttpServletResponse rep,String content) throws IOException{
		rep.setHeader("Pragma", "no-cache");
		rep.setHeader("Cache-Control", "no-cache, must-revalidate");
		rep.setHeader("Pragma", "no-cache");
		rep.setContentType("text/json;charset=UTF-8");
		PrintWriter out = rep.getWriter();
		//System.out.println(content);
		out.print(content);
		rep.getWriter().flush();
		rep.getWriter().close();
	}
	
	
	public static void repJsonListOnly(HttpServletResponse rep,List list) throws IOException{
		rep.setHeader("Pragma", "no-cache");
		rep.setHeader("Cache-Control", "no-cache, must-revalidate");
		rep.setHeader("Pragma", "no-cache");
//        Map map = new HashMap();
//        map.put("rows", list);
//        map.put("total",list.size()); 
		JSONArray jsonArray = JSONArray.fromObject(list);
		String str = jsonArray.toString();
		String modifyed_str = str.substring(1,str.length()-1);
		if(log.isDebugEnabled()){
			log.debug("repJson write JSON="+modifyed_str);
		}
		rep.setContentType("text/json;charset=UTF-8");
		PrintWriter out = rep.getWriter();
		//System.out.println(modifyed_str);
		out.print(modifyed_str);
		rep.getWriter().flush();
		rep.getWriter().close();
	}
}
