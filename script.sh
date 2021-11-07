#!/bin/bash
set -x
MYSQL_PASSWORD=123
service mysql start
mysql -uroot -p$MYSQL_PASSWORD -e "CREATE USER 'ons'@'localhost' IDENTIFIED BY '123';GRANT ALL PRIVILEGES ON *.* TO 'ons'@'localhost' WITH GRANT OPTION;"
mysql -uroot -p$MYSQL_PASSWORD -e "CREATE USER 'ons'@'%' IDENTIFIED BY '123';GRANT ALL PRIVILEGES ON *.* TO 'ons'@'%' WITH GRANT OPTION;"
mkdir /log
sleep 5s 
java  -jar Timesheet-DOCKER-IMAGE.war