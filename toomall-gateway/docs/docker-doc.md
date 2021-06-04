docker run -d -p 8848:8848 -e MODE=standalone \
-v /opt/nacos/init.d/custom.properties:/home/nacos/init.d/custom.properties \
-v /opt/nacos/logs:/home/nacos/logs \
--restart always \
--name toomall-nacos nacos/nacos-server:1.3.1