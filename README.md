# Иструкция по запуску:
1. Заходим в корень проекта /sovcom и выполняем команду mvn clean install
2. Далее для развертывания микросервисов в докере используем комманду docker-compose up --build
3. По адресу localhost:8084 находится Eureka, проверяем доступны ли данные сервисы
       EMAIL-SERVICE	
       GATEWAY-SERVICE	
       PUSH-SERVICE	
       SMS-SERVICE
4. По адресу localhost:8080 находится Spring Cloud Gateway, через который мы и будем слать уведомления:
       Для отправки уведомлений на email используем uri: localhost:8080/email/notification
       Для отпрвки уведомлений через sms: localhost:8080/sms/notification
       Для отпрвки push уведомлений: localhost:8080/push/notification
