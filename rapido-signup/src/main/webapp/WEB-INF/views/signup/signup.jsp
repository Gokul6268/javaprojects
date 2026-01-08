<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido Signup</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #f5f7fa;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .card {
        background: #ffffff;
        padding: 35px;
        border-radius: 12px;
        width: 350px;
        box-shadow: 0 6px 15px rgba(0,0,0,0.12);
    }
    h2 {
        text-align: center;
        color: #ffcc00;
        margin-bottom: 25px;
    }
    label {
        font-weight: bold;
        display: block;
        margin-bottom: 6px;
    }
    input[type="text"] {
        width: 100%;
        padding: 10px;
        border-radius: 6px;
        border: 1px solid #ccc;
        margin-bottom: 18px;
        font-size: 14px;
    }
    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background: #ffcc00;
        border: none;
        border-radius: 6px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background: #f1c400;
    }
</style>

</head>
<body>

<div class="card">
    <h2>Rapido Signup</h2>

    <form action="signup" method="post">
        <label>Mobile Number</label>
        <input type="text" name="mobile" placeholder="Enter mobile number">

        <label>Email</label>
        <input type="text" name="email" placeholder="Enter email">

        <label>Name</label>
        <input type="text" name="name" placeholder="Enter your name">

        <input type="submit" value="Signup">
    </form>
</div>

</body>
</html>
