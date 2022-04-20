lst= list(input("Enter list of number :").split(","))
print("entered list :",lst)
firstnum=lst[0]
lastnum=lst[-1]

if firstnum==lastnum :
    print("true")
else :
    print("false")