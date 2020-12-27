<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Услуги</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <script src="http://code.jquery.com/jquery-2.2.4.js"
            type="text/javascript"></script>
</head>
<body>
<div class="container">
    <table class="table table-striped">
        <thead class="thead-dark">
        <th scope="row">Номер услуги</th>
        <th scope="row">Наименование услуги</th>
        <th scope="row">Дата</th>
        <th scope="row">Имя заказчика</th>
        <th scope="row">Статус</th>
        <th scope="row">Телефон</th>
        <th scope="row">Цена</th>
        </thead>
        <tbody>
        <c:forEach items="${orders}" var="order" >
            <tr>
                <td>${order.id}</td>
                <td>${order.nameOrder}</td>
                <td>${order.dateOrder}</td>
                <td>${order.nameCustomer}</td>
                <td>${order.status}</td>
                <td>${order.mobile}</td>
                <td>${order.cost}</td>
                <td>
                    <spring:url value="/editOrder/${order.id}" var="editURL" />
                    <a class="btn btn-info" href="${editURL}" role="button" >Обновить</a>
                </td>
                <td>
                    <spring:url value="/deleteOrder/${order.id}" var="deleteURL" />
                    <a class="btn btn-danger" href="${deleteURL}" role="button" >Удалить</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <spring:url value="/addOrder/" var="addURL" />
    <a class="btn btn-success" href="${addURL}" role="button" >Добавить запись</a>
</div>
</body>
</html>