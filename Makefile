default: build run

run:
	cat /dev/null > app1.log ; \
	java -jar target/app1-1.0-SNAPSHOT.jar ; \
	cat app1.log | jq .

build:
	mvn clean install
