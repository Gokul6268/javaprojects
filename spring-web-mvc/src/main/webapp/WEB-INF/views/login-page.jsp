<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Zepto Login</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: #f6f6f6;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .login-box {
        background: #fff;
        width: 320px;
        padding: 25px;
        border-radius: 10px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
    }
    .login-box h2 {
        text-align: center;
        color: #6a1b9a;
        margin-bottom: 20px;
    }
    .login-box input {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border-radius: 5px;
        border: 1px solid #ccc;
    }
    .login-box button {
        width: 100%;
        padding: 10px;
        background: #6a1b9a;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
    }
    .login-box button:hover {
        background: #5a148a;
    }
</style>
</head>
<body>

<div class="login-box">
   <h2>Zepto Login</h2>
    <input type="text" placeholder="User ID / Mobile Number">
    <input type="password" placeholder="Password">
    <button>Login</button>
</div>

</body>
</html>
