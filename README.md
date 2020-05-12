# Я использовал IDE IntelJ Idea для разработки, прилагаю инструкцию.
# Иструкция по запуску:
# 1. Заходим в File/Open и импортируем любой из пяти доступных проектов как Maven Project
# 2. Далее File/Project Structure/Modules нажимаем на +/Import Module и импортируем оставшиеся модули.
# 3. Запускаем по порядку приложения: SovcomEurekaServerApplication, SovcomEmailServiceApplication, SovcomPushServiceApplication, SovcomSmsServiceApplication, SovcomCloudGatewayApplication
# 4. По адресу localhost:8084 находится сервер Spring Cloud, здесь можно проверить запустились ли остальные сервисы, нас интересуют EMAIL-SERVICE, PUSH-SERVICE, SMS-SERVICE, GATEWAY-SERVICE
# 5. По адресу localhost:8080 расположен Spring GateWay, именно через него мы будем отправвлять запросы на рассылку уведомлений
# 6. Для отправки уведомлений на email используем uri: localhost:8080/email/notification
#    Для отпрвки уведомлений через sms: localhost:8080/sms/notification
#    Для отпрвки push уведомлений: localhost:8080/push/notification
