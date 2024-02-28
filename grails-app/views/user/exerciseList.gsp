<html>
<head>
    <title>exercise list</title>
</head>
<body>
    <h1>Bienvenido, ${user.name}</h1>
    <h1>lista, ${exercises}</h1>
    <table class="table">
        Mis ejercicios:
        <g:each in="${exercises}" var="exercise">
            <h4>${exercise.exerciseName()}</h4>
        </g:each>
        lpmqmp
    </table>

    <a href="${createLink(controller: 'exercise', action: 'addExercise', params: [id: user.id])}">Agregar ejercicios</a>
</body>
</html>
