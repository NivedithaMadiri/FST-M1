#lst= list(input("Enter the list of numbers:"))
lst= list(input("Enter the list of numbers:").split(","))
sum=0
for ls in lst :
    sum=sum+int(ls)
print(sum)


