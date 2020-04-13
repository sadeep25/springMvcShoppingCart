<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
    <title>Login Page</title>
    <link type="text/css"  href="<c:url value="/resources/css/styles.css" />"
          rel="stylesheet">
    <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
</head>
<body onload='document.loginForm.username.focus();'>
    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <c:if test="${not empty msg}">
        <div class="msg">${msg}</div>
    </c:if>
    <div class="container login-container">
        <div class="row">
            <div class="login-form-1">
                <h3>Login for Form 1</h3>
                <form name='loginForm'
                action="<c:url value='/login' />" method='POST'>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Your Email *" name='username' />
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Your Password *" name='password' />
                    </div>
                    <div class="form-group">
                        <input type="submit" class="btnSubmit" value="Login" />
                    </div>
                    <div class="form-group">
                        <a href="#" class="ForgetPwd">Forget Password?</a>
                    </div>
                    <input type="hidden" name="${_csrf.parameterName}"
                           value="${_csrf.token}" />
                </form>
            </div>
        </div>
    </div>

    <script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</body>
</html>