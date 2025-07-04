# name = 'Abhishek'
# for i in name:
#   print(i)
#   if(i =="b"):
#     print("This is something special!")
    
# colors = ["Red", "Green", "Blue", "Yellow"]
# for color in colors:
#   print(color)
#   for i in color:
#     print(i)

# for k in range(5):
#   print(k + 1)
  
# for k in range(1, 20001):
#   print(k)

  
from pydoc import doc


for k in range(1, 12, 3):
  print(k)

i = int(input("Enter the number: "))
print(i)
while(i<=38):
  i = int(input("Enter the number: "))
  print(i)

print("Done with the loop")

# count = 5
# while (count > 0):
#   print(count)
#   count = count - 1
# else:
#   print("I am inside else")

# do
# {
#   loopbody;
# }
# while(condition);

# for i in range(12):
#   if(i == 10):
#     print("Skip the iteration")
#     continue
#   print("5 X", i, "=", 5 * i)
  
i = 0
while True:
  print(i)
  i = i + 1
  if(i%100 == 0):
    break