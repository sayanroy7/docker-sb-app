FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./docker-sb-app-1.0.0.jar /app.jar
ENV INNER_PORT 8080
ENV DEBUG_PORT 18080
ENV JMX_PORT 28080

EXPOSE 8080 18080 28080

ENV EP_CFG "-Dmanagement.endpoints.web.base-path=/management/ -Dmanagement.endpoints.web.exposure.include=health,info,refresh,restart,env,metrics,loggers -Dmanagement.endpoint.health.show-details=always -Dmanagement.endpoint.health.restart.enabled=true"
ENV ARG_DEBUG "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=${DEBUG_PORT}"
ENV ARG_JMX "-Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=${JMX_PORT} -Dcom.sun.management.jmxremote.rmi.port=${JMX_PORT} -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false"

ENTRYPOINT ["java", "-Dmanagement.endpoints.web.base-path=/management/", "-Dmanagement.endpoints.web.exposure.include=health,info,refresh,restart,env,metrics,loggers", "-Dmanagement.endpoint.health.show-details=always", "-Dmanagement.endpoint.health.restart.enabled=true", "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=18080", "-Dcom.sun.management.jmxremote", "-Dcom.sun.management.jmxremote.port=28080", "-Dcom.sun.management.jmxremote.rmi.port=28080", "-Dcom.sun.management.jmxremote.authenticate=false", "-Dcom.sun.management.jmxremote.ssl=false", "-jar", "/app.jar"]
