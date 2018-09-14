Start hsqldb : docker run -d -p 9001:9001 --name hsqldb blacklabelops/hsqldb
Start mariadb : docker run --name some-mariadb -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mariadb