SELECT password FROM Usuarios WHERE usuario = 'Forest' --Consulta individual

INSERT INTO Usuarios VALUES ('Ruth', 'qwerty', 2) --Dar de Alta

SELECT * FROM  Usuarios --Consulta general

UPDATE Usuarios SET password = 'password' WHERE usuario = 'Ruth' --Modificaciones

DELETE FROM Usuarios WHERE usuario = 'Ruth' --Eliminar datos
