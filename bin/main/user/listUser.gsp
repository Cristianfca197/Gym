<html>
    <head>
        <title>List Users</title>
    </head>
    <body>
        <g:each in="${users}" var="user">
            ${user.name}

        </g:each>
    </body>
</html>