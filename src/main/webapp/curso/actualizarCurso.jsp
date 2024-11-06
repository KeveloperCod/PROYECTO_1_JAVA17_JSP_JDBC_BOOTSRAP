<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Actualizar Curso</title>
 	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-5">
	    <div class="row">
	        <div class="col-md-10 offset-md-3">   
				    <form id="frmRegistroCursos" action="cursoServlet" method="post" >
				        <h2 class="mb-4">Actualizar Curso</h2>
				        <div class="row">
				            <div class="col-md-6">
				              
				                 <br>
				                <div class="form-group">
				                    <label for="txtNombre">Código del Curso</label>
				                    <input type="text" class="form-control" id="txtCodigo" name="txtCodigo">
				                </div>
				                <br>
				                <div class="form-group">
				                    <label for="txtNombre">Nombre del Curso</label>
				                    <input type="text" class="form-control" id="txtNombre" name="txtNombre">
				                </div>
				              	<br>
				                <div class="form-group">
				                    <label for="cboNivel">Nivel del Curso</label>
				                    <select class="form-control" id="cboNivel" name="cboNivel">
				                        <option value="1">Básico</option>
				                        <option value="2">Intermedio</option>
				                        <option value="3">Avanzado</option>
				                    </select>
				                </div>
				                 <br>
				                <div class="form-group">
				                    <label for="cboModalidad">Modalidad del Curso</label>
				                    <select class="form-control" id="cboModalidad" name="cboModalidad">
				                        <option value="1">Presencial</option>
				                        <option value="2">Virtual</option>
				                        <option value="3">Híbrido</option>
				                    </select>
				                </div>
				                 <br>
				                <div class="form-group">
				                    <label for="txtCreditos">Núm. Créditos</label>
				                    <input type="number" class="form-control" id="txtCreditos" name="txtCreditos">
				                </div>
				                 <br>
				                 
				                 <div class="form-group">
				                    <label for="txtPrecio">Precio</label>
				                    <input type="text" class="form-control" id="txtPrecio" name="txtPrecio">
				                 </div>
				                 <br>
				                 
				                <div class="form-group"> 
						        	<button type="submit" name="opcion" value="act" class="btn btn-primary">Actualizar</button>
						        </div>	
						        
						        	  
						        	 
									   
				            </div>
				        </div>		        		        
				    </form>
	        </div>
	    </div>
	</div>
	
	
	
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $("#frmRegistroCursos").validate({
                rules: {
                	txtCodigo: "required",
                    txtNombre: "required",
                    cboNivel: "required",
                    cboModalidad: "required",
                    txtCreditos: "required",
                    txtPrecio: {
                        required: true,
                        number: true,  // Asegura que el valor sea un número
                    }
                },
                messages: {
                	txtCodigo: "Ingrese el codigo del curso",
                    txtNombre: "Ingrese el nombre del curso",
                    cboNivel: "Seleccione el nivel del curso",
                    cboModalidad: "Seleccione la modalidad del curso",
                    txtCreditos: "Ingrese el número de créditos",
                    txtPrecio: {
                        required: "Ingrese el precio",
                        number: "Ingrese un número válido para el precio",
                    }
                },
                errorElement: "span",
                errorPlacement: function(error, element) {
                    error.addClass("invalid-feedback");
                    element.closest(".form-group").append(error);
                },
                highlight: function(element, errorClass, validClass) {
                    $(element).addClass("is-invalid").removeClass("is-valid");
                },
                unhighlight: function(element, errorClass, validClass) {
                    $(element).removeClass("is-invalid").addClass("is-valid");
                },
                submitHandler: function(form) {
                    form.submit();
                }
            });
        });
    </script>
</body>
</html>