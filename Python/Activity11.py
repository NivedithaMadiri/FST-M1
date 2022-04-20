fruitshop ={
    "apple" : 50,
    "grapes" :10,
    "banana": 20
}
user_input = input("what are you checking for").lower()
if user_input in fruitshop :
    print("Its available")
else :
    print("its not available")