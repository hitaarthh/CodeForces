n= int(input())
for i in range(n) :
    a,b,c= map(int, input().split()) 
    s1 = 0
    s1 = max(a,b)
    max1= max(s1,c) 
    if a==b==c :
       print()
    if a==b or b==c or c==a :
      print() 
    elif  a!=b!=c :
      if max1==a :
         print(0, max1-b+1 , max1-c+1)
      if(max1==b) :
         print(max1-a+1, 0 , max1-c+1)
      if(max1==c) :
         print(max1-a+1 , max1-b+1 , 0)
    
       


