<html>
<head>
    <title>Main</title>
    <script>
        function toggleSection(sectionId) {
            var section = document.getElementById(sectionId);
            section.style.display = (section.style.display === 'none') ? 'block' : 'none';
        }
    </script>
</head>
<body>
    <h1>Bienvenido, ${user.name}</h1>
    <a href="javascript:void(0);" onclick="toggleSection('lists')">Mostrar/Ocultar Ejercicios</a>
    <a href="${createLink(controller: 'user', action: 'exerciseList', params: [id: user.id])}">Mis ejercicios</a>
    <a href="${createLink(controller: 'user', action: 'routineList')}">Mis rutinas</a>
    <a href="${createLink(controller: 'user', action: 'programList')}">Mis programas</a>

    <div id="lists" style="display: none;">
        <h2>Listas de ejercicios</h2>

        Mis listas:
        <g:each in="${exerciseLists}" var="lists">
            <h3>${lists.getName()}</h3>
        </g:each>

        <a href="javascript:void(0);" onclick="toggleSection('createList')">Mostrar/Ocultar Ejercicios</a>
        <div id="createList" style="display: none;">
            <g:form action="createList">
                <g:hiddenField name="userId" value="${user.id}"/>
                Nombre:<input type="text" id="name" name="name" /><br/>

                Selecciona los ejercicios:
                <g:each in="${exercises}" var="exercise">
                    <label>
                        <input type="checkbox" name="selectedExercises" value="${exercise.id}" />
                        ${exercise.name}
                    </label>
                </g:each>

                <g:submitButton name="submitBtn" value="Enviar Formulario" />

            </g:form>
        </div>
    </div>
</body>
</html>
