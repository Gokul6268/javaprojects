<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error Page</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            padding: 40px;
        }
        .error-box {
            background: #fff;
            border-left: 5px solid #e74c3c;
            padding: 20px;
            max-width: 600px;
            color: #e74c3c;
            font-size: 16px;
        }
    </style>
</head>

<body>
    <div class="error-box">
        ${errorMessage}
    </div>
</body>
</html>
