-- I USED H2 DATABASE FOR MYBATIS PRACTICE
CREATE TABLE MEMBER (
    MEMBER_ID NUMBER PRIMARY KEY
    , NAME VARCHAR2(127)
    , COMPANY_ID NUMBER
);

CREATE TABLE COMPANY (
    COMPANY_ID NUMBER PRIMARY KEY
    , NAME VARCHAR2(127)
);