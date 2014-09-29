curl -i http://localhost:8080/users/1/weblogin -X POST -H "Content-Type: application/json" -d '{ "url" : "https://sjsu.instructure.com/", "login" : "009338667", "password" : "mysjsupassword" }'

curl -i http://localhost:8080/users/1/weblogin -X POST -H "Content-Type: application/json" -d '{ "url" : "https://yahoo_login/", "login" : "myyahoologin", "password" : "secret" }'
