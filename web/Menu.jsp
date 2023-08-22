<%-- Document : Menu Created on : May 13, 2022, 11:24:00 PM Author : Pisano --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@page
contentType="text/html" pageEncoding="UTF-8"%>
     <link rel="stylesheet" href="./style/style.css" />
<!--begin of menu-->
  <jsp:useBean id="c" class="dao.DAO"></jsp:useBean>
<!--<nav class="navbar navbar-expand-md navbar-dark bg-black">-->
<nav class="navbar navbar-expand-md navbar-light bg-white fixed-top">

  <div class="container">
    <a class="navbar-brand" href="home"
      ><img src="./assets/B.png" alt="" class="imgBXM"
    /></a>

    <button
      class="navbar-toggler"
      type="button"
      data-toggle="collapse"
      data-target="#navbarsExampleDefault"
      aria-controls="navbarsExampleDefault"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <span class="navbar-toggler-icon"></span>
    </button>

    <div   
      class="collapse navbar-collapse" id="navbarSupportedContent"
    >
          <!--class="collapse navbar-collapse justify-content-md-around"-->
      <!--id="navbarsExampleDefault"-->
      <ul class="navbar-nav mr-auto">
          <!--class="navbar-nav m-auto"-->
           <!--m-auto-->
           <!--d-flex justify-content-around-->
        <li class="nav-item nav-container" id="nav-item">
          <a class="nav-link" href="index.jsp" style="color: black; font-weight: bold; font-size: 13px">Home</a>
        </li>
        <li class="nav-item nav-content">
          <a class="nav-link" href="home" style="color: black; font-weight: bold; font-size: 13px ">Menu</a>
        </li>
    
        <c:if test="${sessionScope.acc.isAdmin ==1}">
          <li class="nav-item">
            <a class="nav-link" href="accountManager" style="color: black; font-weight: bold; font-size: 13px" >Manage Account</a>
          </li>
        </c:if>

        <c:if test="${sessionScope.acc.isSell ==1}">
          <li class="nav-item">
            <a class="nav-link" href="manager" style="color: black; font-weight: bold; font-size: 13px">Manage Product</a>
          </li>
        </c:if>

        <c:if test="${sessionScope.acc !=null}">
<!--          <li class="nav-item">
            <a class="nav-link" href="#" style="color: black; font-weight: bold; font-size: 13px">Hello ${sessionScope.acc.user}</a>
          </li>-->
          <li class="nav-item">
            <a class="nav-link" href="logout" style="color: black; font-weight: bold; font-size: 13px">Log out</a>
          </li>
        </c:if>
        <c:if test="${sessionScope.acc ==null}">
          <li class="nav-item">
            <a class="nav-link" href="Login.jsp" style="color: black; font-weight: bold; font-size: 13px">Log In</a>
          </li>
<!--          <li class="nav-item">
            <a class="nav-link" href="Register.jsp" style="color: black; font-weight: bold; font-size: 18px">Sign Up</a>
          </li>-->
        </c:if>

            
      </ul>

      <form action="search" method="get" class="form-inline my-2 my-lg-0">
        <div class="input-group input-group-sm">
          <input
            value="${txtS}"
            name="txt"
            type="text"
            class="form-control"
            aria-label="Small"
            aria-describedby="inputGroup-sizing-sm"
            placeholder="Search..."
          />
          <div class="input-group-append">
            <button type="submit" class="btn btn-secondary btn-number">
              <i class="fa fa-search"></i>
            </button>
          </div>
        </div>
            <c:if test="${sessionScope.acc !=null}">  
            <a class="btn btn-info btn-sm ml-3" href="show" style="height: 36px; padding-top: 6px">
                        <i class="fa fa-book"></i> Cart
                        <span class="badge badge-light">${c.countNumCart(sessionScope.acc.id)}</span>
             
            </a>
            </c:if>
      </form>
    </div>
  </div>
</nav>
<!--        <section id="home">
           <div class="container">
             <h5>NEW ARRIVALS</h5>
               <h1>All World <span> In Box</span></h1>
             <p>
              We provide all products on every platform and fit with your option 
              </p>
              <a href="#" class="button-hover">
                <button>Go Now</button>
              </a>
           </div>
    </section>-->
<!--end of menu-->
