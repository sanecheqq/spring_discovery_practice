### Приложение eureka_server
_Spring Discovery Server_, в котором будут регистрироваться остальные приложения при их запуске.

### Приложение app1
Дефолтное _Spring Boot_ приложение с одной get-ручкой `ping`. При запуске, соответственно, регистрируется на сервере Eureka.

### Приложение ping_app1
Приложение для тестирования коннекта с `app1` посредством его пинга. Имеет ручку `ping-app1`, при вызове которой отправляется запрос на _Eureka Server_,
а затем отправляется _get-запрос_ на /ping на один из запущенных инстансов приложения app1.
Как результат корректной взаимосвязи между приложениями ожидается ответ "pong".


В _docker-compose_ в переменной `EUREKA_HOST` указан image-id докер-контейнера eureka_server. При (пере-)создании этого контейнера id в переменных нужно поменять.