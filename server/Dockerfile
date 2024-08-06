FROM eclipse-temurin:17-jdk-jammy as build

WORKDIR /app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

RUN ./mvnw dependency:go-offline -B

COPY src src

RUN ./mvnw package -DskipTests -B

FROM eclipse-temurin:17-jre-jammy

ARG UID=10001
RUN adduser \
	--disabled-password \
	--gecos "" \
	--home "/nonexistent" \
	--shell "/sbin/nologin" \
	--no-create-home \
	--uid "${UID}" \
	appuser

USER appuser

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
