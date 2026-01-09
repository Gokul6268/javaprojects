<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido Booking</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #ffd54f, #ffb300);
        height: 100vh;
        margin: 0;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .form-card {
        background: #fff;
        padding: 30px 40px;
        border-radius: 12px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        width: 350px;
    }
    h2 {
        text-align: center;
        margin-bottom: 25px;
    }
    label {
        font-weight: bold;
        display: block;
        margin-top: 15px;
    }
    input[type="text"] {
        width: 100%;
        padding: 8px;
        margin-top: 5px;
        border-radius: 5px;
        border: 1px solid #ccc;
    }
    .radio-group {
        margin-top: 10px;
    }
    .radio-group input {
        margin-right: 5px;
    }
    .btn {
        margin-top: 25px;
        width: 100%;
        padding: 10px;
        background: #ffb300;
        border: none;
        font-weight: bold;
        border-radius: 6px;
        cursor: pointer;
        font-size: 16px;
    }
    .btn:hover {
        background: #ffa000;
    }
</style>
</head>

<body>
<div class="form-card">
    <h2>🚕 Book Rapido Ride</h2>

    <form action="bookMyRide" method="post">
        <label>Source</label>
        <input type="text" name="source" required>

        <label>Destination</label>
        <input type="text" name="destination" required>

        <label>Ride Type</label>
        <div class="radio-group">
            <input type="radio" name="type" value="bike" required> Bike
            <input type="radio" name="type" value="car"> Car
            <input type="radio" name="type" value="auto"> Auto
        </div>

        <input type="submit" value="Book Ride" class="btn">
    </form>
</div>
</body>
</html>
