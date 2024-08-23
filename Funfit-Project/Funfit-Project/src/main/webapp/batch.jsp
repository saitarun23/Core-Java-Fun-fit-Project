<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Funfit Batch Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            color: #333;
            margin: 0;
            padding: 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
            min-height: 100vh;
        }
        h2 {
            font-size: 28px;
            color: #4CAF50;
            margin-bottom: 20px;
            text-align: center;
        }
        .nav-links {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            gap: 15px;
            margin-bottom: 40px;
        }
        .nav-links a {
            font-size: 16px;
            color: #fff;
            background-color: #0066cc;
            text-decoration: none;
            padding: 10px 20px;
            border: 2px solid #0066cc;
            border-radius: 5px;
            transition: background-color 0.3s ease, transform 0.3s ease;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .nav-links a:hover {
            background-color: #005bb5;
            transform: translateY(-2px);
        }
        .back-link {
            font-size: 16px;
            color: #fff;
            background-color: #ff6600;
            text-decoration: none;
            padding: 10px 20px;
            border: 2px solid #ff6600;
            border-radius: 5px;
            transition: background-color 0.3s ease, transform 0.3s ease;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        .back-link:hover {
            background-color: #e65c00;
            transform: translateY(-2px);
        }
    </style>
</head>
<body>
    <h2>Funfit Batch Management</h2>

    <div class="nav-links">
        <a href="add_batch.jsp">Add Batch</a>
        <a href="delete_batch.jsp">Delete Batch</a>
        <a href="update_batch.jsp">Update Batch</a>
        <a href="BatchViewController">View Batch</a>
    </div>

    <a href="index.html" class="back-link">Back</a>
</body>
</html>
