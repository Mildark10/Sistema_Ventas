<%-- 
    Document   : index
    Created on : 5 ago. 2024, 19:32:36
    Author     : Milton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body style="background-color:#e6e6fa">

        <div class="container d-flex justify-content-center align-items-center vh-100">
            <div class="card shadow-lg p-3 mb-5 bg-body rounded">
                <div class="card-body">
                    <form action="ValidarUsuario" method="post">
                        <div class="text-center mb-4">
                            <h3>Login</h3>
                            <img src="img/logo.jpg" alt="Logo" class="img-fluid" width="70" />
                            <p class="mt-3 fw-bold ">Bienvenidos al Sistema</p>
                        </div>
                        
                        <div class="mb-3">
                            <label for="txtuser" class="form-label">Usuario:</label>
                            <input type="text" id="txtuser" name="txtuser" class="form-control" placeholder="Ingrese su usuario" />
                        </div>
                        
                        <div class="mb-3">
                            <label for="txtpass" class="form-label">Password:</label>
                            <input type="password" id="txtpass" name="txtpass" class="form-control" placeholder="Ingrese su contraseña" />
                        </div>
                        
                        <button type="submit" name="accion" value="ingresar" class="btn btn-primary w-100">Ingresar</button>
                    </form>
                </div>
            </div>
        </div>

    </body>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
</html>
