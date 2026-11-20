### Invest News Tracker

Приложения для сбора инвест новостей из разных источников.

### Структура backend

Backend — Gradle мультипроект на Spring Boot 4 и Java 25.

```
backend/
├── build-logic/          # convention-плагины Gradle
│   └── spring-conventions  # общая настройка Spring Boot модулей
├── raw-news-scrapper/    # сервис сбора «сырых» новостей из источников
├── events-store/         # сервис хранения событий (новостей)
├── gradle/
│   ├── config/           # общие конфиги сборки
│   └── libs.versions.toml  # версии зависимостей (version catalog)
├── settings.gradle.kts   # корневой settings: подключение модулей
```