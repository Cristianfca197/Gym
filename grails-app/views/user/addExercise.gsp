<html>
<head>
    <title>exercise list</title>
</head>
<body>
<h1>Bienvenido, ${user.name}</h1>
<form action="${createLink(controller: 'user', action: 'addSelectedExercises', params: [id: user.id])}" method="post">
    Peso:<br/>
    <g:each in="${exerWeight}" var="weight">
        <label>
            <input type="checkbox" name="selectedExercises" value="${weight.id}" />
            ${weight.name}
        </label>
        <br/>
    </g:each>
    Cardio:<br/>
    <g:each in="${exerCardio}" var="cardio">
        <label>
            <input type="checkbox" name="selectedExercises" value="${cardio.id}" />
            ${cardio.name}
        </label>
        <br/>
    </g:each>
    <button type="submit">Agregar Ejercicios Seleccionados</button>
</form>

</body>
</html>