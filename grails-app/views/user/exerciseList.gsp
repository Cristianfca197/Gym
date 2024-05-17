<html>
<head>
    <title>exercise list</title>
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
    <h1>User Id: ${user.getId()}</h1>
    <a href="${createLink(controller: 'user', action: 'createList', params: [id: user.id])}">Crear lista</a>
</body>
</html>
