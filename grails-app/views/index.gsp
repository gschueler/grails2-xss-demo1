<%@ page import="xtest1.Item" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>
	</head>
	<body>
    


${Item.count()} Items:
      <g:select name="test" from="${Item.list()}" optionKey="name" optionValue="value" />

	</body>
</html>
