<%-- 
    Document   : Home
    Created on : May 13, 2022, 7:46:01 PM
    Author     : Pisano
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <!--begin of menu-->
        <jsp:include page="Menu.jsp"></jsp:include>
        <!--end of menu-->
        <div class="container">
            <div class="row" >
                <div class="col">
<!--                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="Home.jsp">Home</a></li>
                            <li class="breadcrumb-item"><a href="#">Category</a></li>
                            <li class="breadcrumb-item active" aria-current="#">Sub-category</li>
                        </ol>
                    </nav>-->
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row" style="margin-top: 70px">
            <jsp:include page="Left.jsp"></jsp:include>

                <div class="col-sm-9">
                    <div class="row">
                        
                        <c:forEach items="${listP}" var="o">
                            <div class="col-12 col-md-6 col-lg-4">
                                <div class="card">
                                    <img class="card-img-top" src="${o.image}" alt="Card image cap">
                                    <div class="card-body">
                                        <p class="wordpositive"><a href="detail?pid=${o.id}" title="View Product">${o.name}</a></p>
                                        
            <style>
                    p.wordpositive {
                        text-align:center;
                        font-size: 1.1rem;
                        font-weight: 600;
                    }
                    p.title1 {
                        text-align:center;
                        font-weight: 500;
                    }
                    
            </style>
                                        
                                        <p class="title1">${o.title}</p>
                                        <div class="row">
                                            <div class="col">
                                                <p class="btn btn-danger btn-block">${o.price} VND</p>
                                            </div>
<!--                                            <div class="col">
                                                <a href="show" class="btn btn-success btn-block">Add to cart</a>
                                            </div>-->
                                             <c:if test="${sessionScope.acc !=null}"> 
                                             <div class="col">
                                                 <a href="addToCart?ProductID=${o.id}" class="btn btn-info btn-block" style="color: white">Order Food</a>
                                            </div>
                                            </c:if>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>

            </div>
        </div>

        <!-- Footer -->
         <jsp:include page="Footer.jsp"></jsp:include>
        
        
    </body>
</html>