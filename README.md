# active-mq-poc
Download and start active mq first.
To start active-mq navigate to ACTIVE_MQ_FOLDER\bin\win64 through cmd & hit this command:
activemq start


Test the application:
start the application and hit below endpoint along the json request.
http://localhost:8082/publish

RequestJson:
{
	"source":"Test",
	"msg":"Hello"
}

If everything is okay you'll get "Message successfully published." as a response & you'll be able to see the message printed in console.
