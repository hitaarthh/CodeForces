n = int(input()) ; r = 0
for i in range(n) : 
    a,b,c= map(int, input().split())
    if a==1 and b==1 or b==1 and c==1 or c==1 and a==1 or a==b==c==1 :
      r=r+1
print(r)      


