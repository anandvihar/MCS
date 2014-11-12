<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:c="http://java.sun.com/jsp/jstl/core">


<h:head>

    <meta charset="utf-8"></meta>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"></meta>
    <meta name="viewport" content="width=device-width, initial-scale=1"></meta>
    <title>MCS</title>

    <!-- Bootstrap Core CSS -->
    <h:outputStylesheet href="css/bootstrap.min.css" ></h:outputStylesheet>

    <!-- MetisMenu CSS -->
    <h:outputStylesheet href="css/plugins/metisMenu/metisMenu.min.css" ></h:outputStylesheet>

    <!-- Custom CSS -->
    <h:outputStylesheet href="css/sb-admin-2.css"></h:outputStylesheet>

    <!-- Custom Fonts -->
    <h:outputStylesheet href="font-awesome-4.1.0/css/font-awesome.min.css" ></h:outputStylesheet>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</h:head>

<h:body>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
                       <h:form> 
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="E-mail" name="email" type="email" autofocus="true"></input>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="password" type="password" value=""></input>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me</input>
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <a href="index.html" class="btn btn-lg btn-success btn-block">Login</a>
                            </fieldset>
                        </h:form>

                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- jQuery Version 1.11.0 -->
    <h:outputScript library="js" name="js/jquery-1.11.0.js"></h:outputScript>

    <!-- Bootstrap Core JavaScript -->
    <h:outputScript library="js" name="js/bootstrap.min.js"></h:outputScript>

    <!-- Metis Menu Plugin JavaScript -->
    <h:outputScript library="js" name="js/plugins/metisMenu/metisMenu.min.js"></h:outputScript>

    <!-- Custom Theme JavaScript -->
    <h:outputScript library="js" name="js/sb-admin-2.js"></h:outputScript>

</h:body>

</html>