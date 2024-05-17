<html>
<head>
    <title>Crear lista de ejercicios</title>
</head>
<body>
<h1>Bienvenido, ${user.getName()}</h1>
<h1>listas: ${exerciseLists}</h1>
<table class="table">
    Mis listas:
    <g:each in="${exerciseLists}" var="lists">
        <h4>${lists.getName()}</h4>
    </g:each>
    lpmqmp
</table>

<a href="${createLink(controller: 'user', action: 'createList', params: [id: user.getId()])}">Crear lista</a>
</body>
</html>
