def sum(numbers):
    sum_res = 0
    for number in numbers:
       sum_res += number
    return sum_res
numList = [10, 40, 60, 90]
#numList= list(input("Enter list of values:"))
result = sum(numList)
print("The sum of all the elements is: " + str(result))