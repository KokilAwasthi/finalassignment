curl -i http://localhost:8080/users/1/bankaccount -X POST -H "Content-Type: application/json" -d '{ "account_name" : "My Bank of America Checking", "routing_number" : "121000358", "account_number" : "040834236" }'

curl -i http://localhost:8080/users/1/bankaccount -X POST -H "Content-Type: application/json" -d '{ "account_name" : "My bank of America Checking", "routing_number" : "131000359", "account_number" : "0408342234" }'
