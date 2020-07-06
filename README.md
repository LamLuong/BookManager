BookManager

Requirements
- maven
- jdk8
- mysql

Prepare database
create database name "bookstore" and make table

CREATE TABLE book (
  book_id INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY, \
  title VARCHAR(30) NOT NULL, \
  author VARCHAR(30) NOT NULL, \
  description VARCHAR(50), \
  published_date data \
)

To run project:
- git clone https://github.com/LamLuong/BookManager.git
- cd BookManager
- mvn clean package
- java -jar -debug target/BookManager-1.0.war
