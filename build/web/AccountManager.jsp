<%-- 
    Document   : AccountManager
    Created on : May 17, 2022, 9:20:41 PM
    Author     : Pisano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Manager Account</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
        <script>
            $(document).ready(function () {
                $('[data-toggle="tooltip"]').tooltip();
            });
        </script>
<body>
    <div class="container">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6">
                        <a href="home"><button type="button" class="btn btn-success">Back to home<i class="material-icons">&#xE88A;</i></button>
			<h2>Manage <b>Account</b></h2>
                    </div>
			<div class="col-sm-6">
                                                        
			</div>
                </div>
            </div>
            <table class="table table-striped table-hover">
                <thead>
                    <tr>
                                <th>ID</th>
                                <th>UserName</th>						
                                <th>Role</th>
                                <th>Action</th>

                    </tr>
                </thead>
                <tbody>
                                                <c:forEach items="${list}" var="o">
                                <tr>
                                    <td>${o.id}</td>
                                    <td><a href="#">${o.user}</a></td>
                                    <td style="width: 200px;">
                                        <c:if test="${o.isSell==1}">
                                            <a href="#" class="btn btn-secondary btn-sm active" role="button" aria-pressed="true">Seller</a>
                                        </c:if>
                                        <c:if test="${o.isAdmin==1}">
                                            <a href="#" class="btn btn-secondary btn-sm active" role="button" aria-pressed="true">Admin</a>
                                        </c:if>
                                    </td>
                                    <td>
                                        <a target="blank" href="editAccount?uID=${o.id}"><button type="button" class="btn btn-outline-info  btn-sm">Edit</button></a>
                                        <form action="deleteAccount" method="POST" style="display:inline">
                                            <a> <input type="submit" class="btn btn-outline-danger btn-sm" value="Delete" onclick="if (confirm('Are you sure you want to delete?'))
                                                        form.action = 'deleteAccount?uID=${o.id}';
                                                    else
                                                        return false;"/>  
                                            </a>
                                        </form>
                                    </td>
                                </tr>
                            </c:forEach>
                </tbody>
            </table>

        </div>
                    
    </div>

</body>
</html>