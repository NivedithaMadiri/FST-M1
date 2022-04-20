def recadd(num) :
        if num :
            return num+recadd(num-1)
        else :
            return 0

result= recadd(22)
print(result)

