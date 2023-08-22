<%-- 
    Document   : Left
    Created on : May 13, 2022, 11:25:54 PM
    Author     : Pisano
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
  <!--<link rel="stylesheet" href="./style/style.css" />-->
<div class="col-sm-3" >
        <c:if test="${sessionScope.acc !=null}">
            <a class="nav-link" href="#" style="color: blue; font-weight: bold; font-size: 20px">Hello ${sessionScope.acc.user}</a>
        </c:if>
            <p class="text-center text-danger text-uppercase">${mess}</p>
    <div class="card bg-light mb-3">
        <div class="card-header bg-dark text-white"><i class="fa fa-list"></i> Thực Đơn</div>
        <ul class="list-group category_block">
            <li class="list-group-item text-white ${tag == o.cid ? "":""}"><a href="home">Tất cả</a></li>
            <c:forEach items="${listCC}" var="o">               
                <li class="list-group-item text-white ${tag == o.cid ? "":""}"><a href="category?cid=${o.cid}">${o.cname}</a></li>
            </c:forEach>

        </ul>
        
        
        

    </div>
    <div class="card bg-light mb-3">
        <div class="card-header bg-dark text-white">Món mới</div>
        <div class="card-body">
            <img class="img-fluid" src="${p.image}" />
            
                  <p class="text-center card bg-dark text-white">${p.name}</p>
                  <p class="text-center card bg-dark text-white">${p.price} VND</p>
   
        </div>
    </div>
</div>