db.people.insert(
    {
    "sex": "Male",
    "first_name": "Maciej",
    "last_name": "Jabłoński",
    "job": "Lightning designer",
    "email": "jablonskim49@gmail.com",
    "location": {
        "city": "Warsaw",
        "address": {
            "streetname": "Świetna",
            "streetnumber": "49"
        }
    },
    "description": "I love American Football!",
    "height": "178",
    "weight": "78",
    "birth_date": "1998-22-02T01:02:03Z",
    "nationality": "Poland",
    "credit": [{
        "type": "lol",
        "number": "99999999999",
        "currency": "PLN",
        "balance": "0.0"
    }]
}
);
db.people.findOne({'first_name':'Maciej'})