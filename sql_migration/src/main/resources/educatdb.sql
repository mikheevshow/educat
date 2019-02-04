-- Скрипт наката базы данных educat
DROP DATABASE EDUCAT_DATABASE;
CREATE DATABASE EDUCAT_DATABASE;

--Таблицы, хранящие информацию о личных кабинетах
-- Личная карточка пользователей
DROP table USERS;
CREATE TABLE USERS
(
  ID              INT PRIMARY KEY,
  FIRST_NAME      VARCHAR(100) NOT NULL,
  SECOND_NAME     VARCHAR(100) NOT NULL,
  MIDDLE_NAME     VARCHAR(100),
  BIRTH_DATE      TIMESTAMP,
  EMAIL           VARCHAR(100) NOT NULL UNIQUE,
  EMAIL_CONFIRMED BOOLEAN      NOT NULL,
  PHONE           VARCHAR(100),
  VK_LINK         VARCHAR(100),
  FB_LINK         VARCHAR(100),
  INSTA_LINK      VARCHAR(100)
);
COMMENT ON TABLE USERS IS 'Таблица храняющая персональную информацию пользователей';
COMMENT ON COLUMN USERS.FIRST_NAME IS 'Имя пользователя';
COMMENT ON COLUMN USERS.SECOND_NAME IS 'Фамилия пользователя';
COMMENT ON COLUMN USERS.MIDDLE_NAME IS 'Отчество пользователя';
COMMENT ON COLUMN USERS.BIRTH_DATE IS 'Дата рождения пользователя';
COMMENT ON COLUMN USERS.EMAIL IS 'Электронный адрес пользователя';
COMMENT ON COLUMN USERS.EMAIL_CONFIRMED IS 'Подтвержденность электронного адреса';
COMMENT ON COLUMN USERS.PHONE IS 'Мобильный телефон пользователя';
COMMENT ON COLUMN USERS.VK_LINK IS 'Ссылка на профиль соц.сети ВКонтакте';
COMMENT ON COLUMN USERS.FB_LINK IS 'Ссылка на профиль соц.сети Facebook';
COMMENT ON COLUMN USERS.INSTA_LINK IS 'Ссылка на профиль соц.сети Instagram';


-- Личный кабинет пользователя
DROP TABLE ACCOUNTS;
CREATE TABLE ACCOUNTS
(
  ID               INT PRIMARY KEY,
  USERNAME         VARCHAR(100) NOT NULL UNIQUE,
  ACCOUNT_PASSWORD VARCHAR(100) NOT NULL,
  USER_ID          INT          NOT NULL UNIQUE REFERENCES USERS,
  STATUS           VARCHAR      NOT NULL,
  RATING           VARCHAR,
  CREATION_DATE    TIMESTAMP    NOT NULL,
  LAST_LOGIN_DATE  TIMESTAMP
);
COMMENT ON TABLE ACCOUNTS IS 'Таблица, содержащая основную информацию о личном кабинете';
COMMENT ON COLUMN ACCOUNTS.USERNAME IS 'Имя пользователя в системе';
COMMENT ON COLUMN ACCOUNTS.ACCOUNT_PASSWORD IS 'Пароль пользователя';
COMMENT ON COLUMN ACCOUNTS.USER_ID IS 'ID в таблице USERS';
COMMENT ON COLUMN ACCOUNTS.STATUS IS 'Статус пользователя в системе';
COMMENT ON COLUMN ACCOUNTS.RATING IS 'Рейтинг пользователя в системе';
COMMENT ON COLUMN ACCOUNTS.CREATION_DATE IS 'Дата регистрации пользователя';
COMMENT ON COLUMN ACCOUNTS.LAST_LOGIN_DATE IS 'Последняя дата входа';


-- Настройки, связанные с кастомизацией личного кабинета
DROP TABLE ACCOUNT_SETTINGS;
CREATE TABLE ACCOUNT_SETTINGS
(
  ID         INT NOT NULL UNIQUE,
  ACCOUNT_ID INT NOT NULL REFERENCES ACCOUNTS,
  PRIMARY KEY (ID, ACCOUNT_ID)
);


-- Роли
DROP TABLE ROLES;
CREATE TABLE ROLES
(
  ID               INT PRIMARY KEY,
  ROLE_NAME        VARCHAR(100) NOT NULL UNIQUE,
  ROLE_DESCRIPTION VARCHAR(100)
);
COMMENT ON TABLE ROLES IS 'Таблица, содержащая информацию о ролях в системе';
COMMENT ON COLUMN ROLES.ROLE_NAME IS 'Название роли';
COMMENT ON COLUMN ROLES.ROLE_DESCRIPTION IS 'Описание роли';

ALTER TABLE ACCOUNTS ADD ACCOUNT_ROLE_ID INT REFERENCES ROLES;
COMMENT ON COLUMN ACCOUNTS.ACCOUNT_ROLE_ID IS 'ID роли в таблице ROLES';

-- Права доступа
DROP TABLE PERMISSIONS;
CREATE TABLE PERMISSIONS
(
  ID                     INT PRIMARY KEY,
  PERMISSION             VARCHAR(100) NOT NULL,
  PERMISSION_DESCRIPTION VARCHAR(255)
);
COMMENT ON TABLE PERMISSIONS IS 'Таблица, содержащая информацию о правах в системе';
COMMENT ON COLUMN PERMISSIONS.PERMISSION IS 'Название права доступа';
COMMENT ON COLUMN PERMISSIONS.PERMISSION_DESCRIPTION IS 'Описание права доступа';


-- Права доступа для ролей
DROP TABLE ROLE_PERMISSIONS;
CREATE TABLE ROLE_PERMISSIONS
(
  ROLE_ID INT REFERENCES ROLES,
  PERM_ID INT REFERENCES PERMISSIONS,
  PRIMARY KEY (ROLE_ID,  PERM_ID)
);
COMMENT ON TABLE ROLE_PERMISSIONS IS 'Таблица, содеражащая информацию о доступных правах ролям';
COMMENT ON COLUMN ROLE_PERMISSIONS.ROLE_ID IS 'ID роли в таблице ROLES';
COMMENT ON COLUMN ROLE_PERMISSIONS.PERM_ID IS 'ID права в таблице PERMISSIONS';


-- Аудит изменений, связанных с личным кабинетом
DROP TABLE ACCOUNTS_HISTORY;
CREATE TABLE ACCOUNTS_HISTORY
(
  ID                INT PRIMARY KEY,
  ACCOUNT_ID        INT       NOT NULL REFERENCES ACCOUNTS,
  CHANGED_PARAMETER VARCHAR   NOT NULL,
  PARAMETER_VALUE   VARCHAR   NOT NULL,
  ASSIGNMENT_DATE   TIMESTAMP NOT NULL
);
COMMENT ON TABLE ACCOUNTS_HISTORY IS 'Таблица, содерщая историю изменений параметров пользователей';
COMMENT ON COLUMN ACCOUNTS_HISTORY.ACCOUNT_ID IS 'ID аккаунта в таблице ACCOUNTS';
COMMENT ON COLUMN ACCOUNTS_HISTORY.CHANGED_PARAMETER IS 'Название измененного парваметра';
COMMENT ON COLUMN ACCOUNTS_HISTORY.PARAMETER_VALUE IS 'Присвоенное значение параметру';
COMMENT ON COLUMN ACCOUNTS_HISTORY.ASSIGNMENT_DATE IS 'Дата изменения параметра';


-- Таблицы связанные с написанием статей/блогов
DROP TABLE ARTICLES;
CREATE TABLE ARTICLES
(
  ID            INT PRIMARY KEY,
  CREATION_DATE TIMESTAMP,
  HEADER        VARCHAR(300),
  CONTENT       VARCHAR,
  CREATOR_ID    INT NOT NULL REFERENCES ACCOUNTS,
  LAST_MODERATOR_ID INT REFERENCES ACCOUNTS,
  TAGS          VARCHAR
);
COMMENT ON COLUMN ARTICLES.CREATION_DATE IS 'ID аккаунта в таблице ACCOUNTS';
COMMENT ON COLUMN ARTICLES.HEADER IS 'Шапка статьи';
COMMENT ON COLUMN ARTICLES.CONTENT IS 'Содержимое статьи';
COMMENT ON COLUMN ARTICLES.CREATOR_ID IS 'ID пользователя создавшего статью';
COMMENT ON COLUMN ARTICLES.LAST_MODERATOR_ID IS 'Пользователь последний проводивший модерацию'

DROP TABLE ARTICLE_STATUSES;
CREATE TABLE ARTICLE_STATUSES
(
  ID INT PRIMARY KEY,
  NAME VARCHAR(20),
  DESCRIPTION VARCHAR(300)
);
COMMENT ON TABLE ARTICLE_STATUSES IS 'Таблица статусов статей';
COMMENT ON COLUMN ARTICLE_STATUSES.NAME IS 'Название статуса';
COMMENT ON COLUMN ARTICLE_STATUSES.DESCRIPTION IS 'Описание статуса статьи';

ALTER TABLE ARTICLES ADD STATUS_ID INT REFERENCES ARTICLE_STATUSES;
COMMENT ON COLUMN ARTICLES.STATUS_ID IS 'ID статуса статьи в таблице ARTICLE_STATUSES';

-- Таблицы, связанные с хранением документов и документооборотом
DROP TABLE DOCUMENTS;
CREATE TABLE DOCUMENTS
(
  ID            INT PRIMARY KEY,
  CREATOR_ID    INT REFERENCES ACCOUNTS,
  CREATION_DATE TIMESTAMP    NOT NULL,
  CONTENT       XML          NOT NULL,
  STATUS        VARCHAR(255) NOT NULL
);
COMMENT ON TABLE DOCUMENTS IS 'Таблица, хранящая различные документы';

-- Тип документа
CREATE TABLE DOCUMENT_TYPE
(
  ID                   INT PRIMARY KEY,
  DOC_TYPE_NAME        VARCHAR NOT NULL,
  DOC_TYPE_DESCRIPTION VARCHAR
);

ALTER TABLE DOCUMENTS
  ADD DOC_TYPE_ID INT REFERENCES DOCUMENT_TYPE;


-- Таблицы, связанные с задачами, заданиями блока подготовки к экзаменам
-- Категория задач
DROP TABLE TASK_CATEGORIES;
CREATE TABLE TASK_CATEGORIES
(
  ID                   INT PRIMARY KEY,
  CATEGORY_DEFINITION  VARCHAR(255) NOT NULL,
  CATEGORY_DESCRIPTION VARCHAR(255)
);
-- Предметы
DROP TABLE SUBJECTS;
CREATE TABLE SUBJECTS
(
  ID           INT PRIMARY KEY,
  SUBJECT_NAME VARCHAR NOT NULL
);
COMMENT ON TABLE SUBJECTS IS 'Предметы';
COMMENT ON COLUMN SUBJECTS.SUBJECT_NAME IS 'Название предмета';

-- Задачи
DROP TABLE TASKS;
CREATE TABLE TASKS
(
  ID            INT PRIMARY KEY,
  CREATION_DATE TIMESTAMP NOT NULL,
  CONTENT       JSON      NOT NULL,
  ANSWER        JSON      NOT NULL,
  TAGS          VARCHAR(255),
  SUBJECT_ID    INT REFERENCES SUBJECTS,
  CATEGORY_ID   INT REFERENCES TASK_CATEGORIES
);
COMMENT ON TABLE TASKS IS 'Задачи';
COMMENT ON COLUMN TASKS.CONTENT IS 'Условие задачи';
COMMENT ON COLUMN TASKS.ANSWER IS 'Ответ к задаче';
COMMENT ON COLUMN TASKS.TAGS IS 'Тэги к задаче';
COMMENT ON COLUMN TASKS.SUBJECT_ID IS 'ID предмета в таблице SUBJECTS';
COMMENT ON COLUMN TASKS.CATEGORY_ID IS 'Категория задач';

-- Достижения
DROP TABLE ACHIEVEMENTS;
CREATE TABLE ACHIEVEMENTS
(
  ID          INT PRIMARY KEY,
  NAME        VARCHAR(255) NOT NULL,
  DESCRIPTION VARCHAR(255) NOT NULL,
  ICON_LINK   VARCHAR(255) NOT NULL
);
COMMENT ON TABLE ACHIEVEMENTS IS 'Достижения, которые могут получить пользователи';
COMMENT ON COLUMN ACHIEVEMENTS.NAME IS 'Название достижения';
COMMENT ON COLUMN ACHIEVEMENTS.DESCRIPTION IS 'Описание достижения';
COMMENT ON COLUMN ACHIEVEMENTS.ICON_LINK IS 'Ссылка на иконку достижения в хранилище';

-- Достижения, полученные пользователями
DROP TABLE OBTAINED_ACHIEVEMENTS;
CREATE TABLE OBTAINED_ACHIEVEMENTS
(
  ID             INT PRIMARY KEY,
  ACCOUNT_ID     INT REFERENCES ACCOUNTS,
  ACHIEVEMENT_ID INT REFERENCES ACHIEVEMENTS,
  OBTAIN_DATE    TIMESTAMP NOT NULL
);
COMMENT ON TABLE OBTAINED_ACHIEVEMENTS IS 'Достижения, полученные пользователями';
COMMENT ON COLUMN OBTAINED_ACHIEVEMENTS.ACCOUNT_ID IS 'Ссылка на акаунт(пользователя), получившего достижение';
COMMENT ON COLUMN OBTAINED_ACHIEVEMENTS.ACHIEVEMENT_ID IS 'Ссылка на достижение, полученное аккаунтом(пользователем)';
COMMENT ON COLUMN OBTAINED_ACHIEVEMENTS.OBTAIN_DATE IS 'Дата получения достижения';

-- Тестовые варианты
DROP TABLE TRAINING_JOBS;
CREATE TABLE TRAINING_JOBS
(
  ID         INT NOT NULL,
  JOB_ID     INT NOT NULL,
  TASK_ID    INT NOT NULL REFERENCES TASKS,
  SUBJECT_ID INT NOT NULL REFERENCES SUBJECTS
);
COMMENT ON TABLE TRAINING_JOBS IS 'Варианты задний';


-- Конфигурационные, админские таблицы
DROP TABLE CONFIGURES;
CREATE TABLE CONFIGURES
(
  ID          INT          NOT NULL,
  NAME        VARCHAR(255) NOT NULL UNIQUE,
  VALUE       VARCHAR(255) NOT NULL,
  DESCRIPTION VARCHAR(255) NOT NULL,
  PRIMARY KEY (ID, NAME)
);
