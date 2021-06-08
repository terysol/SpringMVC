<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="css/indexCss.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<a href ="/test1?a=100&b=200&c=300">Test1</a> | 
		<a href ="/test2?a=100&b=200&c=300&c=400&c=500">Test2</a> | 
		<a href ="/test3">Test3</a> |
		<a href ="/test4?a=100&b=200">Test4</a> | 
		<a href ="/test5/1000/2000/3000">@PathVariable</a> | 
		<a href ="/test6?a=300&b=400&c=500">@RequestParam</a> | 
		<a href ="/test7?a=300&b=400&c=500&c=600">RequestParam2 </a> | 
		<a href ="/test8?a=100&b=200&c=300">RequestParam3 </a> |
		<a href ="/test9?a=100&b=200&c=300&c=400">Object(Map) </a> | <br/>
		<a href ="/test10?a=100&b=200&c=300&c=400">Object(Map, List) </a> | 
		<a href ="/test11?a=100&b=200&c=300">ModelAttribute </a> <!-- autowired 사용한다. (타입) -->
	</body>
</html>