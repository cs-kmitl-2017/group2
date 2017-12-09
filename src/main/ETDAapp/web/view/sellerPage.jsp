<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ใบกำกับภาษีสำหรับผู้ขาย</title>
    </head>
    <body>
        <h2>ข้อมูลสำหรับผู้ขาย</h2>
        <h4>
        <table width="400">
            <tr>
                <td>รหัสผู้ค้า</td>
                <td><input type="text" name="sellerId" size="30" /></td>
            </tr>
            <tr>
                <td>รหัสผู้ค้าสากล</td>
                <td><input type="text" name="sellerGlobalId" size="30" /></td>
            </tr> 
            <tr>
                <td>ชื่อผู้ขาย</td>
                <td><input type="text" name="sellerName" size="30" /></td>
            </tr>
            <tr>
                <td>อีเมล</td>
                <td><input type="text" name="sellerEmail" value="" size="30" /></td>
            </tr>
            <tr>
                <td>เลขประจำตัวผู้เสียภาษีอากร</td>
                <td><input type="text" name="sellerTaxId" size="30" /></td>
            </tr>    
        </table>
        </h4> 
    </body>
</html>
