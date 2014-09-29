curl -i http://localhost:8080/users/ -X POST -H "Content-Type: application/json" -d '{ 
      "email" : "Kokil.Awas@gmail.com", 
      "password" : "kashvi" 
    }'

curl -i http://localhost:8080/users/ -X POST -H "Content-Type: application/json" -d '{ "email" : "Kokil.Awas@outlook.com", "password" : "mykashvi" }'

curl -i http://localhost:8080/users/1/idcard -X POST -H "Content-Type: application/json" -d '{ "cardname" : "santa clara PublicLibrary card", "cardnumber" : "11213323", "expirationdate" : "2014-12-31" }'

curl -i http://localhost:8080/users/1/idcard -X POST -H "Content-Type: application/json" -d '{ "cardname" : "San Jose PublicLibrary card", "cardnumber" : "11213323", "expirationdate" : "2014-12-31" }'

curl -i http://localhost:8080/users/1/idcard -X POST -H "Content-Type: application/json" -d '{ "cardname" : "Stanford PublicLibrary card", "cardnumber" : "11213323", "expirationdate" : "2014-12-31" }'

curl -i http://localhost:8080/users/2/idcard -X POST -H "Content-Type: application/json" -d '{ "cardname" : "Santa Clara PublicLibrary card", "cardnumber" : "11213323", "expirationdate" : "2014-12-31" }'

curl -i http://localhost:8080/users/2/idcard -X POST -H "Content-Type: application/json" -d '{ "cardname" : "San Jose PublicLibrary card", "cardnumber" : "11213323", "expirationdate" : "2014-12-31" }'
