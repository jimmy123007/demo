<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/js/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1>rain''''''''''''''''''</h1>
<input type="button"  value="click" onclick="test();">
</body>
<script type="text/javascript">

function test(){
	$.ajax({
		url:"http://localhost:8090/testJsonp?callback=?",
		type:"GET",
		dataType:"jsonp",
		success:function(data){
			
			//alert(data.a);
			//alert(data);
			
			if(data.flag==1){
				alert(data.data);
			}
			
		}
		
		
		
	});
	
	
	
}


</script>


</html>