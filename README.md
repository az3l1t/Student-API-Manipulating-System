# Student-API-Manipulating-System
API написанный вручную на языке программирования Java с использованием фреймворка Spring Boot и его дочерних библиотек для работы с базой данных Postgre.
Был использован архитектурный стиль REST, работа производилась с помощью формата JSON.
У системы есть своя архитектура состоящая из нескольких связанных друг с другом блоков: API,Service,Data Access и сама база данных Postgre.
Система работает с базой данных студентов и имеет функции просмотра студентов, добавление студентов непосредственно в базу данных, удаление студентов и изменение данных студента:
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/fcbd8015-4dde-4126-b5fa-53069fd5d153)
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/8f7ca171-f8dc-4ac7-86d4-1626217fed90)
# Зачем нужна эта система?
Данная система может стать отличной основой для создания своего IT-приложения для любого университета. В ней заложена база работы со студентами и самой базой данных, 
которую можно использовать как базу для различных систем оценивания студентов. Саму БД можно разместить на сервере, чтобы она работала в определенное время, 
и администратор сможет манипулировать любыми данными.

# Тестирование
Тестирование сервиса происходило в приложении Postman. Были отправлены запросы на локальный сервер: GET,POST,DELETE,PUT:
# GET
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/9a0820c1-cc9f-42e0-b668-b71fe8c48833)
# POST
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/0221e793-f4bb-4afc-a6c2-9877be9e8e9d)
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/bcb91f98-54da-4ce8-ae83-efe39655c166)
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/6263037f-7b8d-4c81-bf4c-f5e1f2d2120a)
# DELETE
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/ee83a3a6-4e01-4a40-8694-ff8f66bb9d31)
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/b065bb2f-4218-406d-99dd-3d37a36836a1)
# PUT
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/e187179c-4985-4086-9e99-e065ad69a301)

# База данных
Сама база данных также модернизиловалась с реальном времени при отправке запросов через Postman:
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/06efd4ca-766c-4430-8aa9-c73c47ccc04e)
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/e8c2df0f-1691-421b-a2c2-5ceefc4e1c5f)
![image](https://github.com/az3l1t/Student-API-Manipulating-System/assets/126178814/7b928714-12e7-4a70-b254-51dabbbf2f2c)

# Будущее
В дальнейшем времени система может быть улучшена добавлением UI для работы со студентами через web-приложение.

