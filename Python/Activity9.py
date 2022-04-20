lst1 = list(input("Enter values for list1 :").split(","))
print("entered list1",lst1)
lst2 = list(input("Enter values for list2 :").split(","))
print("entered list1",lst2)
lst3=[]
for num in lst1 :
    if (int(num) %2 !=0) :
        lst3.append(num)
for num in lst2 :
    if (int(num)%2==0) :
        lst3.append(num)

print("New list3", lst3)