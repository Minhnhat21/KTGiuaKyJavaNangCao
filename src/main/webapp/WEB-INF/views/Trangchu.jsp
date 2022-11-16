<%@page import="java.util.ArrayList"%>
<%@page import="bean.tintucbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tin tức</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
<style>
.form-control-borderless {
    border: none;
}

.form-control-borderless:hover, .form-control-borderless:active, .form-control-borderless:focus {
    border: none;
    outline: none;
    box-shadow: none;
}
.description-news {
	text-align: center;
}
</style>
</head>
<body>
<div class="container">
    <br/>
      
      <table width="1400" class="table" style="">
	<td width="200" valign="top">
	
	<!-- Search title -->
		<form action="home" method="post">
		  <div class="form-group">
		    <label for="search-input">Tìm theo tiêu đề</label>
		   <input id="search-input" type="text" class="form-control"  name ="search-title" >
		    <small id="searchHelp" class="form-text text-muted">Tìm thông tin theo tiêu đề</small>
		  </div>
		  <button type="submit" class="btn btn-primary">Tìm kiếm</button>
			</form>
	<!-- 	-----------------------	 -->
	<br>
	  <form action="home" method="post">
	  <div class="form-group">
	    <label for="search-input">Tìm theo năm</label>
	   <input id="search-input" type="text" class="form-control"  name ="search-year">
	    <small id="searchHelp" class="form-text text-muted">Tìm kiếm theo năm</small>
	  </div>
	  <button type="submit" class="btn btn-primary">Tìm kiếm</button>
		</form>
	  	
	  	</td>

      <td> 
      <table width="1200" class="table" style="" > 
      <%
      String thongbao = String.valueOf(request.getAttribute("thongbaokq"));
      %>
      <h2><%=thongbao%></h2>  
      <hr>
     <%
   
       ArrayList<tintucbean> danhsachtin = (ArrayList<tintucbean>) request.getAttribute("dsTin");
       if(danhsachtin != null) { 
    	int nsize = danhsachtin.size();
       	for(int i = 0; i < nsize ; i += 3){
       		tintucbean tin = danhsachtin.get(i); 

     %>
	        <tr>
	        <%
	        	for(int j = i; j < i + 3; j++) {
	        		if(j < nsize) {
	        			tin = danhsachtin.get(j);
	        %>
	        	<td width="300" style="background-color: #B3FFAE; border-style: dotted;">
		             <div class="description-news">
			         <img src="<%=tin.getAnh()%>" width="200"> <br>	
		             <b>Mã tin: </b> <p> <%=tin.getMaTin()%> </p>
		            <b>Tiêu đề: </b>   <h4> <%=tin.getTieuDe()%> </h4>
		            <b>Tóm tắt: </b>   <p> <%=tin.getTomTat()%> </p>
		            <b>Ngày đưa tin: </b> <p> <%=tin.getNgayDuaTin()%> </p>
			        <b>Nội dung:</b>  <p> <%=tin.getNoiDung()%> </p>		       				   
				       
			       </div>
	        	</td>
	        	
	        	<%
	        		}
	        	}%>
	        	
	        </tr>
	      	<%
       	} 
       	}%>
      </table>
      </td>
    </table>
</div>
</body>
</html>