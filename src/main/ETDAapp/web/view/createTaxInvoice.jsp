<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ออกใบกำกับภาษีอิเล็กทรอนิกส์</title>
    </head>
    <body>
        <form action="#" method="post">
            <jsp:include page="buyerPage.jsp" />
            <jsp:include page="sellerPage.jsp" />
            <input type="submit" value="ออกใบกำกับภาษี" name="Submit" />
        </form>    
    </body>
</html>

