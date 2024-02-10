<html>
<body>
<h1>Crear Ejercicio</h1>
<g:form controller="Exercise" action="save">
    <label for="nombre">Nombre:</label>
    <g:textField name="nombre" value="${exercise?.name}" />

    <label>Tipo de ejercicio:
        <select name="typeExercise">
            <option value="Weight">Peso</option>
            <option value="Cardio">Cardio</option>
        </select>
    </label>

    <g:submitButton name="createExercise" value="Guardar" />
</g:form>
</body>
</html>
