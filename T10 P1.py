def sumoftwo():
    a=int(input("Enter number1:"))
    b=int(input("Enter number2:"))
    return a+b
def sumofthree():T10 P2
    a=int(input("Enter number1:"))
    b=int(input("Enter number2:"))
    c=int(input("Enter number3:"))
    return a+b
n=int(input("sum of two numbers or three numbers?"))
if(n==2):
    sum=sumoftwo()
if(n==3):
    sum=sumofthree()
if(sum>120 and sum<320):
    print(200)
else:
    print(sum)
