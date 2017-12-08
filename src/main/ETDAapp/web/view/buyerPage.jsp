<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>ขอ้มูลของผู้ซื้อ</h2>
        <h4>
        <table width="400">
            <tr>
                <td>รหัสผู้ค้า</td>
                <td><input type="text" name="buyerId" size="30" /></td>
            </tr>
            <tr>
                <td>รหัสผู้ค้าสากล</td>
                <td><input type="text" name="buyerGlobalId" size="30" /></td>
            </tr> 
            <tr>
                <td>ชื่อผู้ซื้อ</td>
                <td><input type="text" name="buyerName" size="30" /></td>
            </tr>
            <tr>
                <td>อีเมล</td>
                <td><input type="text" name="buyerEmail" value="" size="30" /></td>
            </tr>
            <tr>
                <td>เลขประจำตัวผู้เสียภาษีอากร</td>
                <td><input type="text" name="buyerTaxId" size="30" /></td>
            </tr>    
        </table>
        </h4>
    </body>
</html>
