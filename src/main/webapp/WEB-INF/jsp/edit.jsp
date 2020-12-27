<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Добавить услугу</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <script src="http://code.jquery.com/jquery-2.2.4.js"
            type="text/javascript"></script>
</head>
<body>
<div class="container">

    <h2>Обновить информацию</h2>
    <form  method="post" action="/Update">
        <div class="form-group">
            <input type="hidden" value="${order.id}" name="id">
            <label for="nameorder">Название услуги</label>
            <input type="text" class="form-control" id="nameorder" name="nameOrder"  value="${order.nameOrder}" >

            <div class="form-group">
                <label for="dateorder">Дата</label>
                <input type="date" class="form-control" id="dateorder" name="dateOrder" value="${order.dateOrder}" >

            </div>
            <div class="form-group">
                <label for="namecustomer">Имя и Фамилия заказчика</label>
                <input type="text" class="form-control" id="namecustomer"  name="nameCustomer" value="${order.nameCustomer}">

            </div>
            <div class="form-group">
                <label for="status">Статус</label>
                <input type="text" class="form-control" id="status" name="status" value="${order.status}">

            </div>
            <div class="form-group">
                <label for="mobile">Телефон</label>
                <input type="text" class="form-control" id="mobile"  name="mobile" value="${order.mobile}">

            </div>
            <div class="form-group">
                <label for="cost">Цена</label>
                <input type="text" class="form-control" id="cost" name="cost" value="${order.cost}">

            </div>

            <br><br>
            <button type="submit" class="btn btn-primary">Обновить</button>
        </div></form>

</div>
</body>
</html>