#lst = tuple(input("Enter list of numbers:"))
lst =(2,5,10,9,15)
print("Entered list" ,lst)
for num in lst :
    if int(num) % 5==0 :
        print(num)