<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>

<div class = "container">
	<h1>Query String</h1>
	<a href='<s:url value="/user/10/11"></s:url>'> User Aç </a>
	<form method="post" action='<s:url value="/dataAl"></s:url>'>
		<input name="adi" placeholder="Adınız"> 
		<input name="soyadi" placeholder="Soyadınız">
		Futbol <input type="checkbox" name="futbol">
		Yüzme <input type="checkbox" name="yuzme">
		
		Durum1 <input type="checkbox" value="Durum1" name="durum">
		Durum2 <input type="checkbox" value="Durum2" name="durum">
		Durum3 <input type="checkbox" value="Durum3" name="durum">
			
		<button type="submit">Gönder</button>
	</form>
	
	<h1>Property Using</h1>
	
	<form action='<s:url value="/dataPro"></s:url>' method="post">
	<input name="name" placeholder="Name">
	<input name="surname" placeholder="Surname">
	<input name="age" placeholder="Age">
	<button type="submit">Submit</button>
	</form>
	
	<h1>Matrix Variable</h1>
	
	<a href='<s:url value="/matrix/adi=istanbul,bursa,adana"></s:url>'>Matrix Uygula</a>
	<hr>
	
	
	<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">Adı</th>
      <th scope="col">Soyadı</th>
      <th scope="col">Yaşı</th>
    </tr>
  </thead>
  <tbody>
  <c:if test="${ not empty userls }">
  <c:forEach items= "${ userls }" var="item">
    <tr>
      <td>${ item.name }</td>
      <td>${ item.getSurname() }</td>
      <td>${ item.getAge() }</td>
    </tr>
    </c:forEach>
    </c:if>
  </tbody>
</table>

 </div>
	
</body>
</html>
