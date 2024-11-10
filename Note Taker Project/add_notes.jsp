<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Notes</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>

<div class="container bg-info">
		<%@include file="navbar.jsp"%>
		<br>
		<h4 style="text-align:center">Start Taking your notes here!</h4>
		<br>
		
		<!-- this is form  -->
		<form action="SaveNoteServlets" method="post">
   <div class="form-group">
    <label for="title"><b>Note Title</b></label>
    <input 
    name="title"
    required
    type="text" 
    class="form-control" 
    id="title" 
    aria-describedby="emailHelp" 
    placeholder="Enter here.." />
    
  </div>
  <div class="form-group">
    <label for="content"><b>Note Content</b></label>
    <textarea 
    name="content"
    required
    id="content" 
    placeholder="Enter your content here.."
    class="form-control"
    style="height:300px;"
    ></textarea>
    
    
  </div>
  <div class="container text-center">
  <button type="submit" class="btn btn-dark m-2">Add Notes</button>
  </div>
 </form>
</div>
</body>
</html>