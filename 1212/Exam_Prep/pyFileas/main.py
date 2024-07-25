## Oliver Ward
##



def less_than_Squares(num):
    i = 1; 
    while (i * i < num):
        if((i + 1 ) * (i +1) > num): 
            print(i)
        else: 
            print(i, end= ", ")
        i += 1
    return True

def smallest_Factor(num): 
    i = 2 
    if (num < 2): 
        print("Value too small")
        return
    while (num % i != 0):
        i += 1
    return i
 
    
j = 0
i = 0
while(i <= 3):
    while(j < i + 1): 
        if(j == i): 
            print("! ")
        else: 
            print("* ", end= "")
        j += 1
    i += 1
    j = 0


print()
less_than_Squares(27)
print(smallest_Factor(25))















