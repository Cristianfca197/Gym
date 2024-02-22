<html>
<head>
    <title>exercise list</title>
</head>
<body>
    <h1>Bienvenido, ${user.name}</h1>
    <table class="table">
        Mis ejercicios:
        <g:each in="${exercises}" var="exercise">
            <tr class="table-primary">
                <td>${exercise.name}</td>
            </tr>
        </g:each>
    </table>

    <a href="${createLink(controller: 'exercise', action: 'addExercise', params: [id: user.id])}">Agregar ejercicios</a>
</body>
</html>
