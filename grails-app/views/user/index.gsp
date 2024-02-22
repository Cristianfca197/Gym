<html>
<head>
    <title>Index</title>
</head>
<body>
<h1>Bienvenido, ${user.name}</h1>
<a href="${createLink(controller: 'user', action: 'exerciseList', params: [id: user.id])}">Mis ejercicios</a>
<a href="${createLink(controller: 'user', action: 'routineList')}">Mis rutinas</a>
<a href="${createLink(controller: 'user', action: 'programList')}">Mis programas</a>
</body>
</html>
