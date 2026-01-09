<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking Confirmation</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #e8f5e9, #c8e6c9);
        height: 100vh;
        margin: 0;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .success-card {
        background: #fff;
        padding: 30px 40px;
        border-radius: 12px;
        text-align: center;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
    }
    h2 {
        color: #2e7d32;
        margin-bottom: 15px;
    }
    .code {
        font-size: 22px;
        font-weight: bold;
        color: #ff6f00;
        margin-top: 10px;
    }
    a {
        display: inline-block;
        margin-top: 20px;
        text-decoration: none;
        color: #fff;
        background: #ffb300;
        padding: 10px 20px;
        border-radius: 6px;
        font-weight: bold;
    }
    a:hover {
        background: #ffa000;
    }
</style>
</head>

<body>
<div class="success-card">
    <h2>✅ Booking Confirmed!</h2>
    <p>Your ride has been successfully booked.</p>
    <p>Your Booking Code:</p>
    <div class="code">${bookingConfirmationCode}</div>

    <a href="viewBooking">Book Another Ride</a>
</div>
</body>
</html>
