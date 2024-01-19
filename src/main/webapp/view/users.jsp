<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.UserTable.UserTableCrudApp.user.User" %>
<% List<User> listUsers = (List<User>) request.getAttribute("listUsers"); %>

	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

 <style>
    table {
      border-collapse: collapse;
      width: 100%;
    }

    th {
      background-color: #343a40; /* Dark background color */
      color: #ffffff; /* Text color */
      padding: 10px;
      text-align: left;
    }

    td {
      border: 1px solid #dddddd;
      padding: 10px;
      text-align: left;
    }
  </style>
  


<title>Manage Users</title>

</head>
<body>
	<div align=center>
		<div>
			<h2>Manage Users!</h2>
		</div>
		<div class="m-2">
			<a class="h3" href="<%= request.getContextPath() %>/users/new">Add New User</a>
		</div>
		
		
		 
		<div>
			<table border="1">
				<tr class="thead-dark">
				  <th>ID</th>
				  <th>E-mail</th>
				  <th>First Name</th>
				  <th>Last Name</th>
				  <th>Enabled</th>
				  <th></th>
				</tr>
				<tbody>
					
				
					 <% for (User user :  listUsers) { %>
                        <tr>
                            <td><%= user.getId() %></td>
                            <td><%= user.getEmail() %></td>
                            <td><%= user.getFirstName() %></td>
                            <td><%= user.getLastName() %></td>
                            <td><%= user.isEnabled() ? "Enabled" : "Disabled" %></td>

                            
                            
							<td>
								<a class="h4 mr-3" href="<%=request.getContextPath()%>/users/edit/<%=user.getId()%>">Edit</a>
								<a class="h4" href="<%=request.getContextPath()%>/users/delete/<%=user.getId()%>">Delete</a>
							</td>


					</tr>
                    <% } %>	
				
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>