<html>
<head>
    <title>routine list</title>
</head>
<body>
    <h1>Bienvenido, ${user.name}</h1>
    <table class="table">
        Mis rutinas:
        <g:each in="${routines}" var="routines">
            <h4>${routines}</h4>
        </g:each>
        lpmqmp
    </table>
    <a href="${createLink(controller: 'routine', action: 'createRoutine', params: [id: user.id])}">Crear Rutina</a>
</body>
</html>
