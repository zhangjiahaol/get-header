FROM zhangjiahaol/maven:3.3.9-jdk8u172
MAINTAINER jiahao.zhang
ENV LANG C.UTF-8
ENV TZ Asia/Shanghai
WORKDIR /app
COPY . .
EXPOSE 8080
RUN mvn clean install -Dmaven.test.skip=true
ENTRYPOINT ["java","-jar","target/get-header-1.0.jar"]
