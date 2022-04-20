def fibonacci(num) :
    if num<=1 :
        return num
    else :
        return fibonacci(num-1)+fibonacci(num-2)

user_input=int(input("Enter a number :"))
if user_input <0 :
    print("enter a positive number")
else :
    print("fibonacci sequence :")
    for i in range(user_input) :
        print(fibonacci(i))
        print()
