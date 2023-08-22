<%-- 
    Document   : Buy
    Created on : Jun 6, 2022, 9:53:16 PM
    Author     : Pisano
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!--Favicon-->
        <link rel="icon" type="image/png" href="image/faviconLogo.png" />
        <title>Pay</title>

        <jsp:useBean id="c" class="dao.DAO"></jsp:useBean>

            <!-- Bootstrap CSS -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
                  integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
            <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
            <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

            <title>Total price and payment</title>
        </head>
        <body>
            <script>
                function cityChange(cityName) {
                    var shipPrice = document.getElementById("city").value;
                    document.getElementById("shipValue").innerHTML = shipPrice;

                    $.ajax({
                        url: "/Assignment_ElectronicShop_Pro/buy",
                        type: "post", //send it through get method
//                        data: {
//                            cityName: cityName
//                        },
//                        success: function (data) {
//                            var total = document.getElementById("total");
//                            document.getElementById("city").value;
//                            document.getElementById("shipValue").innerHTML = shipPrice;
//                            total+shipPrice = data;
//                        },
//                        error: function (xhr) {
//                            //Do Something to handle error
//                        }
                    });
                }
            </script>
        <jsp:include page="Menu.jsp"></jsp:include>

            <!--Main layout-->
            <main class="mt-5 pt-4">
                <div class="container wow fadeIn">

                    <!-- Heading -->
                    <h2 class="my-5 h2 text-center">Total price and payment</h2>

                    <!--Grid row-->
                    <div class="row">

                        <!--Grid column-->
                        <div class="col-md-8 mb-4">

                            <!--Card-->
                            <div class="card">

                                <!--Card content-->
                                <form class="card-body" action="finish" method="post">

                                    <!--Grid row-->
                                    <div class="row">

                                        <!--Grid column-->
                                        <div class="col-md-6 mb-2">

                                            <!--firstName-->
                                            <div class="md-form ">
                                                <label for="firstName" class="">First name</label>
                                                <input type="text" id="firstName" class="form-control" required>
                                                
                                            </div>

                                        </div>
                                        <!--Grid column-->

                                        <!--Grid column-->
                                        <div class="col-md-6 mb-2">

                                            <!--lastName-->
                                            <div class="md-form">
                                                <label for="lastName" class="">Last name</label>
                                                <input type="text" id="lastName" class="form-control" required>
                                                
                                            </div>

                                        </div>
                                        <!--Grid column-->

                                    </div>
                                    <!--Grid row-->
                                    <br>

                                    <!--email-->
                                    <div class="md-form mb-5">
                                        <label for="email" class="">Email</label>
                                        <input type="text" id="email" class="form-control" placeholder="youremail@example.com" required>
                                        
                                    </div>

                                    <div class="md-form mb-5">
                                        <label for="city">City</label>
                                        <select class="form-select" aria-label="Default select example" name="city" onchange="cityChange(this.options[this.selectedIndex].text)" id="city">
                                        <c:forEach items="${listShip}" var="o">
                                            <option value="${o.shipPriceWithDot}">${o.cityName}</option>
                                        </c:forEach>
                                    </select>
                                </div>

                                <!--address-->
                                <div class="md-form mb-5">
                                    <label for="address" class="">Address</label>
                                    <input type="text" id="address" class="form-control" placeholder="1234 Main St" required>
                                    
                                </div>

                                <hr>
                                <h4>Phương thức thanh toán:</h4>
                                <div class="d-block my-3">
                                    <div class="custom-control custom-radio">
                                        <input id="ship" name="paymentMethod" type="radio" class="custom-control-input"
                                               checked required>
                                        <label class="custom-control-label" for="ship">Ship COD</label>
                                    </div>

<!--                                    <div class="custom-control custom-radio">
                                        <input id="credit" name="paymentMethod" type="radio" class="custom-control-input"
                                               required>
                                        <label class="custom-control-label" for="credit">Credit card</label>
                                    </div>
                                    <div class="custom-control custom-radio">
                                        <input id="debit" name="paymentMethod" type="radio" class="custom-control-input"
                                               required>
                                        <label class="custom-control-label" for="debit">Debit card</label>
                                    </div>
                                    <div class="custom-control custom-radio">
                                        <input id="paypal" name="paymentMethod" type="radio" class="custom-control-input"
                                               required>
                                        <label class="custom-control-label" for="paypal">Paypal</label>
                                    </div>-->
                                </div>
<!--                                <div class="row">
                                    <div class="col-md-6 mb-3">
                                        <label for="cc-name">Name on card</label>
                                        <input type="text" class="form-control" id="cc-name" placeholder="">
                                        <small class="text-muted">Full name as displayed on card</small>
                                        <div class="invalid-feedback">
                                            Name on card is required
                                        </div>
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <label for="cc-number">Credit card number</label>
                                        <input type="text" class="form-control" id="cc-number" placeholder="">
                                        <div class="invalid-feedback">
                                            Credit card number is required
                                        </div>
                                    </div>
                                </div>-->
                                <hr class="mb-4">
                                <button class="btn bg-secondary text-white btn-lg btn-block" type="submit">Checkout</button>

                            </form>

                        </div>
                        <!--/.Card-->

                    </div>
                    <!--Grid column-->

                    <!--Grid column-->
                    <div class="col-md-4 mb-4">

                        <!-- Heading -->
                        <h4 class="d-flex justify-content-between align-items-center mb-3">
                            <span class="text-muted">Your cart</span>
                            <span class="badge badge-secondary badge-pill">${c.countNumCart(sessionScope.acc.id)}</span>
                        </h4>
            <style>
                    p.wordpositive {
                        word-spacing: 100px;
                    }

            </style>

                    <p class="wordpositive">
                            <th>Amount</th>
                            <th>Name</th>
                            <th>Price</th>
                    </p>
                        <!-- Cart -->
                        
                        <ul class="list-group mb-3 z-depth-1">
                            <c:forEach items="${listCart}" var="o">
                                <li class="list-group-item d-flex justify-content-between lh-condensed">
                                    <div>
                                        <h5 class="my-0">${o.amount}&emsp;&emsp;</h5>
                                    </div>
                                    <div>
                                        <h5 class="my-0">${o.p.name}</h5>
                                    </div>
                                    <span class="text-muted">${o.p.price} VND</span>
                                </li>
                            </c:forEach>
                                        
                            
                            <li class="list-group-item d-flex justify-content-between">
                                <strong>Total</strong>
                                <span class="text-muted" id="total" >${total} VND</span              
                            </li>
                            
                            
                            <li class="list-group-item d-flex justify-content-between">
                                <strong>Ship Price</strong>
                                <span class="text-muted" id="shipValue">120.000</span>
                            </li>  
                        </ul>
                        <!-- Cart -->

                    </div>
                    <!--Grid column-->

                </div>
                <!--Grid row-->

            </div>
        </main>
        <!--Main layout-->

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
        crossorigin="anonymous"></script>
    </body>

</html>

