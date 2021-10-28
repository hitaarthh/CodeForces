n= int(input())
for i in range(n) :
    a,b,c= map(int, input().split()) 
    s1 = 0
    s1 = max(a,b)
    max1= max(s1,c) 
    if(max1==a) :
       print(0)
       print(max1-b+1)
       print(max1-c+1)
    if(max1==b) :
       print(max1-a+1)
       print(0)
       print(max1-b+1)
    if(max1==c) :
       print(max1-a+1)
       print(max1-b+1)
       print(0)
       


