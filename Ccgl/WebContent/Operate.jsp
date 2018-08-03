<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.3.3/themes/icon.css">
	<script type="text/javascript" src="jquery-easyui-1.3.3/jquery.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>操作历史</title>
<script type="text/javascript">
	var url;
	    function searchGood(){
	    	$('#dg').datagrid('load',{
	    		g_name:$('#g_name').val()
	    	});
	    }
	</script>
</head>
<body style="margin:5px">
  <table class=easyui-datagrid id="dg" title="库存信息" fitColumns="true" pagination="true" rownumbers="true"
    fit="true" url="operate" toolbar="#tb">
    <thead>
      <tr>
        <th field="cb" checkbox="true">编号</th>
        <th field="id" width="50">编号</th>
        <th field="goodname" width="150">商品</th>
        <th field="operateTypetest" width="100">入库/出库</th>
        <th field="userid" width="150">操作人</th>
        <th field="operatetime" width="100">操作时间</th>
        <th field="remark" width="150">备注</th>
  </table>
  
     <div id=tb>
  <div>
  <form id='condition' name='condition' action='' method="post">&nbsp&nbsp&nbsp&nbsp&nbsp<font color="red" >商品名称：</font>
      <input type="text" id='g_name' name="g_name" >
        <a href="javascript:searchGood()" class="easyui-linkbutton" iconCls="icon-search" id="btn" plain="true" >搜索</a>
  </form>
  </div>
     </div>
</body>
</html>
</body>
</html>