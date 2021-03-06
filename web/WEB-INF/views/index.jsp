<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <script src="http://code.jquery.com/jquery.min.js"></script>   
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <body>
        
     <div class="container">
            <table class="table table-bordered table-hover table-hover table-responsive">
                <tr>
                    <th>Product ID</th>
                    <th>Product Name</th>
                    <th>Type</th>
                    <th>Company</th>
                    <th>Price</th>
                    <th>Expiry Date</th>
                </tr>
                
                <c:forEach var="product" items="${productList}" >
                    <tr>
                        <td><a href="SpringCommerceApp/product/${product.productId}">${product.productId}</a></td>
                        <td><strong>${product.productName}</strong></td>
                        <td>${product.productType}</td>
                        <td>${product.productCompany}</td>
                        <td>Nrs. ${product.price}</td>
                        <td>${product.expiryDate}</td>
                    </tr>    
                </c:forEach>  
                        
          </table> 

        </div>
    </body>
</html>
